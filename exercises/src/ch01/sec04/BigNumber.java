package ch01.sec04;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        BigInteger big = BigInteger.valueOf(123);
        System.out.println(big);

        BigInteger fromNum = new BigInteger("12345");
        System.out.println(fromNum);
    }
}
