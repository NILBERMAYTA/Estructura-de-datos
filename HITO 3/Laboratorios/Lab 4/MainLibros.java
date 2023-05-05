package HIto3.Libros;

import java.util.Objects;

public class MainLibros {
    public static void main(String[] args){

        Libro libro1 = new Libro("Homero",500,30.00,"La odisea","Historia");
        Libro libro2 = new Libro("Homero",300,20.00,"La iliada","Historia");

        PilaDeLibros pila1 = new PilaDeLibros();

        pila1.adicionar(libro1);
        pila1.adicionar(libro2);


        Libro libro3 = new Libro("Marquez",400,40.00,"100 años de soloddad","Historia");
        Libro libro4 = new Libro("Adela",500,30.00,"Juana Azurduy","Historia");

        PilaDeLibros pila2 = new PilaDeLibros();

        pila2.adicionar(libro3);
        pila2.adicionar(libro4);

        pila1.mostrar();
        BuscarMas25(pila1,25);
        descuantoLibro(pila1,"Historia");
        pila1.mostrar();

        ObtenerMaximoPrecio(pila2);
    }

    // cuantos libros tienen un precio mayor a 25

    public static void BuscarMas25(PilaDeLibros pila,double precio){
        PilaDeLibros aux = new PilaDeLibros();
        Libro libroEliminado = null;
        int cont = 0;
        while (!pila.esVacio()){
            libroEliminado = pila.eliminar();
            if(libroEliminado.getPrecio()>precio){
                cont = cont+1;
            }
            aux.adicionar(libroEliminado);
        }
        pila.vaciar(aux);
        System.out.println("Los libros mayores a "+precio+" son: " + cont);
    }

    // a todos los libros de categoria historia dar una rebaja de 10%

    public static void descuantoLibro(PilaDeLibros pila,String categoria){
        PilaDeLibros aux = new PilaDeLibros();
        Libro libroEliminado = null;
        double newprecio = 0;
        double oriprecio = 0;
        while (!pila.esVacio()){
            libroEliminado = pila.eliminar();
            if(Objects.equals(libroEliminado.getCategoria(),categoria)){
                oriprecio = libroEliminado.getPrecio();
                newprecio = oriprecio - 0.1 *oriprecio;
            }
            libroEliminado.setPrecio(newprecio);
            aux.adicionar(libroEliminado);
        }
        pila.vaciar(aux);
    }

    public static double ObtenerMaximoPrecio(PilaDeLibros pila){
        PilaDeLibros aux = new PilaDeLibros();
        Libro libroEliminado = null;
        double max = Integer.MIN_VALUE;
        while (!pila.esVacio()){
            libroEliminado = pila.eliminar();
            if(libroEliminado.getPrecio()>max){
                max = libroEliminado.getPrecio();
            }

            aux.adicionar(libroEliminado);
        }
        pila.vaciar(aux);
        return max;
    }

    public  static void IntetrcambioValor(PilaDeLibros pila1, PilaDeLibros pila2){
        PilaDeLibros aux1 = new PilaDeLibros();
        PilaDeLibros aux2 = new PilaDeLibros();

        


        }
    }

