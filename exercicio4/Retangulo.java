package exercicio4;

import java.util.Scanner;

public class Retangulo
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular a área do retângulo !!!");
        System.out.println("Qual é altura do seu retângulo ??");
        int n1 = in.nextInt();
        System.out.println("Qual é altura do seu retângulo ??");
        int n2 = in.nextInt();
        System.out.println("A área do seu retângulo é " + n1*n2 );

        in.close();
    }
}
