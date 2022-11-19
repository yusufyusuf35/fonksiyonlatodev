package com.deliysuf.javadersleri.fonksiyonlarOdev;

import com.deliysuf.javadersleri.nesne_tabanli_programlama.Fonksiyonlar;

public class FonksiyonlarOdevMain {
    public static void main(String[] args) {
        FonksiyonlarOdev fonksiyon =new FonksiyonlarOdev();


        System.out.println("Beşgenin bir ic acısı : "
                +fonksiyon.IcAcilar(5));

        System.out.println("----------------------------------");

        System.out.println(fonksiyon.MaasHesabi(50,
                0));

        System.out.println("------------------------------------");

        System.out.println(fonksiyon.otoparkUcreti(7.5));

        System.out.println("------------------------------------");

        System.out.println(fonksiyon.dikDordgenAlan(5.0,6.0));

        System.out.println("------------------------------------");

        System.out.println(fonksiyon.kmMilConverter(5));

        System.out.println("------------------------------------");

        System.out.println(fonksiyon.faktoriyel(4));

        System.out.println("------------------------------------");


        System.out.println(fonksiyon.kelime("menemen"));

    }
}
