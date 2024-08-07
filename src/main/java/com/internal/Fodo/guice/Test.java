package com.internal.Fodo.guice;

import com.google.inject.Inject;

public class Test {

    @Inject
    static Sender sender;

    public static void main(String[] args) {
        sender.send();
        System.out.println("0");
        System.out.println("3");
        System.out.println("1");
        System.out.println("2");
    }
}
