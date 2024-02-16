import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    Calculo obx = new Calculo();
     Float ret = obx.calculo(Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer numero:")),Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo numero:")));
     if(ret == null){
         JOptionPane.showMessageDialog(null,"Algo ha fallado");
     }else{
         JOptionPane.showMessageDialog(null,"Operación finalizada" );
     }

    }
}
