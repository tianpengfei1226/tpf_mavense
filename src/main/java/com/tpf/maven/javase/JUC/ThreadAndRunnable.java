package com.tpf.maven.javase.JUC;

/**
 * 线程测试类
 */
public class ThreadAndRunnable {
    public static void main(String[] args) {
        //文件
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable .......");
            }
        }) {
            @Override
            public void run() {
                System.out.println("thread .....");
            }
        }.start();
    }
}