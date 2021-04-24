package provaestrutura;

public class InsertionSort {

    int i, j;
    int aux;
    int contador = 1;

    public void algoritmoInsertionSort(int vetor[]) {

        //Irra armazenar uma variavel para poder fazer as comparaçãoes a partir dela.
        //Para isso que o for iniciaria a partir da segunda posiçã.
        for (i = 1; i < vetor.length; i++) {
            //A variavel aux recebe o elemento da segunda posição.
            aux = vetor[i];
            //Onde inicia a comparação
            j = i - 1;
            //Serve para pegar todos os elementos anteriores a aux menores que ele.
            //Enquanto algum elemento anterior (determinado pela variavel j) for maior que o valor armazenada em aux.
            while ((j >= 0) && vetor[j] > aux) {
                //O elemento seguinte recebe o elemento atual da variavel j.
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
