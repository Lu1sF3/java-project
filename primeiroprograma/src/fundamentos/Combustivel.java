package fundamentos;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quilometragemTotal = 0;
        int litrosTotal = 0;
        int viagens = 0;

        while (true) {
            System.out.print("Informe a quilometragem dirigida (ou -1 para sair): ");
            int quilometragem = scanner.nextInt();
            if (quilometragem == -1) {
                break;
            }

            System.out.print("Informe a quantidade de litros de gasolina consumidos: ");
            int litros = scanner.nextInt();

            double consumo = (double) quilometragem / litros;
            System.out.printf("Consumo em quilômetros/litro para essa viagem: %.2f km/L%n", consumo);

            quilometragemTotal += quilometragem;
            litrosTotal += litros;
            viagens++;

            System.out.printf("Quilometragem total: %d km%n", quilometragemTotal);
            System.out.printf("Litros de combustível consumidos até agora: %d L%n", litrosTotal);
        }

        if (viagens > 0) {
            double mediaConsumo = (double) quilometragemTotal / litrosTotal;
            System.out.printf("Média de consumo em quilômetros/litro para todas as viagens: %.2f km/L%n", mediaConsumo);
        } else {
            System.out.println("Nenhuma viagem registrada.");
        }
    }
}
