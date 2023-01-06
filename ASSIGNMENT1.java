/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;
 import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 *
 * @author regodoncm
 */
public class Expressions {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student number: ");
        String studentNum = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("09+[0-9]{9}");
        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student number");
        } else {
            System.out.println("invalid student number");
        }
       
         System.out.print("Enter email address: ");
        String studentEm = scan.nextLine();

 

        // Long method
         pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
         matcher = pattern.matcher(studentEm);

 

         match = matcher.matches();

 

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }
    }
    
}
