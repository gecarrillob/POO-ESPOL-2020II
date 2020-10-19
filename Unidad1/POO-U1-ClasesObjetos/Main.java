class Main {
    public void parametroPrimitivo(double x,double y){
        x=x*2;
        y=y*8;
        System.out.println("Interior metodo primitivos:"+x+","+y);
    }
    public void parametroObjeto(Punto p){
        p.x=p.x*2;
        p.y=p.y*8;
        System.out.println("Interior metodo objetos:"+p.x+","+p.y);
    }

    public static void main(String[] args){
       //llamada a metodo con primitivo
        Main t = new Main();
        int a = 2;
        int b = 4;
        System.out.println("a="+a+","+"b="+b);
        System.out.println("t.parametroPrimitivo(a,b)");
        t.parametroPrimitivo(a,b);
        System.out.println("a="+a+","+"b="+b); 


        //llamada a metodo con objeto
        Punto p = new Punto();
        p.x = 10;
        p.y = 12;
        p.mostrarValores();
        System.out.println("t.parametroObjeto(p)");
        t.parametroObjeto(p);
        p.mostrarValores(); 

    }

}