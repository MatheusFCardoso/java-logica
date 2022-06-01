package exercicio4;

import java.util.Scanner;

public class Quadrado 
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular a área do quadrado !!!");
        System.out.println("Qual é o valor de um dos lados do seu quadrado ??");
        int n1 = in.nextInt();
        System.out.println("A área do seu quadrado é " + n1 * n1  );

        in.close();
    }
}
