public class pramim {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int min = 0;
        int amigo = 0;

        char primeira;

        primeira = entrada.next().charAt(0);
        int linhas = entrada.nextInt();

        for (int i = 0; i < linhas; i++) {
            if (primeira == 'V') {
                if (i % 2 == 0) {
                    min += entrada.nextInt();
                } else {
                    amigo += entrada.nextInt();
                }
            } else {// A
                if (i % 2 == 0) {
                    amigo += entrada.nextInt();
                } else {
                    min += entrada.nextInt();
                }
            }
        }
        System.out.println("VOCE: " + min + " AMIGO: " + amigo);
    }

}
