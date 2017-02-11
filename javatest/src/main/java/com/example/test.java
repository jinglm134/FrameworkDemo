package com.example;

import java.math.BigDecimal;

public class test {
   /* public static void main(String[] args) {
        String data = "人民币";
        String key = "sdffffffffffffffffffffffffffffffffffffffffffffffffffffffweeeeeeeeeeeee";
        for (int i = 1; i < key.length(); i++) {
            byte[] by = key.substring(0, i).getBytes();
            System.out.print(by);
            byte[] b;
            try {
                b = encrypt(data.getBytes(), by);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            System.out.print(b.toString());
        }
    }

    public static byte[] encrypt(byte[] data, byte[] key) throws Exception{
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "DES");

        Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, new SecureRandom());




        return cipher.doFinal(data);
    }*/

    public static void main(String[] args) {
       /* float f1=289.524f;
        float f2 = 3.523f;
        System.out.print(f1-f2);*/

         double d1=23000.523;
        double d2 = 3.523;
        System.out.println(d1+d2);

        BigDecimal b1=BigDecimal.valueOf(d1);
        System.out.println(BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)));


        System.out.println(2.113f-0.013);


        System.out.println(0.11+2001299.32);//非精确的输出
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(0.11));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(2001299.32));
        System.out.println(bigDecimal1.add(bigDecimal2));//精确的输出

        double d3=0.11;
        double d4=1001299.32;
        System.out.println(d3+d4);

    }
}
