package com.hemanth.problemsolving.strings;

public class ReverseStringLeetcode344 {

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'm', 'a', 'n', 't', 'h'};

        reversString(s);

    }

    public static void reversString(char[] s) {

        int i = 0;
        int j = s.length - 1;


        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
