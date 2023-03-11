import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String resultado = inverterString(entrada);

        System.out.println("Resultado: " + resultado);
    }

    public static String inverterString(String entrada) {

        String resultado = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            resultado += entrada.charAt(i);
        }

        return resultado;
    }
}
