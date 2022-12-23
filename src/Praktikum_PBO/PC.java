package Praktikum_PBO;

public class PC extends Komputer implements Mouse, Keyboard, Printer{
    public String OS = "Microsoft Windows 11 Premium Version";
    public String Mouse = "Razer Viper 8KHz Black Gaming";
    public String Keyboard = "Sades Thyrsus ";
    public String Print = "HP LaserJet Pro M12w";

    @Override
    public void hidupkan_os() {
        System.out.println("OS pada PC yang sedang dinyalakan ini menggunakan " + OS);
    }

    @Override
    public void matikan_os() {
        System.out.println("OS pada PC yang sedang dimatikan ini menggunakan " + OS);
    }

    @Override
    public void klik_kanan() {
        System.out.println("Untuk melakukan refresh klik kanan dua kali pada Mouse " + Mouse );    
    }

    @Override
    public void klik_kiri() {
        System.out.println("Untuk membuka aplikasi klik kiri dua kali pada Mouse " + Mouse);  
    }

    @Override
    public void tekan_enter() {
        System.out.println("Agar mengetik dengan lancar pada PC ini ditambahkan Keyboard " + Keyboard);
    }

    @Override
    public void cetak_data() {
        System.out.println("Untuk melakukan cetak_data pada PC ini bisa menggunakan print " + Print);
    }
}
