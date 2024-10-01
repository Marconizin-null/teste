import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner.*;
//Exercicio Criar um array que recebe uma variavel e retorna uma lista com os multiplos da variavel
public class array {
/*Classe filha recebe as variaveis de numero e tamanho*/
    public static int[] getMultiplos(int num, int length) {
        /*Cria o array e recebe o tamanho da variavel*/
        int[] multiplo = new int[length];
        /*Contador para o valor inserido*/
        for (int i = 0; i < length; i++) {
            multiplo[i] = num * (i + 1);
        }
        /*Retorna o vetor*/
        return multiplo;
    }
    /*Classe mãe*/
    public static void main(String[] args) {
        System.out.println("Insira o primeiro valor:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Insira o segundo valor:");
        Scanner sc2 = new Scanner(System.in);
        /*variavel para o tamanho do array*/
        int length = sc2.nextInt();
        /*variavel resultado puxa a função da classe filha*/
        int[] result = getMultiplos(num, length);
        System.out.println(Arrays.toString(result)); /*Retorna o Resultado em String*/
    }
}