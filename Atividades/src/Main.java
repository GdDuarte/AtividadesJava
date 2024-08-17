import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em Fahrenheit: ");
        double fahr = sc.nextDouble();
        double conta = (fahr - 32) * 5/9;
        System.out.printf("a conversão de Fahrenheit para Celsius é igual a: %.2f graus celsius", conta);
    }
}