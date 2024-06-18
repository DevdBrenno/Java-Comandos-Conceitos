public class Main {
    public static void main(String[] args) {
        // Estruturas de repetição contaveis
        for (int i = 1; i<= 10; i++){
        // Para i = 1 e i menor igual a 10, incrementando 1 a 1, faça:
            //System.out.println(i);
        }

        for (int i = 1; i<= 10; i++){
            int num = i;
            System.out.printf("Tabuada do %d:\n", num);
            for (int j = 1; j<= 10; j++){
                System.out.println(j + "x" + i + "=" + j* i);
            }
        }

    }
}