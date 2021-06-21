package PizzariaOrder;

import java.util.ArrayList;

public class PizzaFlavor {

    double valueFlavor;
    PizzaSize size = new PizzaSize();
    ArrayList<String> listFlavor = new ArrayList();

    PizzaOrder order = new PizzaOrder();

    public ArrayList orderFlavor(int op) {

        switch (op) {
            case 1:
                listFlavor.add("5 Queijos");
                break;
            case 2:
                listFlavor.add("Frango Catupiry");
                break;
            case 3:
                listFlavor.add("Cheddar");
                valueFlavor += 3.50;
                break;
            case 4:
                listFlavor.add("Calabresa");
                break;
            case 5:
                listFlavor.add("Chocolate");
                break;
            case 6:
                listFlavor.add("Prestigio");
                break;
            case 7:
                listFlavor.add("Salmao com alcaparras");
                valueFlavor += 4;
                break;
            case 8:
                listFlavor.add("Camarao");
                valueFlavor += 4.5;
                break;
            case 9:
                listFlavor.add("Abacaxi com Canela");
                break;
        }

        return listFlavor;
    }

}
