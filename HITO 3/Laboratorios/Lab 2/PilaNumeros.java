package HIto3;

public class PilaNumeros {
    //cuando haya una pila siempre tiene que tener un maximo y un minimo
    private int max;
    private int tope;
    private int[] numeros;

    public PilaNumeros(){
        this.max = 10;
        this.tope = 0;
        this.numeros = new int[this.max + 1];
    }

    public boolean esVacio(){
        if (this.tope == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean esLlena(){
        if (this.tope == this.max){
            return true;
        }
        else {
            return false;
        }
    }
    public int nroElemntos(){
        return this.tope;
    }
    //Procesos de validacion

    public void adicionar(int nuevoNumero){
        if(esLlena() == true){
            System.out.println("Pila llena");
        }
        else{
            this.tope = tope+1;
            this.numeros[tope] = nuevoNumero;
        }
    }
    public int eliminar(){
        int itemEliminado = 0;
        if(esVacio() == true){
            System.out.println("Pila Vacia");
        }
        else{
            itemEliminado = this.numeros[tope];
            this.tope = tope-1;
        }
        return itemEliminado;
    }

    public void vaciar(PilaNumeros pila){
        while (pila.esVacio() == false) {
            adicionar(pila.eliminar());
        }
    }
    public void mostrar(){
        int item = 0;
        if(esVacio() == true){
            System.out.println("No hay items que mostrar");
        }
        else{
            System.out.println("Mostrando pila de numeros");
            PilaNumeros aux = new PilaNumeros();
            while(esVacio() == false){
                item = eliminar();
                System.out.println("Numero = "+item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }

    public void llenar(){

    }


}
