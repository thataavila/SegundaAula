import javax.swing.JOptionPane;


public class Ex1 {
    public static void main(String[] args) {
        double cotacaoDolar, quantidadedoDolar, resultado;

        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dolar"));
        quantidadedoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de dolar"));

        resultado = cotacaoDolar * quantidadedoDolar;

        JOptionPane.showMessageDialog(null, "resultado = " + resultado );
    }
    
}
