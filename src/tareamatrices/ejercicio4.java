
package tareamatrices;

/**
 *MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COMUNAS DE LA MATRIZ
 * @cifuentes
 */
public class ejercicio4 {

   
    public static void main(String[] args) {
        int matriz[][]=new int [10][10];
 int dato=1;
     for (int[] matriz1 : matriz) {
         for (int j = 0; j < matriz1.length; j++) {
             matriz1[j] = dato;
             dato++;
         }
     }


     for (int[] matriz1 : matriz) {
         for (int j = 0; j < matriz1.length; j++) {
             System.out.print("\t" + matriz1[j]);
         }
         System.out.println("");
     }
 for(int j=0;j<10;j++){
     int sumaCol = 0;
            for(int i=0;i<10;i++){
                sumaCol += matriz[i][j];

            }
            System.out.print("\nLa suma de la columna["+j+"] es: "+ sumaCol);
        }
        System.out.println("");
}
 }