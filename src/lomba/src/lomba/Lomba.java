/**Class = lomba , data
 * Object = pelari, catatan nilai
 * atribut = ukuran lapangan, waktu, nama, nim
**/
package lomba;
import java.util.Scanner;

public class Lomba {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int mahasiswa=3 , panjang, lebar, putaran, menit;
      double nilai;
      String nama, nim;
      Hitung hitung = new Hitung();
        System.out.print("Masukkan panjang lapangan : ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar lapangan   : ");
        lebar = input.nextInt();
        hitung.setLebar(lebar);
        hitung.getLebar();
        hitung.setPanjang(panjang);
        hitung.getPanjang();
     Data data1[] = new Data [mahasiswa];
      double nilaiakhir [] = new double[mahasiswa];
        for (int i = 0; i < data1.length ; i++) {
            System.out.print("Masukkan nama     : ");
            nama = input.next();
            System.out.print("Masukkan nim      : ");
            nim = input.next(); 
            System.out.print("Masukkan putaran  : ");
            putaran = input.nextInt();
            System.out.print("Masukkan menit    : ");
            menit = input.nextInt();
            hitung.setMenit(menit);
            nilai = hitung.nilai();
            nilaiakhir[i] = hitung.nilai();
            data1[i] = new Data(nim,nama,putaran,menit,nilai);
            data1[i].setJuara(nilai);
        }
        for (int i = 0; i < 3; i++) {
            data1[i].print();
            
        }
        if (nilaiakhir[0]> nilaiakhir[1] && nilaiakhir[0]> nilaiakhir[2]) {
            data1[0].getJuara();
            
        }
        else if (nilaiakhir[1]> nilaiakhir[0] && nilaiakhir[1]> nilaiakhir[2]) {
            data1[1].getJuara();
        }
        else    data1[2].getJuara();
    }}