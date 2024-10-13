import javax.swing.*;
import java.util.Random;

public class ej5 {
    public static void main(String[] args) {
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        int puntos_usuario = 0;
        int puntos_maquina = 0;
        while (puntos_usuario < 2 && puntos_maquina < 2) {
            String usuario_str = JOptionPane.showInputDialog("Elija piedra, papel o tijera");
            String usuario = usuario_str.toLowerCase();
            int a = random.nextInt(opciones.length);
            String maquina = opciones[a];
            String resultado = "";
            if (maquina.equals(usuario)) {
                JOptionPane.showMessageDialog(null, "Empate");
            } else if (maquina.equals("tijera") && usuario.equals("piedra")) {
                resultado = "Ganaste";
                JOptionPane.showMessageDialog(null, resultado);
            } else if (maquina.equals("piedra") && usuario.equals("tijera")) {
                resultado = "Perdiste";
                JOptionPane.showMessageDialog(null, resultado);
            } else if (maquina.equals("piedra") && usuario.equals("papel")) {
                resultado = "Ganaste";
                JOptionPane.showMessageDialog(null, resultado);
            } else if (maquina.equals("papel") && usuario.equals("piedra")) {
                resultado = "Perdiste";
                JOptionPane.showMessageDialog(null, resultado);
            } else if (maquina.equals("papel") && usuario.equals("tijera")) {
                resultado = "Ganaste";
                JOptionPane.showMessageDialog(null, resultado);
            } else if (maquina.equals("tijera") && usuario.equals("papel")) {
                resultado = "Perdiste";
                JOptionPane.showMessageDialog(null, resultado);
            } else {
                resultado = "Perdiste";
                JOptionPane.showMessageDialog(null, resultado);
            }
            if (resultado.equals("Ganaste")) {
                puntos_usuario++;
            } else if (resultado.equals("Perdiste")) {
                puntos_maquina++;
            }


        }
        if (puntos_usuario > puntos_maquina) {
            JOptionPane.showMessageDialog(null, "Victoria: " + puntos_usuario + "-" + puntos_maquina);
        } else if (puntos_usuario < puntos_maquina) {
            JOptionPane.showMessageDialog(null, "Derrota: " + puntos_usuario + "-" + puntos_maquina);
        }
    }
}
