/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3hw2Part2;

/**
 *
 * @author LAPTOP
 */
public class Main {
    
    public static void main(String[] args) {
     

        try {
           
            Part2 ob = new Part2();
            int res = ob.one();
            System.out.println("the result is "+res);

        } catch (ArithmeticException e) {
            System.out.println("Error found" + e.getMessage());

        }
    }
}
