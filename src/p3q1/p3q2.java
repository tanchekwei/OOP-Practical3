/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3q1;

/**
 *
 * @author Tan Chek Wei
 * @ID 1602116
 * @DCO2 DD4
 * 
 */
import java.lang.Math;
public class p3q2 {
    public static void main(String[] args) {
        int[] list = {1, 2, 4, 5, 10, 100, 2, -22};
        
        int index = returnSmallestElement(list);
        System.out.println("Index of smallest number in array is " + index);
    }
    
    public static int returnSmallestElement(int[] array){
        int min = 999, index = 0;
        for(int i = 0; i < array.length; i++){
            min = Math.min(min, array[i]);
        }
        
        for(int i = 0; i < array.length; i++){
            if(min == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
