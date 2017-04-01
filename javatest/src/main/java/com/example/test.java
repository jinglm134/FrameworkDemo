package com.example;

public class Test {

    public static void main(String[] args) {
        String messageStr = "牛牛jdjsn=牛牛屌屌屌   牛牛";
        messageStr = messageStr.replaceAll("牛牛", "**");
        System.out.print(messageStr);
    }

}

