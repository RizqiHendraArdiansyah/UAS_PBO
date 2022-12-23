package Praktikum_PBO;

public class Laptop extends Komputer implements Mouse, Keyboard, Printer{
    public String OS = "Microsoft Windows 11";
    public String Mouse = "JETE MSX1 Series";
    public String Keyboard = "Razer Ornata V2";
    public String Print = "Epson L3110";

    @Override
    public void hidupkan_os() {
        System.out.println("OS pada Laptop yang sedang dinyalakan ini menggunakan " + OS);
    }

    @Override
    public void matikan_os() {
        System.out.println("OS pada Laptop yang sedang dimatikan ini menggunakan " + OS);
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
        System.out.println("Agar mengetik dengan lancar pada Laptop ini ditambahkan Keyboard " + Keyboard);
    }

    @Override
    public void cetak_data() {
        System.out.println("Untuk melakukan cetak_data pada laptop ini bisa menggunakan print " + Print);
    }   
}
