package HIto3;

import java.util.Scanner;

public class PilaCadenas {
    private int max;
    private int tope;
    private String[] cadenas;

    public PilaCadenas(){
        this.max = 10;
        this.tope = 0;
        this.cadenas = new String[max+1];

    }
    public boolean esVacio(){
        if (tope==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esllena(){
        if (tope==max){
            return true;
        }
        else{
            return false;
        }

    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(String nuevoNombre){

        if(esllena() == true){
            System.out.println("Pila llena");

        }
        else{
            tope= tope+1;
            cadenas[tope] = nuevoNombre;
        }
    }
    public String eliminar(){
        String itemEliminado = " ";

        if(esVacio() == true){
            System.out.println("Pila Vacia");
        }
        else{
            itemEliminado = cadenas[tope];
        }

        tope = tope-1;

        return itemEliminado;
    }

    public void llenar(int nroItems){

        Scanner leer = new Scanner(System.in);
        String nombre =" ";
        System.out.println("Llenando pila de nombres(cadenas)");

        for(int i = 0; i<nroItems;i++){
            System.out.println("Ingrese el nombre: "+(i+1)+": ");
            //este metodo me premite leer una cadena
            nombre = leer.nextLine();
            adicionar(nombre);
            System.out.println();
        }
    }
    public void vaciar(PilaCadenas pila){

        while (pila.esVacio()==false){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        String item="";
        if(esVacio()==true){
            System.out.println("No hay items a mostrar");
        }
        else {
            System.out.println("mostrando la Pila de elementos");
            PilaCadenas aux = new PilaCadenas();
            while(esVacio()==false){
                item = eliminar();
                System.out.println("NOMBRE = "+ item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}
