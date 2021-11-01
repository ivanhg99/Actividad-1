import java.util.Scanner;

public class Arrays {
    public static void ejercicio1() {
        int numeros[];
        numeros = new int[4];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el numero"+" "+(1+contador));
            numeros[contador] = sc.nextInt();
            contador++;
        }while (contador< numeros.length);
        int suma = 0;
        for (int i= 0; i<numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println(suma);
        double media = suma/numeros.length;
        System.out.println(media);
    }

    public static void ejercicio2() {
        float numeros[];
        numeros = new float[5];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el numero"+" "+(1+contador));
            numeros[contador] = sc.nextFloat();
            contador++;
        }while (contador< numeros.length);
        System.out.println(numeros[4]+" "+numeros[3]+" "+numeros[2]+" "+numeros[1]+" "+numeros[0]);
    }

    public static void ejercicio3() {
        int mes[];
        mes = new int[3];
        mes[0] = 30;
        mes[1] = 31;
        mes[2] = 28;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del mes");
        int nmes = sc.nextInt();
        if (nmes == 1 || nmes == 3 || nmes == 5 || nmes == 7 || nmes == 8 || nmes == 10 || nmes == 12) {
            System.out.println(mes[1]);
        } else if (nmes == 4 || nmes == 6 || nmes == 9 || nmes == 11) {
            System.out.println(mes[0]);
        } else {
            System.out.println(mes[2]);
        }
    }

    public static void ejercicio4() {
        int numeros[];
        numeros = new int[6];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el numero"+" "+(1+contador));
            numeros[contador] = sc.nextInt();
            contador++;
        }while (contador< numeros.length);
        System.out.println(numeros[5]+" "+numeros[4]+" "+numeros[3]+" "+numeros[2]+" "+numeros[1]+" "+numeros[0]);
    }

    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros quieres almacenar?");
        int numeros = sc.nextInt();
        int num[];
        num = new int[numeros];
        int contador= 0;
        do {
            System.out.println("Introduce el numero"+" "+(1+contador));
            num[contador] = sc.nextInt();
            contador++;
        }while (contador< num.length);
        System.out.println("Has introducido " + contador + " numeros");
        int suma = 0;
        for (int i= 0; i<num.length; i++){
            suma += num[i];
        }
        double media = suma/num.length;
        System.out.println("Su media es: "+media);
    }

    public static void ejercicio6() {
        double numeros[];
        numeros = new double[10];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el numero" + " " + (1 + contador));
            numeros[contador] = sc.nextDouble();
            contador++;
        } while (contador < numeros.length);
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double media = suma / numeros.length;
        System.out.println(media);
        for (int a = 0; a < 10; a++) {
            if (media <= numeros[a]) {
                System.out.println(numeros[a]+" esta por encima de la media");
            } else {
                System.out.println(numeros[a]+" no esta por encima de la media");
            }
        }
    }

    public static void ejercicio7() {
        int mes[];
        mes = new int[13];
        mes[1] = 0;
        mes[2] = 31;
        mes[3] = 59;
        mes[4] = 90;
        mes[5] = 120;
        mes[6] = 151;
        mes[7] = 181;
        mes[8] = 212;
        mes[9] = 243;
        mes[10] = 273;
        mes[11] = 304;
        mes[12] = 334;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del mes");
        int nmes = sc.nextInt();
        System.out.println("Introduce el numero del dia");
        int ndias = sc.nextInt();
        if (nmes <= 12) {
            System.out.println("Este es el dia del año "+(mes[nmes]+ndias));
        } else {
            System.out.println("No es un mes valido");
        }
    }

    public static void ejercicio8() {
        int mes[];
        mes = new int[13];
        mes[1] = 0;
        mes[2] = 31;
        mes[3] = 59;
        mes[4] = 90;
        mes[5] = 120;
        mes[6] = 151;
        mes[7] = 181;
        mes[8] = 212;
        mes[9] = 243;
        mes[10] = 273;
        mes[11] = 304;
        mes[12] = 334;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del mes");
        int nmes = sc.nextInt();
        System.out.println("Introduce el numero del dia");
        int ndias = sc.nextInt();
        if (nmes <= 12) {
            System.out.println(366-(mes[nmes]+ndias) +" dias para terminar el año");
        } else {
            System.out.println("No es un mes valido");
        }
    }

    public static void ejercicio9() {
        String nombrev="";
        String nombres[];
        nombres = new String[10];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un nombre");
            nombres[contador] = sc.nextLine();
            contador++;
        }while (contador< nombres.length);

        do {
            System.out.println("Introduce un nombre que ya se encuentre o fin");
            nombrev = sc.nextLine();
            for (contador = 0; contador < nombres.length;contador++){
                if (nombres[contador].equals(nombrev)){
                    System.out.println("El nombre " + nombrev + " esta en la posicion "+(contador+1));

                }
            }
        }while (!nombrev.equals("fin"));
        System.out.println("Has introducido fin adios");
    }

    public static void ejercicio10() {
        String nombres[];
        nombres = new String[100];
        int contador = -1;
        Scanner sc = new Scanner(System.in);
        do {
            contador++;
            System.out.println("Introduce un nombre o 0 cuando quieras finalizar y ver tu lista de nombres");
            nombres[contador] = sc.nextLine();

        }while (contador< nombres.length && !nombres[contador].equals("0"));
        for (int i = 0; i < contador;i++){
            System.out.println(nombres[i]);
            }

    }

    public static void ejercicio11() {
        int vector[];
        vector = new int[3];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el vector " + (contador+1));
            vector[contador] = sc.nextInt();
            contador++;
        }while (contador< vector.length);
        double cuadrado = 0;
        for (int i = 0; i < vector.length;i++){
            cuadrado += (vector[i] * vector[i]);
        }
        System.out.println("El resultado de la raiz cuadrada de " + cuadrado + " es: " + Math.sqrt(cuadrado));
    }

    public static void ejercicio12() {
        int vector1[];
        vector1 = new int[3];
        int vector2[];
        vector2 = new int[3];
        int contador = 0;
        int contador2 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce del vector 1 el componente " + (contador+1));
            vector1[contador] = sc.nextInt();
            contador++;
        }while (contador< vector1.length);
        do {
            System.out.println("Introduce del vector 2 el componente " + (contador2+1));
            vector2[contador2] = sc.nextInt();
            contador2++;
        }while (contador2< vector2.length);
        int suma = 0;
        for (int i = 0; i < vector1.length;i++){
            suma = (vector1[i] + vector2[i]);
            System.out.println("La suma de los vectores es " + suma);
        }
    }

    public static void main (String[]args){
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
    }
}


