import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        double Valor, resultado;

        Valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));

        resultado = Valor - 1;

        JOptionPane.showMessageDialog(null, "Antecessor = " + resultado);
    }
}
