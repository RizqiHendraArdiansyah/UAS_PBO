package Praktikum_PBO;

public class Notebook extends Komputer implements Mouse, Keyboard, Printer{
    public String OS = "Microsoft Windows 11";
    public String Mouse = "Logitech";
    public String Keyboard = "Logitech K120";
    public String Print = "Canon PIXMA MP287";

    @Override
    public void hidupkan_os() {
        System.out.println("OS pada Notebook yang sedang dinyalakan ini menggunakan " + OS);
    }

    @Override
    public void matikan_os() {
        System.out.println("OS pada Notebook yang sedang dimatikan ini menggunakan " + OS);
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
        System.out.println("Agar mengetik dengan lancar pada Notebook ini ditambahkan Keyboard " + Keyboard);
    }

    @Override
    public void cetak_data() {
        System.out.println("Untuk melakukan cetak_data pada Notebook ini bisa menggunakan print " + Print);
    }   
}
