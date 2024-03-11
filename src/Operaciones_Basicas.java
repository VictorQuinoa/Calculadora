import com.inout.Entrada;

import javax.swing.*;

public class Operaciones_Basicas {

    private float num;
    private float num2;
    public static final int SUMA=1;
    public static final int RESTA=2;
    public static final int MULTIPLICACION=3;
    public static final int DIVISION=4;
    public static final int RAIZ=5;

    /**
     * Declaracion de los elementos a calcular
     * @param num
     * @param num2
     */

   public Operaciones_Basicas(float num, float num2) {

       this.num = num;
        this.num2= num2;
    }


    /**
     * Metodo que contiene las operaciones
     * @param a
     * @param num
     * @param num2
     * @return
     */
    public static Float operaciones(int a,float num,float num2){


        float resultado=0;
        switch (a){
            /**
             * Suma
             */
            case SUMA:
                resultado=num+num2;
                break;
            /**
             * Resta
             */
            case RESTA:
                resultado=num-num2;
                break;
            /**
             * Multiplicación
             */
            case MULTIPLICACION:
                resultado=num*num2;
                break;
            /**
             * Division
             */
            case DIVISION:
                resultado=num/num2;

                break;
            /**
             * Calculo de Raiz seleccionando cuadrada o cúbica
             */
            case RAIZ:
                int opc = Integer.parseInt(JOptionPane.showInputDialog("Selecciona para hacer del primer número: \n 1-Raiz cuadrada \n 2-Raiz cúbica"));
                if (opc == 1) {
                resultado = (float) Math.sqrt(num);
            }else if (opc == 2) {
                    resultado = (float) Math.cbrt(num);
                }

            default:
                System.out.println("Operacion no Valida");
        }
        return  resultado;
    }
}






