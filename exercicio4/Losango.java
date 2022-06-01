package exercicio4;

import java.util.Scanner;

public class Losango 
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular a área do losangolo");
        System.out.println("Qual é o maior lado do seu losangolo ?");
        int n1 = in.nextInt();
        System.out.println("Qual é o menor lado do seu losangolo ?");
        int n2 = in.nextInt();
        System.out.println("O seu losangolo tem área de " + (n1*n2)/2 );

        in.close();
    }
}
