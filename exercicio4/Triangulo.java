package exercicio4;

import java.util.Scanner;

public class Triangulo
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular a área do triângulo");
        System.out.println("Qual é altura do seu triângulo ?");
        int n1 = in.nextInt();
        System.out.println("Qual é a base do seu triângulo ?");
        int n2 = in.nextInt();
        System.out.println("A área do seu triângulo é " + (n1*n2)/2 );

        in.close();
    }
}
