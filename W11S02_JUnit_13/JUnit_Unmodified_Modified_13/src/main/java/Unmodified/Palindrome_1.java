/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unmodified;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author 
 */
public class Palindrome_1 {
    public String methodPalindrome_1(int n1){
        String hasil;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r, n2;
        int rev=0;
        n2=n1;
        while(n1>0){
            r = n1%10;
            rev = rev*10+r;
            n1 = n1*10;
        }
        if(rev==n2){
            hasil = "palindrome number!";
        } else{
            hasil = "NOT palindrome number!";
        }
        return hasil;
    }
    
}