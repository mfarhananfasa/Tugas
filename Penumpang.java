
/**
 * Write a description of class TestBus here.
 *
 * @author (mfarhananfasa)
 * @version (a version number or a date)
 */
public class Penumpang 
{
    private int id;
    private int umur;
    private boolean hamil;
    private int saldo = 10000;
    private String nama;
    
    // constructor
    public Penumpang (int id, int umur, boolean hamil, String nama)
    {
        this.id = id;
        this.umur = umur;
        this.hamil = hamil;
        this.saldo = saldo;
        this.nama = nama;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getUmur(){
        return this.umur;
    }

    public boolean getHamil(){
        return this.hamil;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void tambahSaldo(int saldobaru)
    {
         this.saldo = saldo + saldobaru;
    }
    
    public void kurangiSaldo(int ongkos)
    {
        this.saldo = saldo - ongkos;
    }
}