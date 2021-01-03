
/**
 * Write a description of class TestBus here.
 *
 * @author (mfarhananfasa)
 * @version (a version number or a date)
 */
import java.util.*;
public class TestBus
{
    public static void main(String[] args)
    {
        int ulang = 2;
        Bus koetaradja = new Bus();
        while(ulang == 2)
        {
            System.out.println("====== BUS TRANS KOETARAJA ======\nMENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.print("Pilihan : ");
            Scanner input = new Scanner(System.in);
            int pilihan = input.nextInt();
            switch(pilihan)
            {
                case 1:
                    System.out.print("Masukan Nama : ");
                    String nama = input.next();
                    System.out.print("Masukan id : ");
                    int id = input.nextInt();
                    System.out.print("Masukan Umur : ");
                    int umur = input.nextInt();
                    System.out.print("Apakah Hamil (y/n) : ");
                    Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y") ? true : false;
                    System.out.print("================================\n");
                    Penumpang penumpang = new Penumpang(id, umur, hamil, nama);              
                    koetaradja.naikPenumpang(penumpang);
                    System.out.print("================================\n");
                    koetaradja.toString();
                    System.out.print("================================");
                break;               
                case 2:
                    System.out.print("Masukan Nama : ");
                    nama = input.next();
                    System.out.println("=======Turunkan Penumpang=======");
                    koetaradja.turunkanPenumpang(nama);
                    koetaradja.toString();
                    System.out.print("================================");
                break;            
                case 3:
                    System.out.println("=========List Penumpang=========");
                    koetaradja.toString();
                    System.out.print("================================");
                    break;
                default:
                System.out.println("Menu Tidak Tersedia\n");
                System.out.print("================================");
                break;
            }
            System.out.println("\nApakah anda ingin berhenti? (1. Ya |2. Tidak)");
            System.out.println("Pilihan : ");
            ulang = input.nextInt();
        }
    }
}
