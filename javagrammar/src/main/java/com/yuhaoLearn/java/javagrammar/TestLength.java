
package test;

public class TestLength {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String eng = "\uD835\uDD6B";
        String chn = "中国人卐✪\u20154";
        System.out.println(eng.length());
        System.out.println(eng.codePointCount(0, eng.length()));
        System.out.println(eng.codePointAt(1));
    }

}
