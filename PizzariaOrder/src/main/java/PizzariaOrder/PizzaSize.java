package PizzariaOrder;

public class PizzaSize {

    int qntFlavor;
    double valueSize;
    double valueEdge;
    String tamanho;
    int validador = 0;
    PizzaEdge edgeflavor = new PizzaEdge();

    public int orderSize(int op) {

        switch (op) {
            case 1:
                qntFlavor = 5;
                tamanho = "Gigante";
                valueSize = 75;
                valueEdge = 80;
                break;

            case 2:
                qntFlavor = 4;
                tamanho = "Familia";
                valueSize = 66;
                valueEdge = 69.5;
                break;

            case 3:
                qntFlavor = 3;
                tamanho = "Media";
                valueSize = 52;
                valueEdge = 56.5;
                break;

            case 4:
                qntFlavor = 3;
                tamanho = "Pequena";
                valueSize = 42;
                valueEdge = 44.5;
                break;

            case 5:
                qntFlavor = 2;
                tamanho = "Broto";
                valueSize = 28;
                validador = 1;
                break;
        }
        return qntFlavor;
    }
}
