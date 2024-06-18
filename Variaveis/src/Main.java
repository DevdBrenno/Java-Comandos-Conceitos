public class Main {
    public static void main(String[] args) {
        String nome = "Brasil";
        // Devemos efetuar operação com variáveis de mesmo tipo ou usarmos o cast para alternar
        int a = 2;
        double b = 3.5;
        //Um atalho para o print é escrever 'sout'
        System.out.println("Olá, " + nome);
        System.out.println("Multiplicação" + a * b);

        // Operadores lógicos: && (And), Or (||)
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean irAPraia = fimDeSemana && fazendoSol;
        System.out.println("Vamos a praia?" + irAPraia);

        // Operador ternário
        String mensagem = fimDeSemana ? "É fim de semana." : "Não é fim de semana";
        System.out.println(mensagem);


    }
}