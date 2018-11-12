package boletin7;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Pose Carames
 */
public class Libro {

    String titulo;
    String autor;
    int exemplar;
    int prestado;

    public Libro() {

    }

    public Libro(String titulo, String autor, int exemplar, int prestado) {

        this.titulo = titulo;
        this.autor = autor;
        this.exemplar = exemplar;
        this.prestado = prestado;

    }

    public void datos() {

        titulo = JOptionPane.showInputDialog("Introduce el titulo del libro: ");
        autor = JOptionPane.showInputDialog("Introduce el autor del libro: ");
        exemplar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ejemplares: "));

    }

    public boolean prestamo() {

        if (exemplar > 0) {
            prestado++;
            exemplar--;
            return true;
        }
        else 
            return false;
        
    }

    public boolean devolucion() {

        if (prestado > 0) {
            exemplar++;
            prestado--;
            return true;
        } 
        else 
            return false;
        
    }

    public void mDatos() {

        JOptionPane.showMessageDialog(null, "Titulo del libro: " + titulo + "\nAutor del libro: " + autor
                + "\nNumero de exemplares: " + exemplar);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getExemplar() {
        return exemplar;
    }

    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }

    public int getPrestado() {
        return prestado;
    }

    public void setPrestado(int prestado) {
        this.prestado = prestado;
    }

}
