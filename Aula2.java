import javax.swing.JOptionPane;

public class Aula2 {
    
     public static void main(String[] args) {
        double primeiroValor, segundoValor, resultado;

        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));

        resultado = primeiroValor + segundoValor; 

        JOptionPane.showMessageDialog(null, "soma = " + resultado);
     }
        
    
}
