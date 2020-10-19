public class Cliente{
  String nombre;
  int porcDescuento;
  boolean esAfiliado;

  public void revisarMenu(){
    System.out.println("Usuario " + nombre + " revisa menu");
  }

  public boolean pagar(double valor){
    System.out.println("Usuario paga "+valor);
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Creando objetos:");
    //creando objetos
    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();
    //datos para objetos
    cliente1.nombre = "Luis";
    cliente1.porcDescuento = 2;

    cliente2.nombre = "Margarita";
    cliente2.esAfiliado = true;

    //llamando a  metodos
    cliente1.revisarMenu();
    cliente2.pagar(30.70);

    Cliente cliente3 = cliente2;

    
  }
}