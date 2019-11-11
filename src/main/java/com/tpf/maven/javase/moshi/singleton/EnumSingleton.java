package com.tpf.maven.javase.moshi.singleton;

/**
 * 枚举单例
 */
public class EnumSingleton {

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.GetInstance();
    }

    private EnumSingleton() {
    }

    private static enum Singleton {
        INSTANCE;
        private EnumSingleton singleton;

        private Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton GetInstance() {
            return singleton;
        }
    }
}
