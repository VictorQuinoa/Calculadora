import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    Calculo obx = new Calculo();
    //Peticion de numeros
     Float ret = obx.calculo(Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer numero:")),Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo numero:")));
    //Comprobacion de si se han introducido datos validos o de si ha fallado la aplicación con mensaje.
     if(ret == null){
         JOptionPane.showMessageDialog(null,"Algo ha fallado");
     }else{
         JOptionPane.showMessageDialog(null,"Operación finalizada" );
     }

    }
}
