import java.util.Scanner;

//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
public class Exercicio3
{
    public static void main(String[]args)
    {
        System.out.println("Qual é o seu nome ??");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        System.out.println("Qual é a sua idade ??");
        int idade = in.nextInt();

        System.out.println("Olá, " +nome+ ", sua idade é " + idade);


        in.close();
    }
}
