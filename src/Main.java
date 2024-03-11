import javax.swing.*;

public class Main {

    public static void main(String[] args){
// Salida.salidaDos("GOZ CABRON",Salida.VENTANA);

            Float retorno = Operaciones_Basicas.operaciones(Operaciones_Basicas.SUMA,5,5);
            if(retorno == null)
                System.out.println("Algo fallo");
            else
                System.out.println("El resultado es: "+retorno);
        }
    }

