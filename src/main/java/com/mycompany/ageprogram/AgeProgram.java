package com.mycompany.ageprogram;

import java.util.Random;

public class AgeProgram {
    public static void main(String[] args) {
        Random random = new Random();
        int aileBuyuklugu = 7;
        
        int bebekSayisi = 0;
        int cocukSayisi = 0;
        int ergenSayisi = 0;
        int gencSayisi = 0;
        int ortaYashSayisi = 0;
        int yashliSayisi = 0;
        
        for (int i = 0; i < aileBuyuklugu; i++){
            int yash = random.nextInt(100);
            
            if(yash <= 3){
                bebekSayisi++;
            } else if (yash <= 12){
                cocukSayisi++;
            } else if (yash <= 19){
                ergenSayisi++;
            } else if (yash <= 30){
                gencSayisi++;
            } else if (yash <= 59){
                ortaYashSayisi++;
            } else if (yash <= 120){
                yashliSayisi++;
            }
        }
        
        System.out.println("Ailedeki yaş aralıkları ve kişi sayıları");
        System.out.println("Bebek: " + bebekSayisi + " kişi");
        System.out.println("Çocuk: " + cocukSayisi + " kişi");
        System.out.println("Ergen: " + ergenSayisi + " kişi");
        System.out.println("Genç: " + gencSayisi + " kişi");
        System.out.println("Orta yaş: " + ortaYashSayisi + " kişi");
        System.out.println("Yaşlı: " + yashliSayisi + " kişi");
    }
}
