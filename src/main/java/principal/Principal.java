
package principal;

import javax.swing.JOptionPane;
import model.Aluno;


public class Principal {
     public static void main(String[] args) {
         Aluno ala = new Aluno();
         
         //Entrada
         ala.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
         ala.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota")));
         ala.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota")));
         ala.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota")));
         
         //Saída
         JOptionPane.showMessageDialog(null, " A média aritmética das notas do aluno é " + ala.getMedia());
     }
}
