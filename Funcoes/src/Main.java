import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Em java, chamamos funções de metódos.

        String nomeOriginal;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        nomeOriginal = ler.next();
        // Chamada da função
        Saudacao(nomeOriginal);

        // Função com retorno:
        System.out.println("Informe o primeiro valor:");
        int numb1 = ler.nextInt();
        System.out.println("Informe o segundo valor:");
        int numb2 = ler.nextInt();
        // Atribuição do retorno da função em uma variável para exibir o resultado
        int resultado = soma(numb1, numb2);
        System.out.println(resultado);
    }

    public static void Saudacao(String nomeParametro){
        // Obs.: Os nomes das var só precisam ser iguais no mesmo escopo
        System.out.println("Hello, " + nomeParametro);
    }

    public static int soma(int numb1, int numb2){
        // Função com retorno
        return numb1 + numb2;
    }
}