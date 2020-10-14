class Ejemplo2 {
  public static void main(String[] args) {
  //Escribir un programa que determine si un número es o no es, par positivo.  El número es recibido como argumento en la línea de comandos
  
      //ejercicio 1
    int numero =Integer.valueOf(args[0]);
    if (numero%2==0) 
      System.out.println("NUMERO ES PAR");
    else
      System.out.println("NUMERO ES IMPAR");

//Integer.valueOf transforma un String a un valor entero.  

//Escribir una programa que recibe la nota de un examen (un número entero entre 0 y 10) e imprima por pantalla la calificación en formato “Reprueba”, si la nota es menor que  5, “Aprobado” si esta entre 5 y 7 sin incluirlo, “Notable” si esta entre 7 y 9 sin incluirlo,  “Sobresaliente” si esta entre 9 y 10 sin incluirlo y “Excelente”  si la nota es igual a 10
 
       //ejercicio 2
        int nota = Integer.valueOf(args[0]);
        if (nota < 5) {
            System.out.println("La nota es :" + nota + " , reprueba");
        } else if (nota >=5 && nota < 7) {
            System.out.println("La nota es :" + nota + " , aprobado");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("La nota es :" + nota + " , notable");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("La nota es :" + nota + " , sobresaliente");
        } else if (nota == 10) {
            System.out.println("La nota es :" + nota + " , excelente");
       } else {
            System.out.println("La nota está fuera de rango");
       }
 
//Dado un número entero determine la cantidad de dígitos que tiene.
//Se realiza un proceso de división sobre el número para descomponer las decenas que permitan contabilizar los dígitos.
 
       //ejercicio 3
        int n =  Integer.valueOf(args[0]);
        System.out.println("El numero es " + n);
        int cantidad = 0;
        while (n > 0) {
            n = n/10;
            cantidad++;
        }
        System.out.println("La cantidad de digitos que tiene es " + cantidad);
 

//Imprimir por pantalla todos los múltiplos del 5, entre el rango 1 al 100.
       //ejercicio 4
       for(int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
//Construir un programa que calcule el factorial de un valor numérico introducido como parámetro o argumento en la línea de comandos.
       //ejercicio 5
       int num =  Integer.valueOf(args[0]);
       int factorial =1;
       for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
      System.out.println("El factorial de " + num + " es: " + factorial);
 
//Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división. Los valores de los operandos se deben indicar en el segundo y tercer parámetros.
 //ejercicio 5
       
    if(args.length != 3) {
			System.out.print("Debes indicar la operación y los operandos.");
		} else {
			String op  = args[0];//operacion
			int op1 = Integer.valueOf(args[1]);//operando 1
			int op2 = Integer.valueOf(args[2]);//operando 2
			
			switch(op) {
				case "S":
				case "s": 
              		System.out.println("La suma de " + op1 + " y " + op2 + " es: " + (op1 + op2));
              		break;
				case "R":
				case "r":
              		System.out.println("La resta de " + op1 + " y " + op2 + " es: " + (op1 - op2));
              		break;
				case "P":
				case "p":
				case "M": 
				case "m":
              		System.out.println("El producto de " + op1 + " y " + op2 + " es: " + (op1 * op2));
              		break;
				case "D":
				case "d":
              		System.out.println("La división de " + op1 + " y " + op2 + " es: " + (op1 / op2));
              		break;
				default: 
              		System.out.println("Operación no reconocida."); 
              		break;
			}
		}

  }
}