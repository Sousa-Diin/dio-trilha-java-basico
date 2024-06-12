package fluxoandconditional.excecoes;

import javax.swing.JOptionPane;

public class Excecoes {
    /**
     * @param args
     */
    public static void main(String[] args) {
       // Number valor = Double.valueOf("a1.75");
       // System.out.println(valor);
       String[] alunos = {"Wildes", "Lucas", "Eliane"};
       System.out.println(alunos[1]);

       String idade = JOptionPane.showInputDialog("Qual é sua idade?");
        try {
            int intIdade = Integer.parseInt(idade);

            if (intIdade >= 18 ){
             JOptionPane.showMessageDialog(null, "Então você é maior de idade");
            }
            else{
             JOptionPane.showMessageDialog(null, "Então você é menor de idade");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Erro ao converter número: " + e.getMessage());
        }
      
    }
}
