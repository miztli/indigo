package com.indigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by miztli on 22/02/18.
 */
public class PalindromeSeries {
    private static final int MAX_PALINDROME_NUMBER = 1000000;
    private static final String MAX_PALINDROME_NUMBER_EXCEPTION = String.format("Number must be less than: %d", MAX_PALINDROME_NUMBER);
    private static final int MIN_PALINDROME_NUMBER = 101101;
    private static final String MIN_PALINDROME_NUMBER_EXCEPTION = String.format("Number must be greater than: %d", MIN_PALINDROME_NUMBER);
    private static final String PALINDROME_NOT_FOUND = String.format("There is no available result");

    public static void main(String[] args) {
        PalindromeSeries palindromeSeries = new PalindromeSeries();

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type test cases number:");
        int testCases = scanner.nextInt();
        List<Integer> savedResults = new ArrayList(testCases);

        for (int i = 0; i < testCases; i++) {
            int number = scanner.nextInt();
            int closerPalindrome = palindromeSeries.getCloserPalindrome(number);
            if(closerPalindrome>0) savedResults.add(closerPalindrome);
        }
        savedResults.forEach(result -> System.out.println(result));
    }

    public int getCloserPalindrome(int number){
        if(number >= MAX_PALINDROME_NUMBER) throw new IllegalArgumentException(MAX_PALINDROME_NUMBER_EXCEPTION);
        if(number <= MIN_PALINDROME_NUMBER) throw new IllegalArgumentException(MIN_PALINDROME_NUMBER_EXCEPTION);
        for (int j = number-1; j > 100000 ; j--) {
            if(isPalindrome(j)){
                for(int x = 999; x > 100; x--){
                    for(int y = 999 ; y>100; y--){
                        int product = y*x;
                        if(j == product){
                            return product;
                        }
                    }
                }
            }
        }
        throw new IllegalArgumentException(PALINDROME_NOT_FOUND);
    }


    public boolean isPalindrome(int number){
        if(number < 0) return false;
        String stringNumber = String.valueOf(number);
        if(!isEven(number)) return false;

        StringBuilder palindrome = new StringBuilder();
        for (int i = stringNumber.length() - 1; i >= 0; i--) {
            palindrome.append(stringNumber.charAt(i));
        }
        return palindrome.toString().equals(stringNumber);
    }

    public boolean isEven(int number){
        if(number < 0) return false;
        String stringNumber = String.valueOf(number);
        return (stringNumber.length()) %2 == 0;
    }

}
