package com.tpf.maven.javase.moshi.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
        System.out.println(enumSingleton1 == enumSingleton2);
    }
}
