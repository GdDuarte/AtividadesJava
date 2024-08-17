import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do triangulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do triangulo: ");
        double altura = sc.nextDouble();
        double conta = (base * altura)/2;
        System.out.printf("A area do triangulo %.2f", conta);
    }
}
