package com.myth;

/**
 * Hello world!
 */
public class ILoveYou {
    public static void main(String[] args) {
        String[] ss = null;// 用来保存第一行的各项
        String str = "01001001 01001100 01001111 01010110 01000101 01011001 01001111 01010101";
        ss = str.split(" ");// 每一行的各项用空格分开
        for (String s : ss) {
            int numasc = Integer.parseInt(s, 2);
            System.out.print((char) numasc);// 强制转换成char类型，并输出
        }
    }
}
