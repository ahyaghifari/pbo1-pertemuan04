package com.ahyaghifari.pbo1.pertemuan04;

public class While {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 100;
        
        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");
        
        while(isiGelas != penuh){
            isiGelas++;
            System.out.println("Sedang mengisi gelas...");
            System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        }
        
        System.out.println("Finale : Isi Gelas Sekarang : " + isiGelas + "ml");
    }
}