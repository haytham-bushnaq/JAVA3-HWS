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
public class Part2 {
    
    public int one() throws ArithmeticException {

        int a = 12, b = 0;
        int c = two(a, b);
        return c;
    }

    public int two(int a, int b) {
        int c1 = a / b;
        return c1;
    }
}
