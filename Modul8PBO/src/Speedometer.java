// deklarasi interface
public interface Speedometer{
    public void tambahKecepatan();
    public void kurangiKecepatan();
}
//implementasi interface
class Mobil implements Speedometer{
    public void tambahKecepatan(){
        System.out.println("injak kopling lebih tinggi & gas mobilnya");
    }
    public void kurangiKecepatan(){
        System.out.println("Rem mobilnya & pindah gear yang lebih rendah");
    }
}
class Motor implements Speedometer{
    public void tambahKecepatan(){
        System.out.println("pindah ke gear yang lebih tinggi & dan gas motornya");
    }
    public void kurangiKecepatan(){
        System.out.println("Rem motornya dengan rem belakang + depan, lalu pindah gear yang lebih renda");
    }
}

class TestKendaraan{
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        System.out.println("Cara ngebut pake motor");
        motor.tambahKecepatan();
        System.out.println("Cara berhentinya");
        motor.kurangiKecepatan();
        System.out.println("Cara balapan pake mobil");
        mobil.tambahKecepatan();
        System.out.println("Klo udah puas");
        mobil.kurangiKecepatan();
    }
}
