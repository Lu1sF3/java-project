package fundamentos;

import java.util.Scanner;

public class Descriptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um inteiro de quatro dígitos criptografado: ");
        int criptografado = scanner.nextInt();

        int digito1 = criptografado / 1000;
        int digito2 = (criptografado / 100) % 10;
        int digito3 = (criptografado / 10) % 10;
        int digito4 = criptografado % 10;

        int descriptografado1 = (digito3 - 7 + 10) % 10;
        int descriptografado2 = (digito4 - 7 + 10) % 10;
        int descriptografado3 = (digito1 - 7 + 10) % 10;
        int descriptografado4 = (digito2 - 7 + 10) % 10;

        int descriptografado = descriptografado1 * 1000 + descriptografado2 * 100 + descriptografado3 * 10 + descriptografado4;

        System.out.println("Número descriptografado: " + descriptografado);
    }
}