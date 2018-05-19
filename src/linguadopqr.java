import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAQ01LAB0
 */
public class linguadopqr {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String linha = "";
         linha += entrada.nextLine();
         
        linha = linha.replace(" ","")
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
