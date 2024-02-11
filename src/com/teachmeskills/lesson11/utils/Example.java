package com.teachmeskills.lesson11.utils;

public class Example {

    public static void firstTask(String str) {
        String[] array = str.split("-");
        str = array[0] + "-" + array[2];
        System.out.println(str);
    }

    public static void secondTask(String str) {
        String[] array = str.split("-");
        str = str.replace(array[1], "***").replace(array[3], "***");
        System.out.println(str);
    }

    public static String thirdTask(String str){
        String[] array = str.split("-");
        str = (array[1] +"/"+array[3]+"/"+array[4].charAt(1)+"/"+array[4].charAt(3)).toLowerCase();
        System.out.println(str);
        return str;
    }

    public static void fourthTask(String str){
        StringBuilder sb = new StringBuilder();
        String s = "Letters:".toUpperCase();
        sb.append(s);
        str = thirdTask(str).toUpperCase();
        sb.append(str);
        System.out.println(sb);
    }

    public static void fifthTask(String str){
        if (str.toLowerCase().contains("abc")){
            System.out.println("Последовательность 'abc' есть");
        }else {
            System.out.println("Последовательности 'abc' нет");
        }
    }

    public static void sixthTask(String str){
        if (str.startsWith("555")){
            System.out.println("Начинается на последовательность '555' ");
        }else {
            System.out.println("Не начинается на последовательность '555'");
        }
    }
    public static void seventhTask(String str){
        if (str.endsWith("1a2b")){
            System.out.println("Заканчивается на последовательность '1a2b' ");
        }else {
            System.out.println("Не заканчивается на последовательность '1a2b'");
        }
    }

    public static void minMaxWord(String str){
        System.out.println("\n"+str);
        String[] a = str.split(" ");
        int min = a[0].length();
        int max = a[0].length();
        String minStr ="",maxStr="";
        for (int i = 0; i < a.length; i++) {
            if (min > a[i].length()){
                min = a[i].length();
                minStr = a[i];
            }else if (max <= a[i].length()){
                max = a[i].length();
                maxStr = a[i];
            }
        }
        System.out.println("min - "+ min + " max - " + max);
        System.out.println("minStr - "+ minStr + " maxStr - " + maxStr);
        for (String agr:a){
            System.out.print(agr.length() + " ");
        }
    }

    public static void dublicate(String str){
        System.out.println("\n" + str);
        char[] strCharArray = str.toCharArray();
        StringBuilder a = new StringBuilder();
        for (char c: strCharArray){
            if (c != ' ' & c != '-'){
                a.append(c).append(c);
            }else {
                a.append(" ");
            }
        }
        System.out.println(a);
    }

}
