

import javax.swing.*;

public class JuegoAhorcado {


    public static void main(String[] args) {


        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" +
                "\n1 --> Empezar partida" + "\n2 --> Sair da partida"));

        if(op==1){
            Ahorcado.partida();
        }

            System.exit(op);







    }

}