import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        double imc = peso/(altura*2);
        System.out.printf("Seu IMC é igual a: %.2f%n", imc);
    }
}
