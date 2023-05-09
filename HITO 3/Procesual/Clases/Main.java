package HIto3.PilaDeClientes;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Juan","Perez",35,"Calle 123","Masculino");
        Cliente cli2 = new Cliente("Ana","Perez",28,"Avenida 456","Femenino");
        Cliente cli3 = new Cliente("Carlos","Rodriguez",42,"Calle 789","Masculino");
        Cliente cli4 = new Cliente("Maria","Hernandez",23,"Calle 1011","Femenino");
        Cliente cli5 = new Cliente("Luis","Martines",55,"Avenida 1213","Masculino");

        PilaCliente pila = new PilaCliente();

        pila.adicionar(cli1);
        pila.adicionar(cli2);
        pila.adicionar(cli3);
        pila.adicionar(cli4);
        pila.adicionar(cli5);

        /*pila.mostrar();

        mayoresCiertaEdad(pila,25);

        kEsimoPosicion(pila,5);

        pila.mostrar();*/

        /*asignaDireccion(pila,"Avenida La Paz 652");

        pila.mostrar();*/

        reordenaPila(pila);

        pila.mostrar();
    }

    static void mayoresCiertaEdad(PilaCliente pila, int edadMayor){
        PilaCliente aux = new PilaCliente();
        Cliente clienteEliminado = null;
        int cont = 0;
        while (!pila.esVacio()){
            clienteEliminado = pila.eliminar();
            if(clienteEliminado.getEdad()>edadMayor){
                cont = cont+1;
            }
            aux.adicionar(clienteEliminado);
        }
        pila.vaciar(aux);
        System.out.println("Los clientes con una edad mayor a "+edadMayor+" son: " + cont);
    }

    static void  kEsimoPosicion(PilaCliente pila, int valorTope){
        PilaCliente aux = new PilaCliente();
        Cliente nombreKesimo = null;
        Cliente clienteEliminado = null;
        int valor = valorTope - 1;


        while (!pila.esVacio()){
            clienteEliminado = pila.eliminar();

            if(pila.nroElem() == valor){
                nombreKesimo = clienteEliminado;
            }
            else {
                aux.adicionar(clienteEliminado);
            }
        }
        pila.adicionar(nombreKesimo);
        pila.vaciar(aux);
    }

    static void asignaDireccion(PilaCliente pila, String nuevaDireccion){
        PilaCliente aux = new PilaCliente();
        Cliente clienteEleminado = null;
        while (!pila.esVacio()){
            clienteEleminado = pila.eliminar();
            if(Objects.equals(clienteEleminado.getGenero(),"Femenino")){
                clienteEleminado.setDireccion(nuevaDireccion);
            }
            aux.adicionar(clienteEleminado);
        }
        pila.vaciar(aux);
    }

    static void reordenaPila(PilaCliente pila){
        PilaCliente aux1 = new PilaCliente();
        PilaCliente aux2 = new PilaCliente();
        Cliente clienteEliminado = null;

        while (!pila.esVacio()){
            clienteEliminado = pila.eliminar();
            if(clienteEliminado.getGenero().equals("Femenino")){
                aux1.adicionar(clienteEliminado);
            }
            if(clienteEliminado.getGenero().equals("Masculino")){
                aux2.adicionar(clienteEliminado);
            }
        }
        pila.vaciar(aux1);
        pila.vaciar(aux2);
    }

}
