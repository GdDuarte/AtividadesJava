import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double num = sc.nextDouble();
        double conta1 = Math.pow(num, 2);
        double conta2 = Math.pow(num, 3);

        System.out.printf("O valor em potencia de 2 é igual a: %.2f%n", conta1);
        System.out.printf("O valor em potencia de 3 é igual a: %.2f%n", conta2);
    }
}
