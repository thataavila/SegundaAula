import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        double valorBase, valorAltura, resultado;

        valorBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        valorAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite o da altura"));

        resultado = valorAltura * valorBase;

        JOptionPane.showMessageDialog(null, "resultado = " + resultado);

    }
}
