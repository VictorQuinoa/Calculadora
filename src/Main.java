import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        do {
            Calculo obx = new Calculo();
            //Peticion de numeros
            Float ret = obx.calculo(Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer numero:")), Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo numero:")));
            //Comprobacion de si se han introducido datos validos o de si ha fallado la aplicación con mensaje.
            if (ret == null) {
                JOptionPane.showMessageDialog(null, "Algo ha fallado");
            } else {
                JOptionPane.showMessageDialog(null, "Operación finalizada");
            }
            a= Integer.parseInt(JOptionPane.showInputDialog("Quieres hacer otro calculo?\n 0-Si \n 1-no"));
        }while(a==0);
    }
}
