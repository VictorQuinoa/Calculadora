import javax.swing.*;

public class Calculo {

    //Metodo con 2 float para pedir los números a calcular.
    public float calculo(float a, float b){

       int opc=0;

       float res=0;
//Metodo de elección del cálculo deseado.
       opc=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la opción que quieras realizar: \n 1-Suma \n 2-Resta \n 3-Multiplicación \n 4-División "));

//Switch que realiza el calculo dependiendo de la opción elegida.
       switch (opc){
            //Suma
            case 1:
                res = a + b;
                JOptionPane.showMessageDialog(null,"El resultado de la suma es:" + res);
                break;
            //Resta
           case 2:
           res = a-b;
               JOptionPane.showMessageDialog(null,"El resultado de la resta es:" + res);
           break;
           //Multiplicación
           case 3:
           res = a * b;
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es:" + res);
           break;
           //División
            case 4:
           res = a / b;
                JOptionPane.showMessageDialog(null,"El resultado de la división es:" + res);
           break;
           default:
               res = Float.parseFloat(null);

       }
       return res;
    }




}
