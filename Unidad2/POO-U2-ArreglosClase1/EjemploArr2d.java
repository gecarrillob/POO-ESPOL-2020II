public class EjemploArr2d {

    public static void main(String[] args) {
        int[][] matriz = new int[3][2]; //3 filas, 2 columnas
        int[][] matriz2 = {{1, 2}, {3, 4}, {5, 6}};//crea e inicializa con valores

        for (int i = 0; i < matriz2.length; i++) { //iterar el filas
            for (int j = 0; j < matriz2[i].length; j++) { //iterar en columna
                System.out.print(matriz2[i][j] + "=");
            }
            System.out.println();
        }

    }

}
