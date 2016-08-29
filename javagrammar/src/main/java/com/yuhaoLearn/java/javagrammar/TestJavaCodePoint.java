
package com.yuhaoLearn.java.javagrammar;

public class TestJavaCodePoint {

    public static void main(String[] args) {
        String eng = "\uD835\uDD6B"; // this is a supplementary character.
        String chn = "中国人卐✪\u20154";// these are basic multilingual plane.
        System.out.println(eng.length());// it is 2
        System.out.println(eng.codePointCount(0, eng.length()));// count code point is 1
        System.out.println(eng.codePointAt(1));
    }

}
