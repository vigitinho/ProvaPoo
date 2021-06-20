package PizzariaOrder;


public class PizzaSize {
int qntSabores;
    double valorTamanho;
    double valorCborda;
    String tamanho;
    int validador = 0;
    PizzaEdge edgeflavor = new PizzaEdge();

    public int orderSize(int op) {

        switch (op) {
            case 1:
                qntSabores = 5;
                tamanho = "Gigante";
                valorTamanho = 75;
                valorCborda = 80;
                break;

            case 2:
                qntSabores = 4;
                tamanho = "Familia";
                valorTamanho = 66;
                valorCborda = 69.5;
                break;

            case 3:
                qntSabores = 3;
                tamanho = "Media";
                valorTamanho = 52;
                valorCborda = 56.5;
                break;

            case 4:
                qntSabores = 3;
                tamanho = "Pequena";
                valorTamanho = 42;
                valorCborda = 44.5;
                break;

            case 5:
                qntSabores = 2;
                tamanho = "Broto";
                valorTamanho = 28;
                validador = 1;
                break;
        }
        return qntSabores;
    }
}
