/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulo
 */
import java.util.Scanner;
public class Exercicio1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoSegundos = sc.nextInt();

        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        sc.close();
    }
}

