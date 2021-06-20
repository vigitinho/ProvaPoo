package PizzariaOrder;

import java.util.ArrayList;
import java.util.Scanner;

public class DrinkOrder {

    int op;
    String drink = "";
    double valorDrink;
    int validador = 1;
    ArrayList<String> listaBebidas = new ArrayList();

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
        op = entrada.nextInt();

        switch (op) {
            case 1:
                listaBebidas.add("Coca Cola 2 LT");
                valorDrink = valorDrink + 9.5;
                break;

            case 2:
                listaBebidas.add("Cerveja Heineken 330 ML");
                valorDrink = valorDrink + 6.5;
                break;

            case 3:
                listaBebidas.add("Suco Pratz 900 ML");
                valorDrink = valorDrink + 12.5;
                break;

            case 4:
                listaBebidas.add("Agua Mineral 600 ML");
                valorDrink = valorDrink + 3.5;
                break;
        }

        return listaBebidas;

    }

}
