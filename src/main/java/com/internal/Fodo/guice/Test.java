package com.internal.Fodo.guice;

import com.google.inject.Inject;

public class Test {

    @Inject
    static Sender sender;

    public static void main(String[] args) {
        sender.send();
        System.out.println("0");
    }
}
