package modelo;

public class Personaje {
    private String nombre;
    private boolean esPrincipal;
    private int puntosGanados;

    public Personaje(String nombre, boolean esPrincipal) {
        this.nombre = nombre;
        this.esPrincipal = esPrincipal;
    }

    public Personaje(String nombre) {
        this(nombre,false);
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }


    public void mostrarInformacion() {
        System.out.println("Personaje{" + "nombre=" + nombre + ", esPrincipal=" + esPrincipal + ", puntosGanados=" + puntosGanados + '}');
    }
    
    public void recolectar(Fruta f){
        if (esPrincipal){
            puntosGanados+=(2*f.getCalorias());
        }
        else{
            puntosGanados+=f.getCalorias();
        }
    }
}
