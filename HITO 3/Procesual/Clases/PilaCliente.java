package HIto3.PilaDeClientes;


public class PilaCliente {
    private int max;
    private int tope;
    private Cliente[] clientes;

    public PilaCliente(){
        this.max = 10;
        this.tope = 0;
        this.clientes = new Cliente[max+1];

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

    public void adicionar(Cliente nuevoClienete){

        if(esllena()){
            System.out.println("Pila de clientes esta llena");

        }
        else{
            tope= tope+1;
            clientes[tope] = nuevoClienete;
        }
    }
    public Cliente eliminar(){
        Cliente libroEliminado = null;

        if(esVacio()){
            System.out.println("Pila de libros Vacia");
        }
        else{
            libroEliminado = clientes[tope];
        }

        tope = tope-1;

        return libroEliminado;
    }

    public void vaciar(PilaCliente pila){

        while (!pila.esVacio()){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        Cliente cliente = null;
        if(esVacio()){
            System.out.println("No hay libros que mostrar");
        }
        else {
            System.out.println("Mostrando la Pila de Clientes");
            System.out.println();
            PilaCliente aux = new PilaCliente();
            while(!esVacio()){
                cliente = eliminar();
                aux.adicionar(cliente);
                cliente.muetraCliente();
            }
            vaciar(aux);
        }
    }
    public void llenar(int nroItems){

    }
}
