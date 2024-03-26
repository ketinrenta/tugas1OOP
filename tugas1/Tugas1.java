
package tugas1;
import java.util.Scanner;

/**
 *
 * @author ketin
 * tgl: 2024-03-26
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai alas: ");
        double alas = input.nextDouble();
        
        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = input.nextDouble();
        
        double luas = (alas * tinggi) / 2;
        
        System.out.println("Luas segitiga adalah: " +luas);
    }

    
}
