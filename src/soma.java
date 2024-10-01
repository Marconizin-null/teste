import java.util.Scanner;
import java.io.*;
import java.math.*;
/*
Exercicio 2 Converter minutos para segundos
 */
public class soma {
    public static void main(String[] args) {
        System.out.println("Conversor para minutos");
        System.out.print("Digite o valor para converter de minutos a segundos:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a * 60;
        System.out.print("Valor convertido para segundos é: ");
        System.out.println(b);
    }
}
