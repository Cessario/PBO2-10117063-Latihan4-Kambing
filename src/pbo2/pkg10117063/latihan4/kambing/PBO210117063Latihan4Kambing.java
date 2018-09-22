/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan4.kambing;

/**
 *
 * @author DEADPOOL
 *NAMA : Cessario
 *NIM : 10117063
 *KELAS : IF-2
 *Deskripsi Program : menampilkan jumlah kambing setelah ditambah*/
public class PBO210117063Latihan4Kambing {

    /**
     */
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0 ;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + 
                         jumlahKambing);
    }
    
    public static void main(String[] args) {
        PBO210117063Latihan4Kambing kambingJantan = new 
        PBO210117063Latihan4Kambing();
        kambingJantan.tambahKambing();
        
        
    }
    
}
