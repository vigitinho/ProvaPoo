package provaestrutura;

public class InsertionSort {

    int i, j;
    int aux;
    int contador = 1;

    public void algoritmoInsertionSort(int vetor[]) {

        for (i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while ((j >= 0) && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }

        if (contador == 1) {
            System.out.println("Insertion Sort");
            contador++;
        };
        System.out.print("[");
        for (i = 0; i < vetor.length; ++i) {
            System.out.print(" " + vetor[i] + " ");
        }
        System.out.println("]; ");
    }

    public static void main(String[] args) {

        InsertionSort execute = new InsertionSort();

        int vetor1[] = {5, 7, 4, 2, 1};
        int vetor2[] = {9, 5, 1, 3, 7};

        execute.algoritmoInsertionSort(vetor1); //Esperado -> [1, 2, 4, 5, 7]
        execute.algoritmoInsertionSort(vetor2); //Esperado -> [1, 3, 5, 7, 9] 
    }
}
