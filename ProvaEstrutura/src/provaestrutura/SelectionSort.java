package provaestrutura;

public class SelectionSort {

    int i, j, t;
    int aux;
    int contador = 1;

    public void algoritmoSelectionSort(int vetor[]) {

        for (i = 0; i < vetor.length - 1; i++) {
            aux = i;
            for (j = aux + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[aux]) {
                    aux = j;
                }
            }
            if (aux != i) {
                t = vetor[i];
                vetor[i] = vetor[aux];
                vetor[aux] = t;
            }
        }

        if (contador == 1) {
            System.out.println("Selection Sort");
            contador++;
        }
        System.out.print("[");
        for (i = 0; i < vetor.length; ++i) {
            System.out.print(" " + vetor[i] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        SelectionSort execute = new SelectionSort();

        int vetor1[] = {3, 7, 1, 8, 2, 6};
        int vetor2[] = {4, 5, 6, 3, 1, 8};

        execute.algoritmoSelectionSort(vetor1); //Esperado -> [1, 2, 3, 6, 7, 8]
        execute.algoritmoSelectionSort(vetor2); //Esperado -> [1, 3, 4, 5, 6, 8]   
    }
}
