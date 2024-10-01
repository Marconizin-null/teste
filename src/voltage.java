/*Exercicio 3
Create a function that takes voltage and current and returns the calculated power.*/
import javax.xml.transform.Result;
import java.util.Scanner;
import java.io.*;
import java.math.*;
public class voltage {
    public static void main(String[] args) {
        System.out.println("Insert Voltage: ");
        Scanner sc = new Scanner(System.in);
        float voltage1 = sc.nextFloat();
        System.out.println("Insert Power: " );
        Float power = sc.nextFloat();
        Float a = voltage1 * power;
        System.out.print("Result:");
        System.out.print(a);

    }
}
