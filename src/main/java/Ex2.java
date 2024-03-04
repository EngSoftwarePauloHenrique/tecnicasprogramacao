/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulo
 */
import java.io.IOException;
import java.util.Scanner; 
public class Ex2 {
   public static void main(String[] args) throws IOException {
 
       try (Scanner scanner = new Scanner(System.in)) {
           int A = scanner.nextInt();
           int B = scanner.nextInt();
           int C = scanner.nextInt();
           int D = scanner.nextInt();
           
           if ((B > C) && (D > A) && (C + D > A + B) && (C > 0) && (D > 0) && (A % 2 == 0)) {
               System.out.println("Valores aceitos");
           } else {
               System.out.println("Valores nao aceitos");
           }
       }
    }
}  

