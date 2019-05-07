package com.javasoso;

import org.apache.commons.lang3.StringUtils;

public class Test {
    public static void main(String[] args) {
        String a = "";
        if (StringUtils.isEmpty(a)){
            System.out.println("空");
        }else {
            System.out.println("非空");
        }



    }
}
