package Pilas;

public class Main {
    public static void main(String[] args) {
        int[] edades1 = new int[5];
        edades1[0] = 33;
        edades1[1] = 19;
        edades1[2] = 20;
        edades1[3] = 42;
        edades1[4] = 25;
        int[] edades2 = new int[5];
        edades2[0] = 30;
        edades2[1] = 20;
        edades2[2] = 19;
        edades2[3] = 15;
        edades2[4] = 25;
        Edades1 obj1 = new Edades1("Unifranz", "ADD", edades1);
        Edades2 obj2 = new Edades2("Unifranz", "DBA_III", edades2);

        obj1.mostrar1();
        obj2.mostrar2();
        intercambioValores(obj1, obj2);
        obj1.mostrar1();
        obj2.mostrar2();
        determinaEdadMayor(obj1);
        intercambioValores(obj1,obj2);
        determinaEdadMenor(obj1);

    }
    public static int determinaEdadMayor(Edades1 obj1){
        int[] edades =obj1.getEdades1();
        int mayor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]> mayor){
                mayor = edades[i];
            }


        }
        System.out.println("resultado: "+ mayor);
        return mayor;
    }
    public static int determinaEdadMayor(Edades2 obj2){
        int[] edades =obj2.getEdades2();
        int mayor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]> mayor){
                mayor = edades[i];
            }


        }
        System.out.println("resultado: "+ mayor);
        return mayor;
    }
    public static void intercambioValores(Edades1 obj1, Edades2 obj2) {

        int mayorEdd = determinaEdadMayor(obj1);
        System.out.println(" amayor edad par EDD: " + mayorEdd);
        int mayorDBA = determinaEdadMayor(obj2);
        System.out.println(" amayor edad par EDD: " + mayorDBA);

        int[] edadesEDD = obj1.getEdades1();
        int[] edadesBDA = obj2.getEdades2();

        for(int i = 0; i < edadesBDA.length;i++){
            if(edadesBDA[i] == mayorDBA){
                edadesBDA[i] = mayorEdd;
            }
        }
        for(int i = 0; i < edadesEDD.length;i++){
            if(edadesEDD[i] == mayorEdd){
                edadesEDD[i] = mayorDBA;
            }
        }
    }
    public static int determinaEdadMenor(Edades2 obj2){
        int[] edades =obj2.getEdades2();
        int mayor = edades[0];
        for (int i =1 ; i > edades.length ; i++){

            if(edades[i]> mayor){
                mayor = edades[i];
            }
        }
        System.out.println("resultado: "+ mayor);
        return mayor;


    }
    public static int determinaEdadMenor(Edades1 obj1){
        int[] edades =obj1.getEdades1();
        int menor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]< menor){
                menor = edades[i];
            }


        }
        System.out.println("resultado menor: "+ menor);
        return menor;
    }
    public static void intercambioValores2(Edades1 obj1, Edades2 obj2){

    }
}

