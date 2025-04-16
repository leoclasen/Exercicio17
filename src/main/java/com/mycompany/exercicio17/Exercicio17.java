package com.mycompany.exercicio17;
import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
       String profissao;
       String opcao = JOptionPane.showInputDialog(null, "Informe a profissão de Tibúrcio:\n"
                + "E - Engenheiro\n"
                + "M - Médico\n"
                + "P - Programador\n"
                + "A - Advogado\n"
                + "D - Designer\n");
    
    switch (opcao.toUpperCase()){
        case "E":
            profissao = "engenheiro.";
        break;
        
        case "M":
            profissao = "médico.";
        break;
        
        case "P":
            profissao = "programador.";
        break;
        
        case "A":
            profissao = "advogado.";
        break;
        
        case "D":
            profissao = "designer.";
        break;
        
        default:
            profissao = "desempregado.";
            
        }   
    
    JOptionPane.showMessageDialog(null, "Tibúrcio é " + profissao);
    }
}
