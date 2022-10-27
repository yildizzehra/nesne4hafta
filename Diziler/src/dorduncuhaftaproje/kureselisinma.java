package dorduncuhaftaproje;

import java.util.Scanner;

public class kureselisinma {

	static void soru1() {
		System.out.println("küresel ısınma zararlımıdır? ");
		System.out.println("1- evet");
		System.out.println("2- hayir");
		System.out.println("3- duruma gore degisir");
		System.out.println("4- ilgilenmiyorum");
		}
	static void soru2() {
	}
	static void soru3() {
		
	}
	public static void main(String[] args) {
		System.out.println("sıklar icin 1,2,3,4 giriniz");
		Scanner sc = new Scanner(System.in);
		int sayac=0;
		int[] dizi = new int[5];
		soru1();
		dizi[0]=sc.nextInt();
		if (dizi[0] == 1) {
			sayac++;
			System.out.println("dogru");
		}else {
			System.out.println("yanlıs");
		}
		System.out.println();
		System.out.println("kuresel isinma kutuplara zarar verir mi?");
		System.out.println("1-hayir");
		System.out.println("2-evet");
		System.out.println("duruma gore degisir");
		System.out.println("4-ilgilenmiyorum");
		dizi[1]=sc.nextInt();
		if(dizi[1]==2) {
			sayac++;
			System.out.println("dogru");
			
		}else {
			System.out.println("yanlıs");
		}
		System.out.println();
		
		System.out.println("kuresel isinma engellenebilir mi?");
		System.out.println("1-hayir");
		System.out.println("2-evet");
		System.out.println("3-duruma gore degisir");
		System.out.println("4- ilgilenmiyorum");
		dizi[1]=sc.nextInt();
		if(dizi[2] == 3) {
			sayac++;
			System.out.println("dogru");
		}else {
			System.out.println("yanlis");
		}
		System.out.println();
		System.out.println("kuresel isinma dunyayı isitir mi?");
		System.out.println("1-hayir");
		System.out.println("2-evet");
		System.out.println("3-duruma gore degisir");
		System.out.println("4- ilgilenmiyorum");
		dizi[3]=sc.nextInt();
		
		if(dizi[3]==4) {
			System.out.println("dogru");
			
			
		}else {
			System.out.println("yanlis");
		}
		System.out.println();
		if (sayac==5) {
			System.out.println("mukemmel");
		}else if(sayac == 4) {
			System.out.println("cok iyi");
		}else {
			System.out.println("kuresel isinma hakkinda bilgilerini tazelemen gerek.");
		}
		
		
				
	}
}
