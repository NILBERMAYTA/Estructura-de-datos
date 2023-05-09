package HIto3.PilaDeClientes;

public class Cliente {
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String genero;

    public Cliente(String nombre, String apellido, int edad, String direccion, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void muetraCliente(){
        System.out.println("Mostrando Cliente");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
        System.out.println("Genero: "+genero);
        System.out.println();
    }

}
