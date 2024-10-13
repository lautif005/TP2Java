import javax.swing.*;

public class ej4 {
    public static void main(String[] args) {
        String peso_str = JOptionPane.showInputDialog("Ingrese su peso en kilogramos:");
        String altura_str = JOptionPane.showInputDialog("Ingrese su altura en metros:");
        float peso = Float.parseFloat(peso_str);
        float altura = Float.parseFloat(altura_str);
        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + imc + "\n Tienes bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + imc + "\n Tienes peso normal");
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + imc + "\n Tienes sobrepeso");
        } else if (imc >= 30) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + imc + "\n Tienes obesidad");
        } else
            JOptionPane.showMessageDialog(null, "Valor ingresado no válido");




    }
}
