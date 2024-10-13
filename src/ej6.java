import javax.swing.*;

public class ej6 {
    public static void main(String[] args) {
        String descanso_str = JOptionPane.showInputDialog("Cantidad de horas al día que duerme:");
        String ejercicio_str = JOptionPane.showInputDialog("Cantidad de minutos al día que hace ejercicio:");
        String alimentacion_str = JOptionPane.showInputDialog("Cantidad de comidas saludables al día que come:");
        int descanso = Integer.parseInt(descanso_str);
        int ejercicio = Integer.parseInt(ejercicio_str);
        int alimentacion = Integer.parseInt(alimentacion_str);
        String evaluacion_descanso = "";
        String evaluacion_ejercicio = "";
        String evaluacion_alimentacion = "";
        if (descanso < 6) {
            evaluacion_descanso = "insuficiente";
        } else if (descanso > 6 && descanso <= 8) {
            evaluacion_descanso = "adecuado";
        } else if (descanso > 8) {
            evaluacion_descanso = "excelente";
        }
        if (ejercicio < 30) {
            evaluacion_ejercicio = "insuficiente";
        } else if (ejercicio > 30 && ejercicio <= 60) {
            evaluacion_ejercicio = "adecuado";
        } else if (ejercicio > 60) {
            evaluacion_ejercicio = "excelente";
        }
        if (alimentacion < 2) {
            evaluacion_alimentacion = "insuficiente";
        } else if (alimentacion == 3) {
            evaluacion_alimentacion = "adecuado";
        } else if (alimentacion > 3) {
            evaluacion_alimentacion = "excelente";
        }
        JOptionPane.showMessageDialog(null,"Descanso: " + evaluacion_descanso + "\n Ejercicio: " + evaluacion_ejercicio + "\n Alimentación: " + evaluacion_alimentacion);
        if ((evaluacion_alimentacion.equals("adecuado") || evaluacion_alimentacion.equals("excelente")) && (evaluacion_descanso.equals("adecuado") || evaluacion_descanso.equals("excelente")) && (evaluacion_ejercicio.equals("adecuado") || evaluacion_ejercicio.equals("excelente"))) {
            JOptionPane.showMessageDialog(null,"Tiene hábitos saludables");
        } else if (evaluacion_alimentacion.equals("insuficiente") && evaluacion_descanso.equals("insuficiente") && evaluacion_ejercicio.equals("insuficiente")) {
            JOptionPane.showMessageDialog(null, "Tiene que mejorar significativamente sus hábitos");
        } else {
            JOptionPane.showMessageDialog(null,"Tiene que mejorar algunos de sus hábitos");
        }


    }
}
