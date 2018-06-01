import java.util.Scanner;

public class horta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int covas[] = new int[3];

        int sementes[] = new int[3];

        int total = 0;

        for (int i = 0; i < 3; i++) {
            covas[i] = entrada.nextInt();
            sementes[i] = entrada.nextInt();

            total += covas[i] / sementes[i];
        }


        System.out.println(total);
    }

}
