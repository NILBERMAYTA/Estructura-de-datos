package ColaDeClientes;
public class Main {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Fernando","Floripondio",25,"Bolivia","Masculino","GOLD");
        Cliente cli2 = new Cliente("Smiters","Mamani",69,"Chile","Masculino","VIP");
        Cliente cli3 = new Cliente("Saul","Calle",73,"Peru","Masculino","VIP");
        Cliente cli4 = new Cliente("Fernanda","Mamani",48,"Bolivia","Femenino","SILVER");
        Cliente cli5 = new Cliente("Saul","Choque",35,"Chile","Masculino","GOLD");


        ColaDeClientes colaA = new ColaDeClientes();
        colaA.adicionar(cli1);
        colaA.adicionar(cli2);
        colaA.adicionar(cli3);
        colaA.adicionar(cli4);
        colaA.adicionar(cli5);


        Nacionalidad_VIP(colaA,"GOLD","Bolivia");
        colaA.mostrarColaDeClientes();

    }

    public static void Nacionalidad_VIP(ColaDeClientes cola,String tipoCli,String nacionalidad){
        ColaDeClientes aux = new ColaDeClientes();
        Cliente clienteEliminado = null;

        while (!cola.esVacia()){
            clienteEliminado = cola.eliminar();
            if(clienteEliminado.getPais().equals(nacionalidad) && clienteEliminado.getTipo().equals(tipoCli)){
                clienteEliminado.setTipo("VIP");
            }
            aux.adicionar(clienteEliminado);
        }
        cola.vaciar(aux);
    }
}
