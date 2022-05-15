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
    At first, the word or sentence is converted to lowercase and then we replace " " with ""
    Then, we do a for loop with 2 vars because we need to check the first letter with the last letter
    If the vars have the same value (char), the vars will increase and decrease their value (start and
    end respectively). If the vars have different value, the sentence or word is not a palindrome
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
