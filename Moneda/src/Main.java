import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("MENU");
            System.out.println("1 - Dolares a Pesos Argentino" +
                    " 2 - Pesos Argentino a Dolares" +
                    " 3 - Dolares a peso Chileno" +
                    " 4 - Peso Chileno a Dolares" +
                    " 5 - Dolares a Peso Colombiano" +
                    " 6 - Peso Colombiano a Dolares" +
                    " 7 - Salir");
            System.out.println("Ingrese una opción: ");
            Scanner teclado = new Scanner(System.in);
            char opcion = teclado.next().charAt(0);

            switch(opcion){
                case '1':
                    convertir1( 0.0011, "Dolares");
                    break;
                case '2':
                    convertir(880.25 , "Peso Argentino");
                    break;
                case '3':
                    convertir2(0.0011, "Dolares");
                    break;
                case '4':
                    convertir(929.89, "Peso Chileno");
                    break;
                case '5':
                    convertir3(0.00026, "Dolares");
                    break;
                case '6':
                    convertir(3906.82, "Peso Colombiano");
                    break;
                case '7':
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
    static void convertir(double valorDolar, String pais ){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en " + pais);
        double cantidadMoneda = teclado.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares = (double) Math.round(dolares * 100) / 100;

        System.out.println("");
        System.out.println("Tienes $" + dolares + " Dolares");


    }

    static void convertir1(double valorArgentino, String pais ){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en " + pais);
        double cantidadMoneda = teclado.nextDouble();

        double pesoArgentino = cantidadMoneda / valorArgentino;

        pesoArgentino = (double) Math.round(pesoArgentino * 100) / 100;

        System.out.println("");
        System.out.println("Tienes $" + pesoArgentino + " pesos argentino");


    }
    static void convertir2(double valorChileno, String pais ){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en " + pais);
        double cantidadMoneda = teclado.nextDouble();

        double pesoChileno = cantidadMoneda / valorChileno;

        pesoChileno = (double) Math.round(pesoChileno * 100) / 100;

        System.out.println("");
        System.out.println("Tienes $" + pesoChileno + " pesos chileno");


    }

    static void convertir3(double valorColombiano, String pais ){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en " + pais);
        double cantidadMoneda = teclado.nextDouble();

        double pesoColombiano = cantidadMoneda / valorColombiano;

        pesoColombiano = (double) Math.round(pesoColombiano * 100) / 100;

        System.out.println("");
        System.out.println("Tienes $" + pesoColombiano + " pesos colombiano");


    }


}
