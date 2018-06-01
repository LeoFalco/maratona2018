import java.util.Scanner;

public class linguadopqr {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String linha = "";
        linha += entrada.nextLine();

        linha = linha.replace(" ", "")
                .replace("PQ", "")
                .replace("R", " ")
                .replace(" ?", "?")
                .replace(" ,", ",")
                .replace(" .", ".")
                .replace(" !", "!");


        System.out.println("saida: ");
        System.out.println(linha);
        JOptionPane.showMessageDialog(null, linha);

    }
}
