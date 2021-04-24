package provaestrutura;

public class QuickSort {
// Método para a ordenação de um vetor de inteiros.

    public void algoritmoQuickSort(int vetor[]) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    /**
     * Método que irá chamar a divisão do vetor nos três vetores do conceito. Na
     * realidade o vetor do meio esta sendo incarado apenas como o elemento pivô
     * retornado pelo método dividir.
     *
     * vetor - Vetor de inteiros que passara pelo Quick Sort. inicio - Indice
     * inicial do vetor que sera considerado no Quick Sort. fim - Indice final
     * do vetor que sera considerado no Quick Sort.
     */
    private void quickSort(int[] vetor, int inicio, int fim) {

        if (fim > inicio) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividir(vetor, inicio, fim);
            /* Chamada recursiva para redivisao do vetor de elementos menores
        que o pivô. */
            quickSort(vetor, inicio, indexPivo - 1);
            /* Chamada recursiva para redivisao do vetor de elementos maiores
        que o pivô. */
            quickSort(vetor, indexPivo + 1, fim);
        }

    }

    /**
     * Método que ira dividir o vetor e encontrar o indice do pivô. vetor -
     * Vetor de inteiros inicio - Indice inicial do vetor. fim - Indice final do
     * vetor. O indice do pivo.
     */
    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
            /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        ou ate que o elemento em questão seja menor que o pivô. */
            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

            /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        que o elemento em questão seja maior que o pivô. */
            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
        menores e maiores que o pivô foram localizados em ambos os lados.
        Trocar estes elementos de lado. */
            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }
        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    /**
   * Método para trocar dois elementos de um vetor.
   *
   * vetor - Vetor de inteiros que tera seus elementos trocados.
   * i - Indice do elemento que sera trocado.
   * j - Indice do elemento que sera trocado.
   */
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
