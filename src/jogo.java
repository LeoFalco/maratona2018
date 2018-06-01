import java.util.Scanner;

public class jogo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String linha;
        char letra;
        char letraCorreta = ' ';
        char LetraIntrusa;
        String anterior = "";
        
        boolean primeiraVez = true;
        
        int contLinha = 1;
        int contColuna = 1;
        do{ 
            linha = entrada.next();
            
            if(primeiraVez){
                    char a = linha.charAt(0);
                    char b = linha.charAt(1);
                    
                    if(a == b){
                        letraCorreta = a;
                    }else{ // discobrir qual e o errado
                        char c = linha.charAt(2);
                        if(c == a){
                            // mensagem
                            System.out.println("LINHA " + 1 + " COLUNA " + 2);
                            break;
                        }else{
                            // outra mensagem
                            System.out.println("LINHA " + 1 + " COLUNA " + 1);
                            break;
                        }
                    }
                
                primeiraVez = false;
            }
            
            for (int i = 0; i < linha.length(); i++) {
                letra = linha.charAt(i);
                
                if(letra != letraCorreta){
                    System.out.println("LINHA " + contLinha + " COLUNA " + (i+1));
                    break;
                }
            }
            
            contLinha++;
        }while(entrada.hasNext());
    }
}
