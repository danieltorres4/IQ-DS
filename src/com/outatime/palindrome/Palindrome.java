package com.outatime.palindrome;

public class Palindrome {
    private String sentence;

    /*
    Constructor
     */
    public Palindrome(String sentence) {
        this.sentence = sentence;
    }

    /*
    Getter and setter
     */
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    /*
    Method
     */
    public String isPalindrome(){
        String newSentence = sentence.toLowerCase().replace(" ","");

        for (int start = 0, end = newSentence.length() - 1; start < end; start++, end--){
            if(newSentence.charAt(start) != newSentence.charAt(end)){
                return "Your sentence or word is not a palindrome";
            }
        }

        return "Your sentence or word is a palindrome";
    }
}
