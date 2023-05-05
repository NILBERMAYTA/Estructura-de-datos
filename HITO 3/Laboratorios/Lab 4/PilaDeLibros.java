package HIto3.Libros;


import java.util.Scanner;

public class PilaDeLibros {
    private int max;
    private int tope;
    private Libro[] libros;

    public PilaDeLibros(){
        this.max = 10;
        this.tope = 0;
        this.libros = new Libro[max+1];

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

    public void adicionar(Libro nuevoLibro){

        if(esllena()){
            System.out.println("Pila de libros es llena");

        }
        else{
            tope= tope+1;
            libros[tope] = nuevoLibro;
        }
    }
    public Libro eliminar(){
        Libro libroEliminado = null;

        if(esVacio()){
            System.out.println("Pila de libros Vacia");
        }
        else{
            libroEliminado = libros[tope];
        }

        tope = tope-1;

        return libroEliminado;
    }

    public void vaciar(PilaDeLibros pila){

        while (!pila.esVacio()){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        Libro libro = null;
        if(esVacio()){
            System.out.println("No hay libros que mostrar");
        }
        else {
            System.out.println("Mostrando la Pila de libros");
            System.out.println();
            PilaDeLibros aux = new PilaDeLibros();
            while(!esVacio()){
                libro = eliminar();
                aux.adicionar(libro);
                libro.mostrarLibro();
            }
            vaciar(aux);
        }
    }
    public void llenar(int nroItems){


    }
}
