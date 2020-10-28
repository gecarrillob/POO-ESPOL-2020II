package modelo;


public class Cliente{
  private String nombre;
  private int porcDescuento;//valor de 0 a 100
  private boolean esAfiliado;
  public static final String pais = "Ecuador";

  public Cliente(){
    
  }
  //constructores parametrizados
  public Cliente(String name){
    nombre = name;
  }
  
  public Cliente(String name, boolean afi){
    nombre = name;
    esAfiliado = afi;
    if (afi) porcDescuento =1;
  }

  //metodos sobrecargados
  public void mostrarSaludo(){
    System.out.println("Usuario " + nombre + " dice hola");
  }

  public void mostrarSaludo(String saludo){
    System.out.println("Usuario " + nombre + " dice " + saludo);
  }

  public void mostrarSaludo(String saludo, int c){
    for (int i=0;i<c;i++){
      System.out.println("Usuario " + nombre + " dice " + saludo);
    }
  }
  

  public void revisarMenu(){
    System.out.println("Usuario " + nombre + " revisa menu");
  }


  public boolean pagar(double valor){
    //aplica el descuento
    valor = valor - (this.porcDescuento * valor)/100;
    System.out.println("Usuario paga "+String.format("%.2f",valor) );
    return true;
    
  }
  //metodo statico
  public static void saludar(){

    System.out.println("Hola a todos");

  }
  //getters
 
  public String getNombre(){
    return nombre;
  }

  public int getPorcDescuento(){
    return this.porcDescuento;
  }
  //setters
  public void setNombre(String n){
    this.nombre = n;
  }
}