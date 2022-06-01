package exercicio4;

import java.util.Scanner;

public class Paralelogramo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular a área do paralelogramo !!");
        System.out.println("Qual é a altura do seu paralelogramo ??");
        int n1 = in.nextInt();
        System.out.println("Qual é a base do seu paralelogramo ??");
        int n2 = in.nextInt();
        System.out.println("A área do seu paralelogramo é " + n1*n2);

        in.close();

    }
}
