import java.util.Scanner;

//Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
public class Exercicio8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        double n1 = in.nextInt();
        System.out.println("Digite outro número");
        double n2 = in.nextInt();

        while(n2 <= 0){
            System.out.println("O segundo número é 0 ou menor que 0");
            n2 = in.nextInt();
        }
        
        System.out.println("A divisão desses valores é " + n1/n2);

        in.close();
    } 
    
}
