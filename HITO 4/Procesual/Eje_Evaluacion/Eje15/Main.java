package ColaDeClientes;
public class Main {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Fernando","Floripondio",25,"Bolivia","Masculino","GOLD");
        Cliente cli2 = new Cliente("Smiters","Mamani",69,"Chile","Masculino","VIP");
        Cliente cli3 = new Cliente("Saul","Calle",73,"Peru","Masculino","VIP");
        Cliente cli4 = new Cliente("Fernanda","Mamani",48,"Bolivia","Femenino","SILVER");
        Cliente cli5 = new Cliente("Saul","Choque",35,"Chile","Masculino","GOLD");

        Cliente cli6 = new Cliente("Jhobani","Chupanqui",65,"Peru","Masculino","GOLD");
        Cliente cli7 = new Cliente("Alfredo","Molina",45,"Colombia","Masculino","SILVER");
        Cliente cli8 = new Cliente("Sandra","Calle",73,"Peru","Femenino","VIP");
        Cliente cli9 = new Cliente("Saul","Ramirez",48,"Argentina","Masculino","GOLD");
        Cliente cli0 = new Cliente("Alejandro","Zapata",35,"Bolivia","Masculino","VIP");

        ColaDeClientes colaA = new ColaDeClientes();
        colaA.adicionar(cli1);
        colaA.adicionar(cli2);
        colaA.adicionar(cli3);
        colaA.adicionar(cli4);
        colaA.adicionar(cli5);

        ColaDeClientes colaB = new ColaDeClientes();
        colaB.adicionar(cli6);
        colaB.adicionar(cli7);
        colaB.adicionar(cli8);
        colaB.adicionar(cli9);
        colaB.adicionar(cli0);

        ReordenDeColas(colaA,colaB,"Saul");
        System.out.println("-----------------------Mostrando cola A--------------------------");
        colaA.mostrarColaDeClientes();
        System.out.println("-----------------------Mostrando cola B--------------------------");
        colaB.mostrarColaDeClientes();
    }
    public static void ReordenDeColas(ColaDeClientes colaA,ColaDeClientes colaB,String nombre){
        ColaDeClientes aux1 = new ColaDeClientes();
        ColaDeClientes aux2 = new ColaDeClientes();
        ColaDeClientes aux3 = new ColaDeClientes();
        Cliente clienteEliminado = null;

        while (!colaA.esVacia()){
            clienteEliminado = colaA.eliminar();
            if(clienteEliminado.getNombres().equals(nombre)){
                aux3.adicionar(clienteEliminado);
            }
            else{
                aux1.adicionar(clienteEliminado);
            }
        }

        while (!colaB.esVacia()){
            clienteEliminado = colaB.eliminar();
            if(clienteEliminado.getNombres().equals(nombre)){
                aux3.adicionar(clienteEliminado);
            }
            else {
                aux2.adicionar(clienteEliminado);
            }
        }
        colaA.vaciar(aux1);
        colaB.vaciar(aux3);
        colaB.vaciar(aux2);
    }

}
