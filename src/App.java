import java.util.ArrayList;
import java.util.Random;

public class App {
    static int MAX_LENGTH = 20;

    public static void main(String[] args) throws Exception {
        var random = new Random();
        var iteraciones = 0;
        var sucesionCadenas = new ArrayList<String>();
        var cadenaPrincipal = generarCadenaAleatoria(random, MAX_LENGTH);
        var scoreCadenaPrincipal = evaluarCadena(cadenaPrincipal);
        sucesionCadenas.add(cadenaPrincipal);

        do {
            System.out.println(cadenaPrincipal + " <- Cadena Principal (score: " + scoreCadenaPrincipal + ")");

            var cadena2 = generarCadenaAleatoria(random, MAX_LENGTH);
            System.out.println(cadena2 + " <- Cadena 2");

            var cadenaCruzada = cruzarCadenas(cadenaPrincipal, cadena2);
            var scoreCadenaCruzada = evaluarCadena(cadenaCruzada);
            System.out.println(cadenaCruzada + " <- Cadena Cruzada (score: " + scoreCadenaCruzada + ")");

            if (scoreCadenaCruzada > scoreCadenaPrincipal) {
                System.out.println("¡Mejor cadena encontrada!");
                cadenaPrincipal = cadenaCruzada;
                scoreCadenaPrincipal = scoreCadenaCruzada;
                sucesionCadenas.add(cadenaPrincipal);
            } else {
                System.out.println("La cadena producida en el cruce no es mejor.");
            }

            iteraciones++;

            System.out.println("Iteraciones: " + iteraciones);
            System.out.println();
        } while (scoreCadenaPrincipal < MAX_LENGTH * 2);

        System.out.println("Número de iteraciones para llegar a la cadena óptima: " + iteraciones);
        System.out.println("Número de cadenas generadas: " + (iteraciones + 1));

        System.out.println("Sucesión de cadenas aptas: ");
        for (int i = 0; i < sucesionCadenas.size(); i++) {
            System.out.println((i + 1) + ". " + sucesionCadenas.get(i));
        }
    }

    public static String generarCadenaAleatoria(Random random, int length) {
        var stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(random.nextInt(2));
        }
        return stringBuilder.toString();
    }

    public static int evaluarCadena(String cadena) {
        var resultado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            var numero = Integer.parseInt(String.valueOf(cadena.charAt(i)));
            resultado += numero * 2;
        }
        return resultado;
    }

    public static String cruzarCadenas(String cadena1, String cadena2) {
        var resultado = new StringBuilder();
        for (int i = 0; i < cadena1.length(); i++) {
            var caracter1 = cadena1.charAt(i);
            var caracter2 = cadena2.charAt(i);
            resultado = caracter1 == caracter2
                    ? resultado.append("1")
                    : resultado.append("0");
        }
        return resultado.toString();
    }

}
