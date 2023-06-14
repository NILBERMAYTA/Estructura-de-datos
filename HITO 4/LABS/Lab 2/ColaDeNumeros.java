package ColasH4;


public class ColaDeNumeros {
    private int max;
    private int fin;
    private int ini;
    private int[] numeros;

    public ColaDeNumeros(){
        this.max=100;
        this.ini=0;
        this.fin=0;
        this.numeros=new int[this.max+1];

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
    public void adicionar(int nuevoNumero){
        if(esllena()){
            System.out.println("no hay espacio");
        }
        else {
            fin=fin+1;
            numeros[fin]=nuevoNumero;
        }

    }

    public int eliminar(){

        int itemEliminado=0;
        if(esVacia()){
            System.out.println("no hay numeros");
        }
        else {
            ini=ini+1;
            itemEliminado=numeros[ini];
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
    public int nroIni(){
        return ini;
    }
    public int nroFin(){
        return fin ;
    }

    public void vaciar(ColaDeNumeros cola){

        while (!cola.esVacia()){

            adicionar(cola.eliminar());
        }

    }

    public void mostrarColas(){

        int numeros=0;
        if(esVacia()){
            System.out.println("No hay numeros");
        }
        else {
            System.out.println();
            System.out.println("Mostrar a los numeros");
            System.out.println();
            ColaDeNumeros aux = new ColaDeNumeros();
            while(!esVacia()){
                numeros = eliminar();
                System.out.println("Numero:" + numeros);
                aux.adicionar(numeros);
            }
            vaciar(aux);
        }
    }
}
