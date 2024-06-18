// Bibliotecas de data e hora
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Objetivo: Olá {nome}. Hoje é {dia-da-semana}, {Bom dia!, Boa tarde!, Boa noite!}
        String nome = "David";

        /*Manipulação de string (Podemos adicionar qualquer metódo a uma string, usando o '.NomeDoMetódo'
        System.out.println("Maiúculo:" + nome.toUpperCase());
        System.out.println("Minúsculo:" + nome.toLowerCase());
        System.out.println("Tamanho:" + nome.length());
        */

        // ISO 8601 : AAAA-MM-DD
        LocalDate hoje  = LocalDate.now();
        //System.out.println("Hoje é: " + hoje);

        // Dia da semana traduzido para o português
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        // Horário
        String Saudacao;
        LocalDateTime horaAgora = LocalDateTime.now();
        if (horaAgora.getHour() >= 0 && horaAgora.getHour() < 12 ){
            Saudacao = "Bom dia!";
        } else if (horaAgora.getHour() >= 12 && horaAgora.getHour() < 18) {
            Saudacao = "Boa tarde!";
        } else if (horaAgora.getHour() >= 18 && horaAgora.getHour() < 24){
            Saudacao = "Boa noite!";
        } else {
            Saudacao = "Boa!";
        }

        // Para definição de formato e após isso o valor
        System.out.printf("Olá, %s. Hoje é %s. %s.%n", nome, diaSemana, Saudacao.toUpperCase());
    }
}