package Pilas;

public class MainNombre {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        nombres[0]="Ana";
        nombres[1]="Juan";
        nombres[2]="Pepito";
        nombres[3]="Carla";
        nombres[4]="Freddy";

        Nombres edd = new Nombres("EDD",nombres);
        Determinarnombre(edd);
    }

    public static void Determinarnombre(Nombres edd){
        String[] pep = edd.getNombres();
        int resp =0;
        for(int i=0 ; i< pep.length;i++ ){
            if(pep[i] == "Pepito"){
                resp=resp+1;
            }
        }
        System.out.println(resp);
    }
}
