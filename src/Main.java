public class Main {
    static Float Salida;
    public static void main(String[] args){
// Salida.salidaDos("",Salida.VENTANA);



        Salida= Operaciones_Basicas.operaciones(Operaciones_Basicas.SUMA,5,5);
        if(Salida == null)
            System.out.println("Algo fallo");
        else
            System.out.println("Suma: "+Salida);

        Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.RESTA,5,5);
        if(Salida == null)
            System.out.println("Algo fallo");
        else
            System.out.println("Resta: "+Salida);
        Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.MULTIPLICACION,5,5);
        if(Salida == null)
            System.out.println("Algo fallo");
        else
            System.out.println("Multiplicacion: "+Salida);
        Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.DIVISION,5,5);
        if(Salida == null)
            System.out.println("Algo fallo");
        else
            System.out.println(" Division"+Salida);
        Salida = Operaciones_Basicas.operaciones(Operaciones_Basicas.RAIZ,5,5);

            if(Salida == null)
                System.out.println("Algo fallo");
            else
                System.out.println("Raiz: "+Salida);
        }
    }

