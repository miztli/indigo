package com.indigo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by miztli on 22/02/18.
 */
public class SeriesProduct {
    private static final int MAX_CONSECUTIVE_DIGITS = 7;
    private static final String MAX_CONSECUTIVE_DIGITS_EXCEPTION = String.format("Digits number must be less than: %d", MAX_CONSECUTIVE_DIGITS);
    private static final int MIN_CONSECUTIVE_DIGITS = 1;
    private static final String MIN_CONSECUTIVE_DIGITS_EXCEPTION = String.format("Digits number must be greater than: %d", MIN_CONSECUTIVE_DIGITS);
    private static final long MAX_NUMBER = 1000L;
    private static final String MAX_NUMBER_EXCEPTION = String.format("Number must be less than: %d", MAX_NUMBER);
    private static final String MIN_NUMBER_EXCEPTION = String.format("Number must be greater than: digits");

    public long getMaxProduct(int numberSize, int subsetSize, long number){
        if(subsetSize >= MAX_CONSECUTIVE_DIGITS) throw new IllegalArgumentException(MAX_CONSECUTIVE_DIGITS_EXCEPTION);
        if(subsetSize <= MIN_CONSECUTIVE_DIGITS) throw new IllegalArgumentException(MIN_CONSECUTIVE_DIGITS_EXCEPTION);
        if(subsetSize > number) throw new IllegalArgumentException(MIN_NUMBER_EXCEPTION);

        String stringNumber = String.valueOf(number);
        IntStream numberStream = stringNumber.chars();
        int[] digits = numberStream.map(digit -> digit-'0').toArray();
        int totalSubsets = numberSize - subsetSize + 1;

        long maxProduct = 0;

        for (int j = 0; j < totalSubsets; j++) {
            int[] subset = new int[subsetSize];

            subset = Arrays.copyOfRange(digits, j, subsetSize+j);
            long product = 1;
            for (int x: subset) {
                product *= x;
            }
            if(product>maxProduct) maxProduct=product;
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        SeriesProduct seriesProduct = new SeriesProduct();

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type test cases number:");
        int testCases = scanner.nextInt();
        List<Long> savedResults = new ArrayList(testCases);

        for (int i = 0; i < testCases; i++) {
//            System.out.println("Type number size and subset size:");
            int numberSize = scanner.nextInt();
            int subsetSize = scanner.nextInt();
//            System.out.println("Type number:");
            long number = scanner.nextLong();
            savedResults.add(seriesProduct.getMaxProduct(numberSize, subsetSize, number));
        }
        savedResults.forEach(result -> System.out.println(result));
    }
}
