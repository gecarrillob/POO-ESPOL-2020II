package modelo;
/**
 * 
 * @author Gladys
 */
public class Fruta {
    private String nombre;
    private int calorias;

    public Fruta(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalorias() {
        return calorias;
    }


    public void mostrarInformacion() {
        System.out.println( "Fruta{" + "nombre=" + nombre + ", calorias=" + calorias + '}');
    }
    
}
