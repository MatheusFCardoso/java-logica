package exercicio4;

import java.util.Scanner;

public class Trapezio
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamo calcular a área do trapézio !!");
        System.out.println("Qual é o valor da maior base ??");
        int n1 = in.nextInt();
        System.out.println("Qual é o valor da menor base ??");
        int n2 = in.nextInt();
        System.out.println("Qual é a altura do trapézio ??");
        int n3 = in.nextInt();
        System.out.println("A área do seu trapézio é " + (n1+n2)*n3/2);

        in.close();
    }
}
