public class Main {
    public static void main(String[] args) {
        // Arrays, no java, são estruturas (similiar as listas, só que imutável) que conseguem armazenar valores de mesmo tipo
        int[] numeros = new int[5];; // Teremos as posições por índices: [0], [1], [2], [3], [4]
        numeros [0] =  1;
        numeros [1] =  2;
        numeros [2] =  3;
        numeros [3] =  4;
        numeros [4] =  5;

        for(int i=0; i < numeros.length; i++){
            System.out.println(i);
        }


        /*
         Outra forma de definir arrays:
         String letras[] = {"A", "B", "C", "D", "E"};
        */

        // Comparação com vetor
        int[] numb = {1, 3, 5, 7, 9};
        int maior = numb[0];
        int menor = numb[0];
        int media = 0;

        for (int i=0; i < numb.length; i++){
            if (numb[i] > maior){
                maior = numb[i];
            }if (numb[i] < menor){
                menor = numb[i];
            }
            media += numb[i];
        }

        System.out.printf("Maior: %d \nMenor: %d\nMedia: %d", maior, menor, media/numb.length);

    }
}