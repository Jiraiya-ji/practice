```
1）浅拷贝
创建一个新对象，然后将当前对象的非静态字段复制到该对象，如果字段类型是值类型（基本类型）
的，那么对该字段进行复制；如果字段是引用类型的，则只复制该字段的引用而不复制引用指向的对
象。此时新对象里面的引用类型字段相当于是原始对象里面引用类型字段的一个副本，原始对象与新
对象里面的引用字段指向的是同一个对象

2）深拷贝
a.
类重写clone()方法，对于引用类型成员变量，重新在堆中开辟新的内存空间，简单地说，将引用类
型的属性内容也拷贝一份新的
适用于引用类型较少的对象，不太适用于引用类型内部还有引用类型
b.
这种方式其实就是将对象转成二进制流，然后再把二进制流反序列成一个java对象，这时候反序列化
生成的对象是一个全新的对象，里面的信息与原对象一样，但是所有内容都是一份新的

3）复制对象和复制引用的区别
其实string类型也是引用类型，不是基本类型，那上面的例子中，修改拷贝对象person的name后，原
对象的name值并没有改变，这是什么原因呢
答：其实string也是引用类型，在深复制时并没有进行单独复制，仅仅复制了引用，String并没有实现
cloneable接口，之所以修改新克隆对象的name值后，

原对象的name对应的值没有改变，是因为String在内存中是不可以改变的对象，我们在修改新对象（或
者原对象）的name值时，会新分配一块内存保存新修改的name值，新对象的引用（或者原对象的引用）会指向新的内存空间，原来的String 还会存在它的引用name,如果String的值不存在引用，会被回收，也因为原来的String值存在引用name，所以不会被回收，这样，可以解释上面的demo中，name虽然是String引用类型，但是修改name的值，并没有改变原对象的name值
参考：https://www.cnblogs.com/nickhan/p/8569329.html
```