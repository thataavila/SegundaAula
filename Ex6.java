import javax.swing.JOptionPane;


public class Ex6 {
    public static void main(String[] args) {
        double valorIdade, resultado;

       valorIdade = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade"));

       resultado = valorIdade * 365;

       JOptionPane.showMessageDialog(null, "Dias =  " + resultado);
    }
}
