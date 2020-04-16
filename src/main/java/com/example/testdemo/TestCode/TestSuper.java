package com.example.testdemo.TestCode;

public class TestSuper {
}
class Game{
    Game(int i){
        System.out.println("Game");
    }
}
class BoardGame extends Game{
    BoardGame(int i) {
        super(i);
    }
}