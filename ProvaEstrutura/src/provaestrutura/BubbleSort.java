package provaestrutura;

public class BubbleSort {

    int j, i;
    int aux;
    int contador = 1;

    public void algoritmoBubbleSort(int vetor[]) {
        //Garantir que o processo vai ser repitido baseado no tamanho no vetor
        for (i = 0; i < vetor.length; ++i) {
             //Responsavel de analizar 2 valores
            for (j = 0; j < (vetor.length - 1); ++j) {
                //Onde faz a comparação, verificar se um determinado membro é maior que o outro e fazer a inversão caso necessaria
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        if (contador == 1) {
            System.out.println("Bubble Sort");
            contador++;
        };
        System.out.print("[");
        for (i = 0; i < vetor.length; ++i) {
            System.out.print(" " + vetor[i] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        BubbleSort execute = new BubbleSort();

        int vetor1[] = {3, 7, 1, 2, 6};
        int vetor2[] = {4, 6, 3, 1, 8};

        execute.algoritmoBubbleSort(vetor1); //Esperado -> [1, 2, 3, 6, 7]
        execute.algoritmoBubbleSort(vetor2); //Esperado -> [1, 3, 4, 6, 8]
    }

}
