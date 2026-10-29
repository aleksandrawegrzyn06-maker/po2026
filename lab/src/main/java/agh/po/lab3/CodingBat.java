package agh.po.lab3;

import java.util.Arrays;

public class CodingBat {

    public int sumDigits(String str) {
        int suma = 0;

        for (int i = 0; i < str.length(); i++) {
            char znak = str.charAt(i);

            if (Character.isDigit(znak)) {
                suma += Character.getNumericValue(znak);
            }
        }

        return suma;
    }

    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public int stringMatch(String a, String b) {
        int licznik = 0;
        int dlugosc = Math.min(a.length(), b.length());

        for (int i = 0; i < dlugosc - 1; i++) {
            String fragmentA = a.substring(i, i + 2);
            String fragmentB = b.substring(i, i + 2);

            if (fragmentA.equals(fragmentB)) {
                licznik++;
            }
        }

        return licznik;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int pierwszy = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = pierwszy;

        return nums;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1
                    && nums[i + 2] == nums[i + 1] + 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        CodingBat test = new CodingBat();

        // nearHundred
        System.out.println(test.nearHundred(93));
        System.out.println(test.nearHundred(150));
        System.out.println(test.nearHundred(205));

        // lastDigit
        System.out.println(test.lastDigit(7, 17));
        System.out.println(test.lastDigit(6, 17));
        System.out.println(test.lastDigit(3, 113));

        // stringMatch
        System.out.println(test.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(test.stringMatch("abc", "abc"));
        System.out.println(test.stringMatch("abc", "axc"));

        // shiftLeft
        System.out.println(Arrays.toString(
                test.shiftLeft(new int[]{6, 2, 5, 3})));

        System.out.println(Arrays.toString(
                test.shiftLeft(new int[]{1, 2})));

        System.out.println(Arrays.toString(
                test.shiftLeft(new int[]{1})));

        // tripleUp
        System.out.println(test.tripleUp(new int[]{1, 4, 5, 6, 2}));
        System.out.println(test.tripleUp(new int[]{1, 2, 3}));
        System.out.println(test.tripleUp(new int[]{1, 2, 4}));
    }
}