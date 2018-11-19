/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author cc2_1h-25
 */
import java.util.*;
public class JavaApplication7 {

    
    public static void main(String[] args) {
        display();
    }
    
    public static int input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input desired number: ");
        int num = in.nextInt();
        return num;
    }
    
    public static int algo(int num){
        if(num <= 1){
            return num;
        }else{
            return algo(num-1)+algo(num-2);
        }
    }
    
    public static void display(){
        int x = input();
        
        for(int i = 0 ; i<=x ; i++){
            System.out.print("f("+i+") \t");
        }
        
        System.out.println("");
        
        for(int i = 0 ; i <= x ;i++){
            for(int xy = 0 ; xy <= i ; xy++){
                System.out.print(algo(xy) + " \t");
            }
            System.out.println("");
        }
    }
    
}
