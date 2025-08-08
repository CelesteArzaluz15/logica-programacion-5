import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiccInglesEspanol {

    public static void main(String[] args) {
        // 1. añadir palabras en ingles y español al diccionario
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("manzana", "apple");
        diccionario.put("zapato", "shoe");
        diccionario.put("ventana", "window");
        diccionario.put("reloj", "clock");
        diccionario.put("camisa", "shirt");
        diccionario.put("tren", "train");
        diccionario.put("avión", "airplane");
        diccionario.put("teléfono", "phone");
        diccionario.put("playa", "beach");
        diccionario.put("pescado", "fish");
        diccionario.put("vino", "wine");
        diccionario.put("jardín", "garden");
        diccionario.put("bolsa", "bag");
        diccionario.put("estrella", "star");
        diccionario.put("nube", "cloud");
        diccionario.put("papel", "paper");
        diccionario.put("pan", "bread");
        diccionario.put("llave", "key");
        diccionario.put("anillo", "ring");
        diccionario.put("dinero", "money");


        // 2. palabras en aleatorio para selecionar
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras);
        ArrayList<String> seleccionadas = new ArrayList<>(palabras.subList(0, 5));


        // 3. conteo para las correctas o incorrectas
        int correctas = 0;
        int incorrectas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Traduce las siguientes palabras del Español al Inglés:\n");


        // 4. peticion de traduccion al usuario
        for (String palabra : seleccionadas) {
            System.out.print("Traducción de '" + palabra + "': ");
            String respuesta = sc.nextLine().trim().toLowerCase();

            String traduccionCorrecta = diccionario.get(palabra).toLowerCase();

            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("\uD83D\uDC4D Correcto\n");
                correctas++;
            } else {
                System.out.println("\uD83D\uDC4E Incorrecto. La respuesta correcta era: " + traduccionCorrecta + "\n");
                incorrectas++;
            }
        }

        sc.close();


        // 5.resultado
        System.out.println("🎉 Resultados finales 🎉");
        System.out.println("👍 Correctas: " + correctas);
        System.out.println("👎 Incorrectas: " + incorrectas);

    }
}
