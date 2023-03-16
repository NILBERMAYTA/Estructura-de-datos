package Ejercicios;

public class Ejercicios {
    private int i;
    private int limite;


    public Ejercicios(){
        this.i =1;
        this.limite =10;
    }

    public void mostrarMensaje(){
        System.out.println("Hola mundo desde Java");
    }

    public void generarNumerosNatiralesFOR(){
        for (int i=1 ; i<=10 ; i++){
                System.out.print(1+"  ");
        }
        System.out.println();
    }

    public void generarNumerosNatiralesParesFOR(){
        for (int i=2 ; i<=20 ; i=i+2){
            System.out.print(i+ "  ");
        }
        System.out.println();
    }

    public void generarNumerosNatiralesParesWhile(){
        int i=1;
        while(i<=5){
           System.out.print(i+ "  ");
            i= i+1;
        }
        System.out.println();
    }



}
