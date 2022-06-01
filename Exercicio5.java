import java.util.Scanner;

//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
public class Exercicio5
{
    public static void main(String[] args)
    {   
        Scanner in = new Scanner(System.in);
        System.out.println("Me informe um número");   
        int n1 = in.nextInt();

        if(n1 > 0){
            System.out.println("Seu número é positivo");
        }else if( n1 < 0){
            System.out.println("Seu número é negativo");
        }else{
            System.out.println("Seu número é ZERO");
        }

        in.close();
    }
}