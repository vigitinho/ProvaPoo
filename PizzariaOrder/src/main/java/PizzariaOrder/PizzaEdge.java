package PizzariaOrder;

import java.util.Scanner;

public class PizzaEdge {

    int ed;
    String edge = "";
    double valueEdge;
    int validador = 0;
    PizzaOrder order = new PizzaOrder();

    public int validateEdge(int op) {
        switch (op) {
            case 1:
                orderEdge();
                validador = 1;
                break;
            case 2:

                break;
        }
        return 0;
    }

    public String orderEdge() {
        Scanner entrada = new Scanner(System.in);

        System.out.println(">>SELECIONE UM SABOR DE BORDA<<\n"
                + ">>[1] - Cheddar<<\n"
                + ">>[2] - Catupiry<<\n"
                + ">>[3] - meia Nutella meia Doce de Leite<<\n"
                + ">>[4] - Nutella<<\n"
                + "Insira aqui a borda da pizza: ");
        ed = entrada.nextInt();

        switch (ed) {
            case 1:
                edge = "Cheddar";
                break;

            case 2:
                edge = "Catupiry";
                break;

            case 3:
                edge = "meia Nutella meia Doce de Leite";
                valueEdge = 3;
                break;

            case 4:
                edge = "Nutella";
                valueEdge = 2;
                break;
        }
        return edge;
    }
}
