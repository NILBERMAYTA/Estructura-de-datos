package ColasH4.Cola_objetos;


public class ColaDeLibros {
    private int max;
    private int fin;
    private int ini;
    private Libro[] libros;

    public ColaDeLibros(){
        this.max=100;
        this.ini=0;
        this.fin=0;
        this.libros =new Libro[this.max+1];

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
    public void adicionar(Libro nuevoLibro){
        if(esllena()){
            System.out.println("no hay espacio");
        }
        else {
            fin=fin+1;
            libros[fin]=nuevoLibro;
        }

    }

    public Libro eliminar(){

        Libro itemEliminado = null;
        if(esVacia()){
            System.out.println("no hay libros");
        }
        else {
            ini=ini+1;
            itemEliminado=libros[ini];
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

    public void vaciar(ColaDeLibros cola){

        while (!cola.esVacia()){

            adicionar(cola.eliminar());
        }

    }

    public void mostrarColaDeLibros(){
        if(esVacia()){
            System.out.println("No hay libros");
        }
        else {
            Libro elementoEliminado;
            System.out.println();
            System.out.println("Mostrar a los numeros");
            System.out.println();
            ColaDeLibros aux = new ColaDeLibros();
            while(!esVacia()){
                elementoEliminado = eliminar();
                elementoEliminado.mostrar();
                aux.adicionar(elementoEliminado);
            }
            vaciar(aux);
        }
    }
}
