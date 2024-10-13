import javax.swing.*;

public class ej3 {
    public static void main(String[] args) {
        String genero = JOptionPane.showInputDialog("Elija 1 género de libros y le recomendaré el mejor de dicho género:\n - Acción\n - Comedia\n - Drama\n - Ciencia Ficción\n - Aventura\n - Fantasía\n - Terror\n - Romance\n - Suspenso");
        String genero_min = genero.toLowerCase();
        if (genero_min.equals("accion") || genero_min.equals("acción")) {
            JOptionPane.showMessageDialog(null, "'The Bourne Identity' (1980) by Robert Ludlum");
        } else if (genero_min.equals("comedia")) {
            JOptionPane.showMessageDialog(null, "'The Hitchhiker's Guide to the Galaxy' (1979) by Dpuglas Adams");
        } else if (genero_min.equals("drama")) {
            JOptionPane.showMessageDialog(null, "'To Kill a Mockingbird' (1960) by Harper Lee");
        } else if (genero_min.equals("ciencia ficcion") || genero_min.equals("ciencia ficción")) {
            JOptionPane.showMessageDialog(null, "'Dune' (1965) by Frank Herbert");
        } else if (genero_min.equals("aventura")) {
            JOptionPane.showMessageDialog(null, "'Treasure Island' (1883) by Robert Louis Stevenson");
        } else if (genero_min.equals("fantasía") || genero_min.equals("fantasia")) {
            JOptionPane.showMessageDialog(null, "'The Lord of the Rings' (1954-1955) by J. R. R. Tolkien");
        } else if (genero_min.equals("terror")) {
            JOptionPane.showMessageDialog(null, "'The Shining' (1977) by Stephen King");
        } else if (genero_min.equals("romance")) {
            JOptionPane.showMessageDialog(null, "'Pride and Prejudice' (1813) by Jane Austen");
        } else if (genero_min.equals("suspenso")) {
            JOptionPane.showMessageDialog(null, "'The Da Vinci Code' (2003) by Dan Brown");
        } else {
            JOptionPane.showMessageDialog(null, "No es considerado un género");
        }
    }
}
