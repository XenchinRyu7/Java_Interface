// Class main
public class MainPesan implements Pesan{
    //Main class
    //class main dapat mengimplementasi method yang
    // telah di deklarasikan di interface pesan
    public static void main(String[] args) { // method void main utama
        MainPesan ps = new MainPesan();
        // inisialisasi obyek ps
        ps.tampilPesan1();
        ps.tampilPesan2();
        ps.tampilPesan3();
        // tampil method pesan
    }

    @Override
    public void tampilPesan1(){
        System.out.println("Tampilkan pesan 1");
    }
    @Override
    public void tampilPesan2(){
        System.out.println("Tampilkan pesan 2");
    }
    @Override
    public void tampilPesan3(){
        System.out.println("Tampilkan pesan 3");
    }
}
