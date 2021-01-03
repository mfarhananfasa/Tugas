
/**
 * Write a description of class TestBus here.
 *
 * @author (mfarhananfasa)
 * @version (a version number or a date)
 */
import java.util.*;
public class Bus 
{
    private ArrayList <Penumpang> penumpangBiasa =  new ArrayList<Penumpang>();;
    private ArrayList <Penumpang> penumpangPrioritas = new ArrayList<Penumpang>();
    private ArrayList <Penumpang> penumpangBerdiri = new ArrayList<Penumpang>();
    private int ongkos_bus = 2000;
    private int totalPendapatan;
    
    public Bus() 
    {
        
    }

    public ArrayList<Penumpang> getPenumpangBiasa()
    {
        for (Penumpang penumpang : penumpangBiasa) 
        {
           penumpangBiasa = penumpang.getNama();
        }
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas()
    {
        for (Penumpang penumpang : penumpangPrioritas) 
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public ArrayList<Penumpang> getPenumpangBerdiri()
    {
        for (Penumpang penumpang : penumpangBerdiri) 
        {
            penumpang.getNama();
        }
        return penumpangBerdiri;
    }

    public int getJumlahPenumpangBiasa()
    {
        int jumlahPenumpangBiasa = penumpangBiasa.size();
        System.out.println("Jumlah penumpang Biasa : " + jumlahPenumpangBiasa);
        return jumlahPenumpangBiasa;
    }

    public int getJumlahPenumpangPrioritas()
    {
        int jumlahPenumpangPrioritas = penumpangPrioritas.size();
        System.out.println("Jumlah penumpang Prioritas : " + jumlahPenumpangPrioritas);
        return jumlahPenumpangPrioritas;
    }
    
    public int getJumlahPenumpangBerdiri()
    {
        int jumlahPenumpangBerdiri = penumpangBerdiri.size();
        System.out.println("Jumlah penumpang berdiri : " + jumlahPenumpangBerdiri);
        return jumlahPenumpangBerdiri;
    }

    public boolean naikPenumpang(Penumpang penumpang)
    {
        if ((penumpangPrioritas.size() < 5) && ((penumpang.getUmur() < 11 || penumpang.getUmur() > 60 || penumpang.getHamil() == true) )) 
        {
            penumpang.kurangiSaldo(ongkos_bus);
            totalPendapatan += ongkos_bus;
            System.out.println("Penumpang Berhasil Ditambahkan\n");
            return penumpangPrioritas.add(penumpang);
        } 
        else if (penumpangBiasa.size() < 17)
        {
            penumpang.kurangiSaldo(ongkos_bus);
            totalPendapatan += ongkos_bus;
            System.out.println("Penumpang Berhasil Ditambahkan\n");
            return penumpangBiasa.add(penumpang);
        }
        else if (penumpangBerdiri.size() < 21 || penumpang.getHamil() == false)
        {
            penumpang.kurangiSaldo(ongkos_bus);
            totalPendapatan += ongkos_bus;
            System.out.println("Penumpang Berhasil Ditambahkan\n");
            return penumpangBerdiri.add(penumpang);
        }
        else 
        {
            System.out.println("Mohon Maaf Bus Sudah Penuh\n");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama)
    {
        for (int i = 0; i < penumpangBiasa.size(); i++) 
        {
            if (nama.equals(penumpangBiasa.get(i).getNama())) 
            {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Berhasil turun !");
                return penumpangBiasa.equals(nama);
            } 
            else 
            {
                System.out.println("Penumpang Tidak ditemukan !");
                return false;
            }
        }
            
        for (int i = 0; i < penumpangPrioritas.size(); i++) 
        {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) 
            {
                penumpangPrioritas.remove(i);
                System.out.println("Penumpang Berhasil turun !");
                return penumpangPrioritas.equals(nama);
            } 
            else 
            {
                System.out.println("Penumpang Tidak ditemukan !");
                return false;
            }
        }
        
        for (int i = 0; i < penumpangBerdiri.size(); i++) 
        {
            if (nama.equals(penumpangBerdiri.get(i).getNama())) 
            {
                penumpangBerdiri.remove(i);
                System.out.println("Penumpang Berhasil turun !");
                return penumpangBerdiri.equals(nama);
            } 
            else 
            {
                System.out.println("Penumpang Tidak ditemukan !");
                return false;
            }
        }
        return penumpangPrioritas.equals(nama) || penumpangBerdiri.equals(nama) || penumpangBiasa.equals(nama);
    }

    public int totalPenumpang()
    {
        return penumpangBiasa.size() + penumpangPrioritas.size() + penumpangBerdiri.size();
    }

    public String toString()
    {
        String namaPenumpangBiasa =" "; 
        String namaPenumpangPrioritas =" "; 
        String namaPenumpangBerdiri =" ";
    
        for (Penumpang penumpang : penumpangBiasa) {
              namaPenumpangBiasa += penumpang.getNama().toString() + ", ";
        }
        
        for (Penumpang penumpang : penumpangPrioritas) {
            namaPenumpangPrioritas += penumpang.getNama().toString() + ", ";
        }
        
        for (Penumpang penumpang : penumpangBerdiri) {
            namaPenumpangBerdiri += penumpang.getNama().toString() + ", ";
        }

        if (penumpangBiasa.isEmpty() == true) {
            System.out.println("Penumpang Biasa : <kosong>");
        } else {
            System.out.println("Penumpang Biasa : " + namaPenumpangBiasa );
        }

        if (penumpangPrioritas.isEmpty() == true) {
            System.out.println("Penumpang Prioritas : <kosong>");
        } else {
            System.out.println("Penumpang Prioritas : " + namaPenumpangPrioritas );
        }
        
        if (penumpangBerdiri.isEmpty() == true) {
            System.out.println("Penumpang Berdiri : <kosong>");
        } else {
            System.out.println("Penumpang Berdiri : " + namaPenumpangBerdiri );
        }        
        System.out.println("Jumlah penumpang : " + totalPenumpang());                
        System.out.println("Jumlah pendapatan Bus : " +  totalPendapatan);
        return "Penumpang biasa : " + namaPenumpangBiasa + "Penumpang prioritas : " + namaPenumpangPrioritas
        +"Penumpang berdiri : " + namaPenumpangBerdiri + "Jumlah penumpang : " + totalPenumpang();
    }       
}
