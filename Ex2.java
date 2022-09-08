import javax.swing.JOptionPane;


public class Ex2 {
    public static void main(String[] args) {
        double primeiroValor, segundoValor, terceiroValor, QuartoValor, resultado;

        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        QuartoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));

        resultado = primeiroValor * primeiroValor + segundoValor * segundoValor  + terceiroValor * terceiroValor + QuartoValor * QuartoValor;

        JOptionPane.showMessageDialog(null, "resultado = " + resultado);

    }
}
