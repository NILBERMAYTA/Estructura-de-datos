package ColasH4.Cola_objetos;


public class Main_Libros {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1,"Juan","Masculino","MANGA",80);
        Libro libro2 = new Libro(2,"Saul","Masculino","MANGA",100);
        Libro libro3 = new Libro(3,"Ana","Femenino","HISTORIA",40);
        Libro libro4 = new Libro(4,"Micaela","Femenino","HISTORIA",30);
        Libro libro5 = new Libro(5,"Pepito","otro","NOVELA",20);
        Libro libro6 = new Libro(6,"Pep","otro","NOVELA",20);
        Libro libro7 = new Libro(7,"Carlos","Masculino","NOVELA",300);

        ColaDeLibros cola = new ColaDeLibros();
        cola.adicionar(libro1);
        cola.adicionar(libro2);
        cola.adicionar(libro3);
        cola.adicionar(libro4);
        cola.adicionar(libro5);
        cola.adicionar(libro6);
        cola.adicionar(libro7);

        //cola.mostrarColaDeLibros();

        //Menor_Paginas(cola).mostrar(); //para mostrar un return

        //ReordenarCola(cola);
        //cola.mostrarColaDeLibros();
        OrdenaPorCantidadDePaginas(cola);
    }
    // crear un metodo estatico que muestre el libro con menor paginas
    public static Libro Menor_Paginas(ColaDeLibros cola){
        ColaDeLibros aux = new ColaDeLibros();
        Libro libroMenor = null;
        int paginasMenor = Integer.MAX_VALUE;

        while (!cola.esVacia()){
            Libro item = cola.eliminar();
            if(item.getPaginas()< paginasMenor){
                paginasMenor = item.getPaginas();
                libroMenor = item;
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        return libroMenor;

    }

    //reordenar la cola de acuerdo al genero al principio deve estar femenino despues los masculinos y luego los otros
    public static void ReordenarCola(ColaDeLibros colaDeLibros){
        ColaDeLibros aux1 = new ColaDeLibros();
        ColaDeLibros aux2 = new ColaDeLibros();
        ColaDeLibros aux3 = new ColaDeLibros();
        Libro item = null;
        while (!colaDeLibros.esVacia()){
            item = colaDeLibros.eliminar();
            if(item.getGenero().equals("Femenino")){
                aux1.adicionar(item);
            }
            if(item.getGenero().equals("Masculino")){
                aux2.adicionar(item);
            }
            if(item.getGenero().equals("otro")){
                aux3.adicionar(item);
            }
        }
        colaDeLibros.vaciar(aux1);
        colaDeLibros.vaciar(aux2);
        colaDeLibros.vaciar(aux3);
    }

    // ordenar la cola de manera acendente la cola de numeros segun en numero de paginas

    public static void OrdenaPorCantidadDePaginas(ColaDeLibros colaDeLibros) {
        ColaDeLibros ordenado = new ColaDeLibros();
        ColaDeLibros aux = new ColaDeLibros();
        int nroElem = colaDeLibros.nroElementos();
        for (int i = 1; i <= nroElem; i++) {
            Libro libro = Menor_Paginas(colaDeLibros);
            while (!colaDeLibros.esVacia()) {
                Libro item = colaDeLibros.eliminar();
                if (item.getCodigo_libro() == libro.getCodigo_libro()) {
                    ordenado.adicionar(item);
                } else {
                    aux.adicionar(item);
                }
            }
            colaDeLibros.vaciar(aux);
        }
        colaDeLibros.vaciar(ordenado);
        colaDeLibros.mostrarColaDeLibros();
    }
}
