package com.company;

public class Main {

    public static void main(String[] args) {
	// 6-> 1,2,3 TOPLAMI KENDİSİNE EŞİT OLAN MÜKEMMEL SAYİ DENİR
        // 28->1,2,4,7,14
        int number =28;
        int total=0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println("mükkemel sayi");
        }else{
            System.out.println("mükemmel sayi değildir");
        }
    }
}
