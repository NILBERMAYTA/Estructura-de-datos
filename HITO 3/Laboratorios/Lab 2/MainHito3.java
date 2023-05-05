package HIto3;

public class MainHito3 {
    public static void main(String[] args) {
        PilaNumeros pila1= new PilaNumeros();
        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23); //valor maximo
        pila1.adicionar(5);


        //pila1.mostrar();

        //muestraValorMax(pila1);

        //pila1.mostrar();

        //Contar(pila1,5);

        //intercambiaMayorPorMenor(pila1);

        pila1.mostrar();
        //cantidadParImpar(pila1);
        AgregaBase(pila1,100);
        pila1.mostrar();
        AgregarBase2(pila1,100);
        pila1.mostrar();
    }

    public static void Contar(PilaNumeros pila, int numero){
        PilaNumeros aux = new PilaNumeros();
        int num = 0;

        int cont = 0;
        while(pila.esVacio() == false){
            num = pila.eliminar();
            if (num == numero){
                cont = cont+1;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("La cantidad es  = "+cont);
    }

    public static int muestraValorMax (PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int num = 0;

        int max = Integer.MIN_VALUE;
        while(pila.esVacio() == false){
            num = pila.eliminar();
            if (num>max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Mayor = "+max);
        return max;
    }

    public static int muestraValorMin (PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int num = 0;

        int menor = Integer.MAX_VALUE;
        while(pila.esVacio() == false){
            num = pila.eliminar();
            if (num<menor){
                menor = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Menor = "+menor);
        return menor;
    }

    public static void intercambiaMayorPorMenor(PilaNumeros pila){
        int max = muestraValorMax(pila);
        int min = muestraValorMin(pila);
        int item = 0;

        PilaNumeros aux = new PilaNumeros();

        while(!pila.esVacio()){
            item = pila.eliminar();

            if(item == max){
                item = min;
            }
            else{
                if(item == min){
                    item = max;
                }
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
    }

    public static void cantidadParImpar(PilaNumeros pila) {

        int item = 0;
        int cimpar=0;
        int cpar=0;

        PilaNumeros aux = new PilaNumeros();
        while(!pila.esVacio())
        {
            item = pila.eliminar();

            if(item % 2 == 0)
            {
                cpar++;
            }
            else
            {
                if(item % 2 != 0)
                {
                    cimpar++;
                }
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);

        System.out.println("Cantidad de pares"+ cimpar);
        System.out.println("Cantidad de impares"+ cpar);
    }

    public static void AgregaBase(PilaNumeros pila, int newnum){
        PilaNumeros aux = new PilaNumeros();

        int num =0;

        while (!pila.esVacio()){

            num = pila.eliminar();
            aux.adicionar(num);
        }
        aux.adicionar(newnum);
        pila.vaciar(aux);
    }


    public static void AgregarBase2(PilaNumeros pila, int item){
        PilaNumeros aux = new PilaNumeros();
        aux.vaciar(pila);
        aux.adicionar(item);
        pila.vaciar(aux);
    }



}



