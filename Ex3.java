import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        double precoUnitario, unidadesVendidas, resultado;

        precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitario"));
        unidadesVendidas = Double.parseDouble(JOptionPane.showInputDialog("Digite as unidades vendidas"));

        resultado = precoUnitario + unidadesVendidas;
        resultado = resultado * 5/100;

        JOptionPane.showMessageDialog(null, "resultado = " + resultado);

    }
}
