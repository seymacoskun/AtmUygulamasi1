package com.seyma.atm;
import java.util.Scanner;

public class Atm
{
	public static void main(String[] args)
	{
		System.out.println("*** SEYMA BANK'A HOSGELDINIZ ***");
		Scanner scan = new Scanner(System.in);
		double bakiye = 4500;
		System.out.println("Bakiyeniz: " +bakiye);
		System.out.println("1-) Para Cekme\n2-) Para Yatirma\n3-) Cikis");
		System.out.print("Yapmak Istediginiz Islemi Seciniz: ");
		int secim = scan.nextInt();
		System.out.println("Seciminiz: " +secim);
		
		switch(secim)
		{
		case 1:
			System.out.print("Yatirilan Para Miktari: ");
			double ParaYatirmaMiktari = scan.nextDouble();
			bakiye += ParaYatirmaMiktari;
			break;
			
		case 2:
			System.out.print("Cekilen Para Miktari: ");
			double ParaCekmeMiktari = scan.nextDouble();
			if(ParaCekmeMiktari > bakiye)
			{
				System.out.println("Bakiyeniz Yetersiz!");
			}else{
			bakiye -= ParaCekmeMiktari;
			}
			break;
			
		case 3:
			System.out.println("Cikis yapiliyor. SEYMA BANK IYI GUNLER DILER..");
			break;
		}
		System.out.println("Bakiyeniz: " +bakiye);
	}
}
