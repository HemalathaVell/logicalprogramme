package org.sample;

public class Sample {
	public static void main(String[] args) {
		int a = 123654;
		int o = 0;
		int count = 0;
		int sum = 0;
		
		while(a>0) {
		int b = a/10;
		int c =a%10;
		o=c+(o*10);
		a=b;
		count++;
		sum = sum +c;
		}
		System.out.println(o);
		System.out.println("Hai Hema");
		System.out.println("hai mohan");
		}
	}

