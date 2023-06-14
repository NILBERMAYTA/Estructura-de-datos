package ColaDeClientes;

public class ColaDeClientes {
    private int max;
    private int fin;
    private int ini;
    private Cliente[] clientes;

    public ColaDeClientes(){
        this.max=100;
        this.ini=0;
        this.fin=0;
        this.clientes =new Cliente[this.max+1];

    }

    public boolean esVacia(){ //la cola es vacio

        if(ini==0 && fin==0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean esllena(){
        if(fin==max){
            return true;
        }
        else {
            return false;
        }
    }
    public void adicionar(Cliente nuevoCliente){
        if(esllena()){
            System.out.println("no hay espacio");
        }
        else {
            fin=fin+1;
            clientes[fin]=nuevoCliente;
        }

    }

    public Cliente eliminar(){

        Cliente itemEliminado = null;
        if(esVacia()){
            System.out.println("no hay clientes");
        }
        else {
            ini=ini+1;
            itemEliminado=clientes[ini];
            if(ini == fin){
                ini=0;
                fin=0;
            }
        }
        return itemEliminado;
    }
    public int nroElementos(){
        return fin - ini;
    }

    public void vaciar(ColaDeClientes cola){

        while (!cola.esVacia()){

            adicionar(cola.eliminar());
        }

    }

    public void mostrarColaDeClientes(){
        if(esVacia()){
            System.out.println("No hay clientes");
        }
        else {
            Cliente elementoEliminado;
            System.out.println();
            System.out.println("Mostrando clientes");
            System.out.println();
            ColaDeClientes aux = new ColaDeClientes();
            while(!esVacia()){
                elementoEliminado = eliminar();
                elementoEliminado.mostrar();
                aux.adicionar(elementoEliminado);
            }
            vaciar(aux);
        }
    }
}
