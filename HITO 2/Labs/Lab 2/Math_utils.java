package ejercisio;

public class Math_utils {

    private String nameAPP;
    private String version;
    private int year;
    private String Ci;
    private int Limt;

    public  Math_utils(String nameAPP , String version, int year){
        this.nameAPP= nameAPP ;
        this.version= version;
        this.year = year;
    }

    public void printAPP(){

        System.out.print("APP:" + nameAPP + " - " + version + " - "+ year);
        System.out.println();

    }

 public void generarNumeroNatural(int Limt){

     for (int i = 1; i <= Limt; i++) {

         System.out.print(i+" - ");

     }
     System.out.println();

 }
    public void generarNumeroParNatural(int Limt){

        for (int i = 1; i <= Limt; i++) {

            if (i % 2 == 0) {
                System.out.print(i+" - ");

            }
        }
        System.out.println();


    }
    public void generarExtencionFromCI(String Ci){

        String ext = "";
        ext = Ci.substring(8);
        System.out.print("Extencion = "+ ext);

    }



}
