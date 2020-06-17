package com.example.testdemo.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

//方法测试类
@Dougest("annotation Dougest at class ")
public class TestAnnotation {
    @Dougest("annotation Dougest at field")
    String a = "2";
    @Dougest
    int b = 10000000;

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        TestAnnotation testAnnotation = new TestAnnotation();
        testAnnotation.a = "123";
        System.out.println(getObjectFieldsValue(testAnnotation));//结果 ==> {a=123, b=10000000}
        System.out.println(getObjectFieldValueByFieldName(testAnnotation,"a"));//结果 ==> 123
        System.out.println(getFieldValueByAnnotation(Dougest.class, testAnnotation));//结果 ==> {a=123, b=10000000}
        Dougest d = (Dougest)TestAnnotation.class.getAnnotation(Dougest.class);//结果 ==>
        System.out.println(d.value());//结果 ==> annotation Dougest at class
    }

    /**
     * 获取指定对象指定注解下属性值
     * @param annotation
     * @param obj
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static Object getFieldValueByAnnotation(Class<? extends Annotation> annotation, Object obj) throws IllegalArgumentException, IllegalAccessException{
        if(obj == null)
            throw new RuntimeException("cannot getFieldValueByAnnotation for null Object");
        if(annotation == null)
            throw new RuntimeException("cannot getFieldValueByAnnotation for null annotation");
        Map<String,Object> map = new HashMap<String,Object>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field field : fields) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(annotation)) {
                map.put(field.getName(),field.get(obj));
            }
        }
        return map;
    }

    /**
     * 获取对象属性值
     * @param obj
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @SuppressWarnings("rawtypes")
    public static Map<String,Object> getObjectFieldsValue(Object obj) throws IllegalArgumentException, IllegalAccessException {
        if(obj == null)
            throw new RuntimeException("cannot getObjectFieldsValue for null Object");
        Map<String,Object> map = new HashMap<String,Object>();
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }
        return map;
    }
    /**
     * 获取对象属性名获取属性值
     * @param obj
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @SuppressWarnings("rawtypes")
    public static Object getObjectFieldValueByFieldName(Object obj,String fieldName) throws IllegalArgumentException, IllegalAccessException {
        if(obj == null)
            throw new RuntimeException("cannot getObjectFieldValueByFieldName for null Object");
        if(fieldName == null || "".equals(fieldName.trim()))
            throw new RuntimeException("cannot getObjectFieldValueByFieldName for null fieldName");
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            field.setAccessible(true);
            if(fieldName.equals(field.getName()))
                return field.get(obj);
        }
        return null;
    }
}
