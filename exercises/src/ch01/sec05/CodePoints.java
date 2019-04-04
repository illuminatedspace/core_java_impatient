package ch01.sec05;

public class CodePoints {
    public static void main(String[] args) {
        String str = "Hello World!";

        int length = str.length();
        System.out.println(length);

        char ch = str.charAt(2);
        System.out.println(ch);

        int codePoint = str.codePointAt(2);
        System.out.println(codePoint);

        int adjCodePoint = str.codePointAt(str.offsetByCodePoints(2, 0));
        System.out.println(adjCodePoint);

        int[] codePoints = str.codePoints().toArray();
        System.out.println(codePoints);
    }
}
