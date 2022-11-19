package com.deliysuf.javadersleri.fonksiyonlarOdev;

import androidx.annotation.Nullable;

public class FonksiyonlarOdev {

    double IcAcilar(int kenarSayisi){
        return (kenarSayisi-2)*180/kenarSayisi;
    }




     String MaasHesabi(int calisilanGun,int gunIcerisindeFazlaMesaisaati){
         int toplamSaat = calisilanGun*8+gunIcerisindeFazlaMesaisaati;
         int ucret = toplamSaat*40;
         int mesai;
         if(toplamSaat>150){
             mesai = (toplamSaat-150)*80;
             ucret = ucret+mesai;
         }else{
             mesai = 0;
         }
         return "Toplam ucret : "+ucret+" fazla mesai Ucreti :"+mesai;
     }




     double otoparkUcreti(double saat){
        double ucret = 50;
        double ekUcret;
        if(saat*60>60){
            double ek = saat*60-60;
            ekUcret = (ek/60)*10;
        }else{
            ekUcret = 0;
        }
        return ucret+ekUcret;
     }

      double kmMilConverter(double km){
        return km*(0.621);
      }

      double dikDordgenAlan(double uzun,double kisa){
        return uzun*kisa;
      }

      int faktoriyel(int sayi){
       int fakt=1;
       for(int i=1;i<=sayi;i++){
           fakt=i*fakt;
        }
       return fakt;
      }

      int kelime(String word){

        char[] a = word.toCharArray();
      int count=0;
      for(int i = 0 ; i<a.length ; i++){
          if(a[i]=='e'){
              count++;
          }
      }
        return count;
      }



}
