public class Cliente{
  String nombre;
  int porcDescuento;//valor sobre 100
  boolean esAfiliado;

  public Cliente(){

  }
  public Cliente(String n){
    nombre = n;
  }

  public Cliente(String n, boolean a){
    nombre = n;
    esAfiliado =a;
    if (a) porcDescuento=1;
  }

  public void revisarMenu(){
    System.out.println("Usuario " + nombre + " revisa menu");
  }

  public boolean pagar(double valor){
    if (porcDescuento>0)
        valor=valor - (valor*porcDescuento/100);
    System.out.println("Usuario paga "+valor);
    
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Creando objetos:");
    //creando objetos
    Cliente cliente1 = new Cliente("Luis");
    Cliente cliente2 = new Cliente("Margarita",true);
    //datos para objetos
    //cliente1.nombre = "Luis";
    cliente1.porcDescuento = 2;

    //cliente2.nombre = "Margarita";
    //cliente2.esAfiliado = true;

    //llamando a  metodos
    cliente1.revisarMenu();
    cliente2.pagar(30.00);

    Cliente cliente3 = cliente2;

    
  }
}