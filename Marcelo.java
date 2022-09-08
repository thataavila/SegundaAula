import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class Marcelo{

    private static BigDecimal valorPeso = null;
    private static BigDecimal valorAltura = null;

    public static void main(String[] args){

        valorPeso = Funcoes.setValores("Digite o peso");
        valorAltura = Funcoes.setValores("Digite a altura");

        BigDecimal resultado = Funcoes.getResultado(valorPeso, valorAltura);

        JOptionPane.showMessageDialog(null, "IMC =  " + resultado.toString());
        Funcoes.mostrarMsg(resultado);
    }

}