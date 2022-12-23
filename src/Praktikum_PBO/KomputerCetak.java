package Praktikum_PBO;

final class KomputerCetak {
    final static void cetak(Komputer [] obj){
        System.out.println("===============================================================");
        System.out.println("         KARAKTERISTIK - KARAKTERISTIK PADA PERANGKAT          ");
        System.out.println("===============================================================");
        System.out.println();
        for(Komputer komp : obj){
            if(komp instanceof PC){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("        KARAKTERISTIK PC         ");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                komp.hidupkan_os();
                komp.klik_kanan();
                komp.klik_kiri();
                komp.tekan_enter();
                komp.cetak_data();
                komp.matikan_os();
                System.out.println();
            }
            if(komp instanceof Laptop){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("        KARAKTERISTIK LAPTOP     ");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                komp.hidupkan_os();
                komp.klik_kanan();
                komp.klik_kiri();
                komp.tekan_enter();
                komp.cetak_data();
                komp.matikan_os();
                System.out.println();
            }
            if(komp instanceof Notebook){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("        KARAKTERISTIK NOTEBOOK    ");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                komp.hidupkan_os();
                komp.klik_kanan();
                komp.klik_kiri();
                komp.tekan_enter();
                komp.cetak_data();
                komp.matikan_os();
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
       PC pc = new PC();
       Laptop lpt = new Laptop();
       Notebook nbk = new Notebook();
       Komputer[] komp = {pc,lpt,nbk};
       cetak(komp);
    }
}
