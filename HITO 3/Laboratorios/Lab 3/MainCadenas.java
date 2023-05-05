package HIto3;

import Ejercicios.Nombres;

import java.util.Objects;

public class MainCadenas {
    public static void main(String[] args) {
        PilaCadenas nombresEDD = new PilaCadenas();

        nombresEDD.adicionar("William");
        nombresEDD.adicionar("Andres");
        nombresEDD.adicionar("Josias");
        nombresEDD.adicionar("Iris");
        nombresEDD.adicionar("Jonathan");
        nombresEDD.adicionar("Ilia");

//        nombresEDD.llenar(12);
        //nombresEDD.mostrar();
        //CuentaNombres(nombresEDD,"Andres");
        //AgregarNombre3(nombresEDD,"Josias","Ana");
        nombresEDD.mostrar();

        //intercmbioPosicion(nombresEDD);



        intercamvioKesimo(nombresEDD,2);

        nombresEDD.mostrar();

    }


    public static void CuentaNombres(PilaCadenas pila,String nombre){

        PilaCadenas aux = new PilaCadenas();
        String itemEliminar = "";
        int cont = 0;

        while(!pila.esVacio()){
            itemEliminar = pila.eliminar();
            if(Objects.equals(itemEliminar, nombre)){
                cont = cont+1;
            }
            aux.adicionar(itemEliminar);
        }
        pila.vaciar(aux);
        System.out.println("El nombre "+nombre+" se repite " + cont +" veces ");
    }

    public static void AgregarNombre3(PilaCadenas pila,String nombre,String newNombre){

        PilaCadenas aux = new PilaCadenas();
        String itemEliminar = "";


        while(!pila.esVacio()){
            itemEliminar = pila.eliminar();
            if(Objects.equals(itemEliminar, nombre)){
                pila.adicionar(newNombre);
            }
            aux.adicionar(itemEliminar);
        }
        pila.vaciar(aux);
    }


    public static void intercmbioPosicion(PilaCadenas pila){
        PilaCadenas  aux = new PilaCadenas();
        String item = pila.eliminar();
        aux.vaciar(pila);
        String item2 = aux.eliminar();
        pila.adicionar(item);
        pila.vaciar(aux);
        pila.adicionar(item2);

    }

    public static void intercamvioKesimo(PilaCadenas pila, int kesimo){
        PilaCadenas aux = new PilaCadenas();
        String nombreKesimo = " ";
        String itemEliminado = " ";
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(pila.nroElem() == kesimo){
                nombreKesimo = itemEliminado;
            }
            else {
                aux.adicionar(itemEliminado);
            }

        }
        pila.adicionar(nombreKesimo);
        pila.vaciar(aux);
    }

}
