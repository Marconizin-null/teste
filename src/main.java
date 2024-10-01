import java.util.Scanner;
import java.io.*;
import java.math.*;
/*Exercicio 1
Calcular soma de 2 numeros
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Soma de dois numeros:");
        System.out.println("Digite o primeiro numero");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        int i = num1 + num2;
        System.out.println("Resultado");
        System.out.println(i);


    }
}
