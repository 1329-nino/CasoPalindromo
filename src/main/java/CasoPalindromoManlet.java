import java.util.Scanner;

public class CasoPalindromoManlet {

    public static void menu() {
        System.out.println("Elige una opción");
        System.out.println("[1] Revisar si es palíndromo");
        System.out.println("[2] Salir");
    }

    public static String elegirOpcion() {

        System.out.println("Ingrese una opción");
        return new Scanner(System.in).nextLine();
    }

    public static Integer ingresarEntrada() {

        try {
            return Integer.parseInt(elegirOpcion());
        } catch (NumberFormatException e) {
            System.err.println("ERROR: vuelva a ingresar la opción");
            return ingresarEntrada();
        }
    }

    public static boolean isPalindromo(String palabra) {           //métodos que empiecen con "is" son boolean

        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        return palabra.equals(palabraInvertida);
    }

    public static boolean verificarLargo(String palabra){       //Un plaíndromo necesita mínimo 2 letras

        return palabra.length() >= 2;
    }

    public static String pasarAMinuscula(String palabra){

        return palabra.toLowerCase();
    }

    public static String quitarTilde(String palabra) {

        String tildes = "áéíóú";
        String normales = "aeiou";

        for (int i = 0; i < normales.length(); i++) {

            palabra = palabra.replace(tildes.charAt(i), normales.charAt(i));
        }

        return palabra;
    }

    public static String quitarSignos(String palabra){

        String signos = "[$&+,:;=?@#|/\\'<>.-^*()%!]";

        for (int i = 0; i < signos.length(); i++) {

            palabra = palabra.replace(signos.charAt(i),' ');    //Se hace con comilla simple porque es un caracter
        }

        return palabra;
    }

    public static String quitarEspacio(String palabra){

        return palabra.replace(" ","");
    }

    /*
    public static boolean verificarPalindromo(){

        String palabra = elegirOpcion();
        if(!verificarLargo(palabra)){

        }
    }

    public static void iniciarPrograma() {

        menu();
        int opcion = ingresarEntrada();
        switch (opcion) {
            case 1 -> {
                if (()) {
                    System.out.println("El texto ingresado es palíndromo");
                } else {
                    System.out.println("El texto ingresado no es palíndromo");
                }
            }
            case 2 -> {
                System.out.println("Adiós");
                System.out.println("----------------------");
            }
            default -> System.out.println("No se ha ingresado una opción válida");
        }
        if (opcion != 2) {
            iniciarPrograma();
        }
    }

     */

}
