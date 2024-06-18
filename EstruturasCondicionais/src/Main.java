public class Main {
    public static void main(String[] args) {
        // Estruturas condicionais

        // Estrutura If-Else
        int notaAluno1 = 70;

        if (notaAluno1 >= 70){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Não aprovado.");
        }

        // Else-if
        System.out.println("Graduções A = 80 | B = 70 | C = 60 | D = 0");
        int notaAluno2 = 70;
        String Graduacao;

        if (notaAluno2 >= 80){
            Graduacao = "A";
        }else if (notaAluno2 < 80 && notaAluno2 >= 70){
            Graduacao = "B";
        } else if (notaAluno2 < 70 && notaAluno2 >= 60){
            Graduacao = "C";
        }else if (notaAluno2 < 60 && notaAluno2 >= 0){
            Graduacao = "D";
        }else{
            Graduacao = "";
        }

        System.out.println("Sua graduação foi: " + Graduacao);

        // Switch
        switch (Graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.printf("Graduação inválida");
        }

        // Comparação com operadores ternários
        int notaAluno3 = 60;

        String resultado = notaAluno3 >= 70 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    }
}