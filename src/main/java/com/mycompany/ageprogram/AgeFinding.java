package com.mycompany.ageprogram;

public class AgeFinding {
    
    public static void main(String[] args) {
        int age = (int) (Math.random() * 100);
	        
        if (age <= 3){
            System.out.println("Bebek");
        } else if (age <= 12){
            System.out.println("Çocuk");
        } else if (age <= 19){
            System.out.println("Ergen");
        } else if (age <= 30){
            System.out.println("Genç");
        } else if (age <= 59){
            System.out.println("Orta yaş");
        } else if (age <= 120){
            System.out.println("Yaşlı");
        } 
            System.out.println("");

        }

}
