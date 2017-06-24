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
import java.util.Scanner;

public class p3q3 {

    public static void main(String[] args) {

        int[] quantity = new int[6];
        int[] value = new int[6];
        int[] denomination = {100, 50, 20, 10, 5, 1};
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Denomination (RM)\tQuantity");

        for (int i = 0, j = 100; i < 6; i++) {
            System.out.print("\t" + denomination[i] + "\t\t    ");
            quantity[i] = scanner.nextInt();
            value[i] = quantity[i] * denomination[i];
            total += value[i];
        }
        clearConsole();
        System.out.println("Denomination (RM)\tQuantity\tValue");
        for (int i = 0, j = 100; i < 6; i++) {

            if (value[i] != 0) {
                System.out.println("\t" + denomination[i] + "\t\t    " + quantity[i] + "\t\t " + value[i]);

            }
        }
        System.out.print("Total = RM " + total);
    }
    
    //It will not clear the console if you are running inside an IDE.
    public final static void clearConsole(){
        try{
            final String os = System.getProperty("os.name");
            
            if(os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }
            else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch(final Exception e){
            
        }
    }
}
