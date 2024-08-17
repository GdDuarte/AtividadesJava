import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        //Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em celsius: ");
        double cels = sc.nextDouble();
        double conta = (cels * 9/5)+32;
        System.out.printf("A converção de celsius para fahrenheit é: %.2f graus fahrenheit", conta);
    }
}
