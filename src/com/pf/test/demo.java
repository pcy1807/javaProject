package com.pf.test;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的序号，判断相关职业");
        System.out.println("0.会计");
        System.out.println("1.程序员");
        System.out.println("2.教师");
        System.out.println("3.律师");

        int type = scan.nextInt();
        String profession = (type==0?"会计":"程序员");
        System.out.println(profession);
    }
}



