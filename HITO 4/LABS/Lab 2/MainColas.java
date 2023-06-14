package ColasH4;


public class MainColas {
    public static void main(String[] args) {
        ColaDeNumeros cola = new ColaDeNumeros();
        cola.adicionar(4);
        cola.adicionar(6);
        cola.adicionar(8);
        cola.adicionar(3);
        cola.adicionar(4);
        cola.adicionar(100);

        /*cola.mostrarColas();

        Divisiblestres(cola);*/

        //EliminarRepetidos(cola);

        //System.out.println(VerificaRepetido(cola,4));
        EliminarRepetidos(cola);
        cola.mostrarColas();

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

    public static boolean VerificaRepetido(ColaDeNumeros cola, int num){
        int cont = 0;
        int item = 0;
        int nroElem = cola.nroElementos();

        for (int i=1;i<=nroElem;i++ ){
            item = cola.eliminar();
            if (item == num){
                cont = cont + 1;
            }
            else{
                cola.adicionar(item);
            }
        }


        if(cont > 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void EliminarRepetidos(ColaDeNumeros cola) {
        int nroElem = cola.nroElementos();
        int item;

        for (int i = 1; i <= nroElem; i++) {
            item = cola.eliminar();
            if (!VerificaRepetido(cola, item)) {
                cola.adicionar(item);
            }
        }
    }

}
