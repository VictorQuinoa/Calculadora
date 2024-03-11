import javax.swing.*;

public class Main {
    /**
     * Declarado para poder llamar al factory
     */
    static Float Salida;

    public static void main(String[] args) {
// Salida.salidaDos("",Salida.VENTANA);
        /**
         * Estructura do while para hacer el programa repetitivo a peticion si se  introduce 0
         *
         */
        int a =0;
        do {
            JOptionPane.showMessageDialog(null,"El programa te pedira numeros para suma,resta,multiplicacion ,division y raiz en orden");

/**
 * Impresion de la suma con opcion de fallo
 */

            Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.SUMA, 0, 0);
            if (Salida == null)
                System.out.println("Algo fallo");
            else
                JOptionPane.showMessageDialog(null, "Suma: " + Salida);
/**
 * Impresion de la resta con opcion de fallo
 */

            Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.RESTA, 0, 0);
            if (Salida == null)
                System.out.println("Algo fallo");
            else
                JOptionPane.showMessageDialog(null, "Resta: " + Salida);
            /**
             * Impresion de la multiplicacion con opcion de fallo
             */

            Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.MULTIPLICACION, 0, 0);
            if (Salida == null)
                System.out.println("Algo fallo");
            else
                JOptionPane.showMessageDialog(null, "Multiplicacion: " + Salida);
            /**
             * Impresion de la division con opcion de fallo
             */

            Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.DIVISION, 0, 0);
            if (Salida == null)
                System.out.println("Algo fallo");
            else
                JOptionPane.showMessageDialog(null, "Division: " + Salida);
            /**
             * Impresion de la raiz con opcion de fallo
             */

            Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.RAIZ, 0, 0);

            if (Salida == null)
                System.out.println("Algo fallo");
            else
                JOptionPane.showMessageDialog(null, "Raiz: " + Salida);


                  a= Integer.parseInt(JOptionPane.showInputDialog("Quieres continuar? \n0-si \n1-no"));
        } while (a == 0);
    }
}

