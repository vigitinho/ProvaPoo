package PizzariaOrder;

import java.util.Scanner;

public class PizzaOrder {

    int y = 0;
    double valorTotal;

    public static void printWelcomeMessage() {
        System.out.println("------------------------------------");
        System.out.println("Bem-vindo ao Programa de Pedidos de Pizza!");
        System.out.println("------------------------------------");
    }

    public void order() {
        printWelcomeMessage();
        PizzaSize pizzaSise = new PizzaSize();
        PizzaFlavor flavor = new PizzaFlavor();
        PizzaEdge pizzaEdge = new PizzaEdge();
        DrinkOrder drink = new DrinkOrder();

        Scanner entrada = new Scanner(System.in);

        System.out.println(">>SELECIONE UM TAMANHO DE PIZZA<<\n"
                + ">>[1] - Gigante<<\n"
                + ">>[2] - Familia<<\n"
                + ">>[3] - Media<<\n"
                + ">>[4] - Pequena<<\n"
                + ">>[5] - Broto<<\n"
                + "Insira aqui o tamanho da pizza: ");
        pizzaSise.orderSize(entrada.nextInt());

        while (y < pizzaSise.qntFlavor) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println(">>SELECIONE UM SABOR DE PIZZA<<\n"
                    + ">>[1] - 5 Queijos<<\n"
                    + ">>[2] - Frango Catupiry<<\n"
                    + ">>[3] - Cheddar<<\n"
                    + ">>[4] - Calabresa<<\n"
                    + ">>[5] - Chocolate<<\n"
                    + ">>[6] - Prestigio<<\n"
                    + ">>[7] - Salmao com alcaparras<<\n"
                    + ">>[8] - Camarao<<\n"
                    + ">>[9] - Abacaxi com Canela<<\n"
                    + "Insira aqui o sabor da pizza: ");
            flavor.orderFlavor(entrada2.nextInt());
            y++;
        }

        if (pizzaSise.validador == 0) {
            Scanner entrada3 = new Scanner(System.in);
            System.out.println("Deseja acompanhamento de borda ?\n"
                    + ">>[1] - Sim<<\n"
                    + ">>[2] - Nao<<");
            pizzaEdge.validateEdge(entrada3.nextInt());
        } else {

        }

        double value;
        if (pizzaEdge.validador == 1) {
            value = pizzaSise.valueEdge;
        } else {
            value = pizzaSise.valueSize;
        }

        while (drink.validador == 1) {
            Scanner entrada4 = new Scanner(System.in);
            System.out.println("Deseja adicionar bebida ?\n"
                    + ">>[1] - Sim<<\n"
                    + ">>[2] - Nao<<");
            drink.validateDrink(entrada4.nextInt());
        }

        valorTotal = value + flavor.valueFlavor + pizzaEdge.valueEdge + drink.valueDrink;

        System.out.println("O tamanho da pizza e: " + pizzaSise.tamanho);
        System.out.println("Os sabores escolhidos foram: " + flavor.listFlavor);
        System.out.println("A borda escolhida foi: " + pizzaEdge.edge);
        System.out.println("A bebida escolhida foi: " + drink.listDrink);
        System.out.println("O total do pedido foi: " + valorTotal);

    }
}
