package PizzariaOrder;

import java.util.ArrayList;
import java.util.Scanner;

public class DrinkOrder {

    int dr;
    String drink = "";
    double valueDrink;
    int validador = 1;
    ArrayList<String> listDrink = new ArrayList();

    public int validateDrink(int op) {

        switch (op) {
            case 1:
                orderDrink();
                break;
            case 2:
                validador = validador - 1;
                break;

        }
        return 0;
    }

    public ArrayList orderDrink() {
        Scanner entrada = new Scanner(System.in);

        System.out.println(">>SELECIONE UMA BEBIDA<<\n"
                + ">>[1] - Coca Cola 2 LT<<\n"
                + ">>[2] - Cerveja Heineken 330 ML<<\n"
                + ">>[3] - Suco Pratz 900 ML<<\n"
                + ">>[4] - Agua Mineral 600 ML<<\n"
                + "Insira aqui uma bebida: ");
        dr = entrada.nextInt();

        switch (dr) {
            case 1:
                listDrink.add("Coca Cola 2 LT");
                valueDrink = valueDrink + 9.5;
                break;

            case 2:
                listDrink.add("Cerveja Heineken 330 ML");
                valueDrink = valueDrink + 6.5;
                break;

            case 3:
                listDrink.add("Suco Pratz 900 ML");
                valueDrink = valueDrink + 12.5;
                break;

            case 4:
                listDrink.add("Agua Mineral 600 ML");
                valueDrink = valueDrink + 3.5;
                break;
        }

        return listDrink;

    }

}
