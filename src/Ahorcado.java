import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
public class Ahorcado {

    public static void partida() {

        List<String> palabras = Arrays.asList("camion", "toro", "perro", "hawaii");

        Random rand = new Random();
        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

        System.out.println(palabraJuego);

        List<Character> jugadores = new ArrayList<>();

        int intentos = 0;

        while (true) {
            if (intentos >= 4) {
                JOptionPane.showMessageDialog(null, "Perdiste");
                break;
            }

            if (!jugando(palabraJuego, jugadores)) {
                intentos++;
            }


            if (verPalabras(palabraJuego, jugadores)) {
                JOptionPane.showMessageDialog(null, "Ganaste");
            }


            JOptionPane.showMessageDialog(null, "No es correcto, continue");

        }
    }


    private static void averiguar(String palabraJuego, List<Character> jugadores) {
        int op = JOptionPane.showOptionDialog(null, "¿Quieres introducir la palabra?", "Averiguar", YES_NO_OPTION, QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, null);


        switch (op) {

            case 0:
                String palabra = JOptionPane.showInputDialog("Introduce la palabra");


                if (palabraJuego.equals(palabra)) {
                    JOptionPane.showMessageDialog(null, "Ganaste");

                    op=0;

                    op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" +
                            "\n1 --> Seguir jugando" + "\n2 --> Sair da partida"));

                    if(op==1){
                        Ahorcado.partida();
                    }

                    System.exit(op);

                } else {
                    //for(int i = 5; true; i--) {
                    //JOptionPane.showMessageDialog(null, "No es correcto, te quedan " +i+ " intentos");
                    //i--;

                    break;
                }


            case 1:
                Ahorcado.jugando(palabraJuego, jugadores);


                break;
        }

    }







    private static boolean jugando(String palabraJuego, List<Character> jugadores) {

        String letra = JOptionPane.showInputDialog("Introduce unha letra: ");
        jugadores.add(letra.charAt(0));

        Ahorcado.verPalabras(palabraJuego, jugadores);

        return palabraJuego.contains(letra);
    }

    private static boolean verPalabras(String palabraJuego, List<Character> jugadores) {
        StringBuilder concatena = new StringBuilder();
        int correctas = 0;

        for (int i = 0; i < palabraJuego.length(); i++) {
            if (jugadores.contains(palabraJuego.charAt(i))) {
                concatena.append(palabraJuego.charAt(i));
                correctas++;
            } else {
                concatena.append(" - ");
            }
        }

        System.out.println(concatena);

        JOptionPane.showMessageDialog(null, concatena.toString());

        Ahorcado.averiguar(palabraJuego, jugadores);

        return (palabraJuego.length() == correctas);
    }


}
