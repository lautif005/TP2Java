import javax.swing.*;

public class ej7 {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            String emocion = JOptionPane.showInputDialog("Ingrese su emoción actual:\n 1 - Feliz\n 2 - Triste\n 3 - Enérgico\n 4 - Relajado");
            String emocion_min = emocion.toLowerCase();
            if (emocion_min.equals("feliz")) {
                JOptionPane.showMessageDialog(null, "ACTIVIDADES RECOMENDADAS:\n - Escribir un diario de gratitud\n - Organizar una reunión con amigos\n - Aprender una nueva habilidad");
            } else if (emocion_min.equals("triste")) {
                JOptionPane.showMessageDialog(null, "ACTIVIDADES RECOMENDADAS:\n - Practicar la meditación\n - Escribir una carta a sí mismo\n - Hacer ejercicio al aire libre");
            } else if (emocion_min.equals("energico") || emocion_min.equals("enérgico")) {
                JOptionPane.showMessageDialog(null, "ACTIVIDADES RECOMENDADAS:\n - Participar en un deporte de equipo\n - Organizar una caminata o excursión\n - Trabajar en un proyecto creativo");
            } else if (emocion_min.equals("relajado")) {
                JOptionPane.showMessageDialog(null, "ACTIVIDADES RECOMENDADAS:\n - Leer un libro\n - Practicar yoga\n - Escuchar música relajante");
            } else {
                JOptionPane.showMessageDialog(null, "Emoción no parte de las opciones");
            }
            String opcion = JOptionPane.showInputDialog("¿Quiere?:\n - Continuar\n - Salir");
            if (opcion.equals("continuar")) {
                continuar = true;
            } else if (opcion.equals("salir")) {
                continuar = false;
            } else {
                JOptionPane.showMessageDialog(null, "No es parte de las opciones");
                continuar = false;
            }
        }

    }
}
