import javax.swing.*;

public class ej2 {
    public static void main(String[] args) {
        String precio_str = JOptionPane.showInputDialog("Ingrese el precio total del producto que quiera comprar:");
        String categoria_str = JOptionPane.showInputDialog("Ingrese su categoría:\n - Jubilado\n - Estudiante\n - Adulto");
        float precio = Float.parseFloat(precio_str);
        String categoria = categoria_str.toLowerCase();
        float jubilado = 0.15f;
        float estudiante = 0.1f;
        float adulto = 0.05f;
        float descuento = precio;
        if (categoria.equals("jubilado")) {
            descuento = precio - (precio * jubilado);
        } else if (categoria.equals("estudiante")) {
            descuento = precio - (precio * estudiante);
        } else if (categoria.equals("adulto")) {
            descuento = precio - (precio * adulto);
        } else
            JOptionPane.showMessageDialog(null, "Categoría sin Posibilidad de Descuento");
        JOptionPane.showMessageDialog(null, "Precio Final con descuento: " + descuento);
    }
}
