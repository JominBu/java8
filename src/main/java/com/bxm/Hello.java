package com.bxm;


/**
 * Created by buxiaoming on 2017/4/20.
 */
public class Hello {

    Runnable r1 = () -> {
        System.out.println(this);
    };
    Runnable r2 = () -> {
        System.out.println(toString());
    };
    private Runnable r3;

    public String toString() {
        return "Hello world";
    }

    public static void main(String[] args) {
        new Hello().r1.run();
        new Hello().r2.run();
        Hello hello = new Hello();
        hello.r3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(this);
            }
        };
        hello.r3.run();
    }

}
