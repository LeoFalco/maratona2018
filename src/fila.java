import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAQ01LAB0
 */
public class fila {
    public static void main(String[] args) {
        
        
        
        Scanner entrada = new Scanner(System.in);
        
        
        int qtdeSenha = entrada.nextInt();
        List<String> senhasGeradas = new ArrayList<>();
        
        for (int i = 0; i < qtdeSenha; i++) {
            senhasGeradas.add(entrada.next());
        }
        
        int qtdeFuncFila = entrada.nextInt();
        List<String> senhasEntregues = new ArrayList<>();
        for (int i = 0; i < qtdeFuncFila; i++) {
            senhasEntregues.add(entrada.next());
        }
        
        List<String> senhasUsadas = new ArrayList<>(qtdeSenha);
        
        int almoco = 0;
        int invalida = 0;
        int repetida = 0;
       
        
        
        for (String  senhaEntregue: senhasEntregues) {
            if(contem(senhasGeradas, senhaEntregue)){ // valida
                if(contem(senhasUsadas, senhaEntregue)){ // repetida
                    repetida++;
                }else{
                    senhasUsadas.add(senhaEntregue);
                    almoco++;
                }
            }else{
                invalida ++;
            }
        }
        
        System.out.println(almoco + " A");
        System.out.println(invalida + " I");
        System.out.println(repetida + " R");
        
    }
    
    public static boolean contem(List<String> lista, String key){
        for(String s : lista){
            if(s.equals(key)){
                return true;
            }
        }
        return false;
    }
}
