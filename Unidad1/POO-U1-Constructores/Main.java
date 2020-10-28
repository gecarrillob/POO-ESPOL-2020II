import modelo.Cliente;

class Main {
 public static void main(String[] args) {
    System.out.println("Creando objetos:");
    //creando objetos
    Cliente cliente1 = new Cliente("Luis");
    Cliente cliente2 = new Cliente("Margarita",true);


    //llamando a  metodos
    cliente1.revisarMenu();
    cliente2.pagar(30);

    //llamada a metodo sobrecargado
    cliente2.mostrarSaludo();
    cliente2.mostrarSaludo("Estoy feliz");
    cliente2.mostrarSaludo("Me gusta programar",3);

    //variables y metodos estaticos se pueden acceder sin tener una instancia
    System.out.println("Atributo pais" + Cliente.pais);

    Cliente.saludar();


    //los atributos private de la clase cliente no son accesibles desde otra clase directamente, la siguiente linea da error
    //System.out.println(cliente2.nombre);

    //para acceder debo usar los getters
    System.out.println(cliente2.getNombre());
  }
}
