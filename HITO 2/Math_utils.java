package Ejercicios;

public class Math_utils {
    private String nameAPP;
    private String version;
    private int year;

    public Math_utils(String nameAPP,String version,int year){
        this.nameAPP = nameAPP;
        this.version = version;
        this.year = year;
    }

    public void printAPP(){
        System.out.println(this.nameAPP+" - "+this.version+" - "+this.year);
    }

    public void generateNaturalNumbers(int limit){
        for (int i=1 ; i<=limit ; i++){
            System.out.print(1+"  ");
        }
        System.out.println();

    }

    public void generatepairNumbers(int limit){

    }

    public void getExtencionFromCI(String ci){

    }
}
