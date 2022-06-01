package exercicio4;

import java.util.Scanner;

public class Circulo
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular a área do círculo");
        System.out.println("Qual é o raio do seu círculo ??");
        int n1 = in.nextInt();
        System.out.println("A área do seu círculo é " + (n1*n1)*3.14);
        System.out.println();

        in.close();
    }
}
