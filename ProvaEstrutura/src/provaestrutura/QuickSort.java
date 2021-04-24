package provaestrutura;

public class QuickSort {

    public void algoritmoQuickSort(int vetor[]) {
        quickSort(vetor, 0, vetor.length - 1);

    }

    private void quickSort(int[] vetor, int inicio, int fim) {

        if (fim > inicio) {

            int indexPivo = dividir(vetor, inicio, fim);

            quickSort(vetor, inicio, indexPivo - 1);

            quickSort(vetor, indexPivo + 1, fim);
        }

    }

    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {

            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }
        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    private static void imprimirVetor(int[] vetor) {
        System.out.print("QuickSort\n");
        System.out.print("[");
        for (int num = 0; num < vetor.length; ++num) {
            System.out.print(" " + vetor[num] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        QuickSort execute = new QuickSort();

        int vetor1[] = {3, 7, 9, 1, 8, 2, 6};
        int vetor2[] = {4, 5, 6, 3, 1, 8, 7};

        execute.algoritmoQuickSort(vetor1); //Esperado -> [1, 2, 3, 6, 7, 8, 9]
        execute.algoritmoQuickSort(vetor2); //Esperado -> [1, 3, 4, 5, 6, 7, 8]   
        imprimirVetor(vetor1);
        imprimirVetor(vetor2);

    }
}
