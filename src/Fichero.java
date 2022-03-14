import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Fichero {


    public static void crearPalabra(List<String> jugadores){
        File fichero = new File("/home/dam1/Escritorio");

        try{
            Scanner leer = new Scanner(fichero);
            while (leer.hasNextLine()){

                jugadores.add(leer.next());

            }
            leer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
