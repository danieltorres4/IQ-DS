package com.outatime.test;

import com.outatime.palindrome.Palindrome;

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("If you want to know if a sentence is a palindrome, then you have to write it to discover it: ");
        String s1 = console.nextLine();
        Palindrome palindrome = new Palindrome(s1);

        System.out.println(palindrome.isPalindrome());

    }
}
