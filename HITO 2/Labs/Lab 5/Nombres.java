public class Nombres {
    private String parealelo;
    private String[] nombres;

    public Nombres(String parealelo,String[] nombres){
        this.parealelo = parealelo;
        this.nombres = nombres;
    }

    public String getParealelo() {
        return parealelo;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setParealelo(String parealelo) {
        this.parealelo = parealelo;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public  void mostrarNombres(){
        for (int i=0;i<this.nombres.length;i++){
            System.out.println(nombres[i]+"  ");
        }
        System.out.println();
    }
}

