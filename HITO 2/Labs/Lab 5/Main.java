
public class Main {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        nombres[0]="Ana";
        nombres[1]="Juan";
        nombres[2]="Pepito";
        nombres[3]="Carla";
        nombres[4]="Freddy";

        Nombres edd = new Nombres("EDD",nombres);
        Determinarnombre(edd);
        //AgregarNombre(edd,"Delia");
        //edd.mostrarNombres();
        AgregarFinal(edd,"Nilber");
        edd.mostrarNombres();
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
    public static void AgregarNombre(Nombres edd,String nombreAgregar){
        String[] nombresOri = edd.getNombres();
        String[] nuevosNombres = new String[nombresOri.length+1];

        nuevosNombres[0] = nombreAgregar;
        for (int i=0;i < nombresOri.length; i++){
            nuevosNombres[i+1] = nombresOri[i];
        }
        edd.setNombres(nuevosNombres);
    }

    public static void AgregarFinal(Nombres edd,String nuevoNombre){
        String[] nombresOri = edd.getNombres();
        String[] nuevosNom = new String[nombresOri.length+1];
        for(int i =0;i<nombresOri.length;i++){
            nuevosNom[i]=nombresOri[i];
        }
        nuevosNom[nombresOri.length]=nuevoNombre;
        edd.setNombres(nuevosNom);
    }

}
