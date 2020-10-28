public class EjemploArr1 {

public static void main(String[] args) {
        // TODO code application logic here
        //crear un arreglo
        int[] arr1 = new int[5]; //declaro la variable y creo el arreglo, por defecto todos los valores 0
        int[] arr2 = {0,1,2,3,4};//esta linea crea el arreglo con valores iniciales
        double[] var1 ;
        
        arr1[4] = 10;
        int j=0;
        //var1 =new double[10];
        for(int v: arr1){
            arr1[j]=j;
            System.out.println(v);
            j++;
        }
        for(int v: arr1){
            
            System.out.println(v);
        }
        //Cree un programa que construya un arreglo de 5 elementos y lo llene con los cuadrados de cada índice.
        //soluci'on
        //uso de for para iterar
        for (int i=0;i<arr1.length;i++){
            arr1[i]=i*i;
            
        }
        int suma = 0;
        //Modifique el programa para que se calcule la suma y el promedio de los elementos del arreglo.
        //Imprima los elementos del arreglo separando cada elemento con el símbolo |
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + "|");
            suma += arr1[i];
        }
        double promedio = suma/arr1.length;
        System.out.println("El promedio es "+promedio);
        
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}