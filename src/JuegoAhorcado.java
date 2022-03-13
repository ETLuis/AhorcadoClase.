import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;

public class JuegoAhorcado {


    public static void main(String[] args) {


        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" +
                "\n1 --> Empezar partida" + "\n2 --> Sair da partida"));

        if(op==1){
            Ahorcado.partida();
        }






    }

}