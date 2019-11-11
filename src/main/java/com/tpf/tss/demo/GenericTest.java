package com.tpf.tss.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> </p>
 *
 * @version : $Id GenericTest.java,v 1.0, 2018/4/25-18:25 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class GenericTest {
    public static void main(String[] args) throws Exception{
        List<String> strList = new ArrayList<String>();

        strList.add("aaa");
        strList.add("bbb");

        strList.getClass().getMethod("add", Object.class).invoke(strList, 12345);
        System.out.println(strList);
    }

}