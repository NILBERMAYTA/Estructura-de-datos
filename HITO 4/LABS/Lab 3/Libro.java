package ColasH4.Cola_objetos;

public class Libro {


    /*que son los comportamientos de las clases, son los metodos que tiene la clase */
    /*camel case means nombras cosas colocando primero mayuscula despues miniscula */

    private int codigo_libro;
    private String autor;
    private String genero;

    private String categoria;
    private int paginas;

    public int getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(int codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Libro(int codigo_libro, String autor, String genero, String categoria, int paginas) {
        this.codigo_libro = codigo_libro;
        this.autor = autor;
        this.genero = genero;
        this.categoria = categoria;
        this.paginas = paginas;
    }

    public void mostrar (){

        System.out.println("mostrando datos del libro");
        System.out.println("codigo: "+ getCodigo_libro());
        System.out.println("Autor: " + getAutor());
        System.out.println("Genero: " + getGenero());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Paginas: " + getPaginas());
        System.out.println();




    }
}