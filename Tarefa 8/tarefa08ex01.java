import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tarefa08ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        String valor1 = input.nextLine();

        System.out.print("Digite o segundo valor: ");
        String valor2 = input.nextLine();

        System.out.print("Digite o terceiro valor (no formato dd/MM/yyyy): ");
        String valor3 = input.nextLine();

        System.out.print("Digite o quarto valor: ");
        String valor4 = input.nextLine();

        // Conversão para String
        String str = valor1;
        if (str.contains("0") || str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4")
                || str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8")
                || str.contains("9")) {
            System.out.println("Erro: o valor " + str + " contém números.");
        } else {
            System.out.println("Valor convertido para String: " + str);
        }

        // Conversão para Int
        try {
            int i = Integer.parseInt(valor2);
            System.out.println("Valor convertido para Int: " + i);
        } catch (NumberFormatException e) {
            System.out.println("Erro: o valor " + valor2 + " não pôde ser convertido para Int.");
        }

        // Conversão para Date
        try {
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(valor3);
            System.out.println("Valor convertido para Date: " + d);
        } catch (Exception e) {
            System.out.println("Erro: o valor " + valor3 + " não pôde ser convertido para Date.");
        }

        // Conversão para Double
        try {
            double d = Double.parseDouble(valor4);
            System.out.println("Valor convertido para Double: " + d);
        } catch (NumberFormatException e) {
            System.out.println("Erro: o valor " + valor4 + " não pôde ser convertido para Double.");
        }

        input.close();
    }
}