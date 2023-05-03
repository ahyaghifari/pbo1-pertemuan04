package com.ahyaghifari.pbo1.pertemuan04;

public class Array {
    public static void main(String[] args) {
        String mataKuliah[];
        mataKuliah = new String[10];
        
        mataKuliah[0] = "Pemrograman Berbasis Objek 1";
        mataKuliah[1] = "Visual 2";
        mataKuliah[2] = "Rekayasa Perangkat Lunak";
        mataKuliah[3] = "Organisasi Komputer";
        mataKuliah[4] = "Pemrograman Web 2";
        
        System.out.println("Panjang Array mataKuliah = " + mataKuliah.length);
        System.out.println(mataKuliah[0]);
        System.out.println(mataKuliah[1]);
    }
}
