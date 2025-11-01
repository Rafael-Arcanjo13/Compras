import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Compra> compras = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        int limiteCartao = leitura.nextInt();
        leitura.nextLine();

        int repetir = 1;

        while (repetir == 1) {

            System.out.println("Digite a descrição da compra: ");
            String compra = leitura.nextLine();

            System.out.println("Digite o valor da compra: ");
            int valorDaCompra = leitura.nextInt();
            leitura.nextLine();


            if(valorDaCompra > limiteCartao) {
                System.out.println("Saldo insuficiente!");
                System.out.println("**************************");
                System.out.println("COMPRAS REALIZADAS: ");

                Collections.sort(compras);
                for (Compra c : compras) {
                    System.out.println(c);
                }

                System.out.println("**************************");

                System.out.println("Saldo do cartão: " + limiteCartao);


                repetir = 0;
                return;
            }

            System.out.println("Compra realizada!");
            limiteCartao -= valorDaCompra;
            compras.add(new Compra(compra, valorDaCompra));

            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            repetir = leitura.nextInt();
            leitura.nextLine();
        }

        System.out.println("**************************");
        System.out.println("COMPRAS REALIZADAS: ");

        Collections.sort(compras);
        for (Compra c : compras) {
            System.out.println(c);
        }

        System.out.println("**************************");

        System.out.println("Saldo do cartão: " + limiteCartao);
    }
}