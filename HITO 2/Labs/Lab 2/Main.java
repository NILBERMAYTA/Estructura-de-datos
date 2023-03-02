
import ejercisio.Math_utils;
import ejercisio.Student;

public class Main {
    public static void main(String[] args) {

        /*Ejercisios eje1 = new Ejercisios();
        eje1.mostrarMensaje();

        eje1.generarNumerosNaturales();

        eje1.generarNumerosPares();

        eje1.generarNumerosNaturalesWhile();
*/

        /*Math_utils lab1 = new Math_utils("HP","0.1v",2022 );
        lab1.printAPP();
        lab1.generarNumeroParNatural(10 );
        lab1.generarNumeroNatural(21);
        lab1.generarExtencionFromCI("12345678CB");
*/
        Student x = new Student("Pepito ","pep",25);


        String nombre = x.getFullName();
        System.out.println("Nombre "+nombre);


        x.setFulname("Pepito1");
        String newName = x.getFullName();
        System.out.println("Nuevo nombre "+newName);

        String apellido = x.getLastname();
        System.out.println("Apellido "+apellido);

        x.setlastname("Pep1");
        String newAp = x.getLastname();
        System.out.println("Nuevo apellido "+newAp);

        int age = x.getAge();
        System.out.println("Edad "+age);

        x.setAge(38);
        int newAge = x.getAge();
        System.out.println("Nueva edad "+newAge);


















        /*System.out.println("Hello world!");*/

        /*for (int i = 1; i < 11; i++){


            System.out.println("i:"+i);


        }
        for (int i = 1; i < 11; i++){


            System.out.print(i+",");


        }

        for (int i = 1; i <= 20; i++){

         if(i % 2 == 0){
            System.out.println(i);

            }
        }
        int i;
        i=0;
        while (i<=5){

            System.out.println(i);
            i=i+1;
        }

        int i;
        i=2;
        while (i<=10){

            System.out.println(i);
            i=i+2;
        }
*/




    }
}