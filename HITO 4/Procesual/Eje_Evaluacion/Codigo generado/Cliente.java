package ColaDeClientes;

public class Cliente {

    private String nombres;
    private String apellidos;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente(String nombre, String apellidos, int edad, String pais, String genero, String tipo) {
        this.nombres = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
    }

    public void mostrar(){
        System.out.println("Mostrando datos del cliente");
        System.out.println("Nombres: "+ getNombres());
        System.out.println("Apelidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Pais: " + getPais());
        System.out.println("Tipo: " + getTipo());
        System.out.println();
    }
}
