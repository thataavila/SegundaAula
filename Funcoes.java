import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Funcoes {
    
    public static BigDecimal getResultado(BigDecimal peso, BigDecimal altura){
        return peso.divide(altura.multiply(new BigDecimal(2)), 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal setValores(String msg){
        return new BigDecimal(JOptionPane.showInputDialog(msg));
    }

    public static void mostrarMsg(BigDecimal valor){
        if (valor.compareTo(new BigDecimal(30)) == 1){
            JOptionPane.showMessageDialog(null, "2 dias de vida");
        }else{
            JOptionPane.showMessageDialog(null, "ta suave meu cria!");
        }
    }

}
