package com.example;

public class Test {

    public static void main(String[] args) {

        String m = "123456789abcdefghijkl";
        String f[] = {"1", "2", "a", "df", "9", "10"};
        for (int i = 0; i < f.length; i++) {
            m = m.replaceAll(f[i], "*");
            System.out.println(m);
        }

    }

}

