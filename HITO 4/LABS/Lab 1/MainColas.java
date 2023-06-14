package ColasH4;

import defensa_pilas_hito3.Estudiante;
import defensa_pilas_hito3.PilaEstudiantes;

public class MainColas {
    public static void main(String[] args) {
        ColaDeNumeros cola = new ColaDeNumeros();
        cola.adicionar(3);
        cola.adicionar(9);
        cola.adicionar(5);
        cola.adicionar(4);
        cola.adicionar(6);
        cola.adicionar(7);

        cola.mostrarColas();

        Divisiblestres(cola);
    }

    public static void Divisiblestres(ColaDeNumeros cola){
        ColaDeNumeros aux = new ColaDeNumeros();
        int numeroEliminado = 0;
        int cont = 0;

        while (!cola.esVacia()){
            numeroEliminado = cola.eliminar();
            if(numeroEliminado%3==0){
                cont = cont+1;
            }
            aux.adicionar(numeroEliminado);
        }
        cola.vaciar(aux);
        System.out.println("Los divisibles de 3 son: " + cont);
    }

    public static void EliminarRepetidos(ColaDeNumeros cola){
        ColaDeNumeros aux = new ColaDeNumeros();
        int numeroEliminado = 0;
        int cont = 0;

        while (!cola.esVacia()){
            numeroEliminado = cola.eliminar();
            if(numeroEliminado%3==0){
                cont = cont+1;
            }
            aux.adicionar(numeroEliminado);
        }
        cola.vaciar(aux);
        System.out.println("Los divisibles de 3 son: " + cont);
    }

}
