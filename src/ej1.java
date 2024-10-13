import javax.swing.*;
import java.util.Locale;

public class ej1 {
    public static void main(String[] args) {
        String genero = JOptionPane.showInputDialog("Elija 1 género de películas y le recomendaré la mejor de de dicho género en el siglo XXI:\n - Acción\n - Comedia\n - Drama\n - Ciencia Ficción\n - Aventura\n - Fantasía\n - Terror\n - Romance\n - Suspenso");
        String genero_min = genero.toLowerCase();
        if (genero_min.equals("accion") || genero_min.equals("acción")) {
            JOptionPane.showMessageDialog(null, "'Mad Max: Fury Road' (2015) by George Miller");
        } else if (genero_min.equals("comedia")) {
            JOptionPane.showMessageDialog(null, "'Superbad' (2007) by Greg Mottola");
        } else if (genero_min.equals("drama")) {
            JOptionPane.showMessageDialog(null, "'The Social Network' (2010) by David Fincher");
        } else if (genero_min.equals("ciencia ficcion") || genero_min.equals("ciencia ficción")) {
            JOptionPane.showMessageDialog(null, "'Inception' (2010) by Cristopher Nolan");
        } else if (genero_min.equals("aventura")) {
            JOptionPane.showMessageDialog(null, "'Indiana Jones and the Kingdom of the Crystal Skull' (2008) by Steven Spielberg");
        } else if (genero_min.equals("fantasía") || genero_min.equals("fantasia")) {
            JOptionPane.showMessageDialog(null, "'The Lord of the Rings: The Return of the King' (2003) by Peter Jackson");
        } else if (genero_min.equals("terror")) {
            JOptionPane.showMessageDialog(null, "'The Babadook' (2014) by Jennifer Kent");
        } else if (genero_min.equals("romance")) {
            JOptionPane.showMessageDialog(null, "'Eternal Sunshine of the Spotless Mind' (2004) by Michel Gondry");
        } else if (genero_min.equals("suspenso")) {
            JOptionPane.showMessageDialog(null, "'Gone Girl' (2014) by David Fincher");
        } else {
            JOptionPane.showMessageDialog(null, "No es considerado un género");
        }


    }
}
