import java.util.Scanner;
import modelo.Fruta;
import modelo.Personaje;
public class EjemploArrObjetos {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre;//variable para recuperar nombre por teclado
        Personaje[] arrPersonajes = new Personaje[2];//se crea el arreglo y cada uno es null
        for (int i=0;i<arrPersonajes.length;i++){

            System.out.println(arrPersonajes[i]);
            //la siguiente linea da error
           // arrPersonajes[i].mostrarInformacion();
        }  
        //creando los personajes
        //pedir nombre de personaje principal
        System.out.print("Ingrese nombre del personaje principal:");
        nombre = sc.nextLine();
        arrPersonajes[0] = new Personaje(nombre,true);

        //pedir nombre del zorro
        System.out.print("Ingrese nombre del zorro:");
        nombre = sc.nextLine();
        arrPersonajes[1] = new Personaje(nombre);
        
        //mostrar nuevamente la informacion del arreglo
        for (int i=0;i<arrPersonajes.length;i++){

            System.out.println(arrPersonajes[i]);
            //la siguiente linea ahora si da resultado
            arrPersonajes[i].mostrarInformacion();
        }  
        
     }   
}
