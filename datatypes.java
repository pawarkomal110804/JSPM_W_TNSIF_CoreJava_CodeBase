package com.tnsif.day1;

public class variables {

	public static void main(String[] args) {
		int $num=12;
		System.out.println("Value Of The Number Variable:"+$num);
		String StudentName="Komal";
		System.out.println("Value Of Name Is:"+StudentName);
		int value=9/2;
		System.out.println(value);
		float a=100f/3f;
		System.out.println(a);
		double b=100d/3d;
		System.out.println(b);
		char ch='K';
		System.out.println(ch);
		char ch1=65;
		System.out.println(ch1);
		
		// byte ->1 byte=8 bits=2^8
		byte bytemax=127;
		byte bytemin=-128;
		System.out.println(bytemax);
		System.out.println(bytemin);
		
		//short->2 bytes=16 bits=2^16
		short shortmin=-32768;
		short shortmax=32767;
		System.out.println(shortmin);
        System.out.println(shortmax);
        
        //int->4 bytes=32 bits
		int intmin=-2147483648;
		int intmax=2147483647;
		System.out.println(intmin);
		System.out.println(intmax);
		
		//long->8 bytes=64 bits
		long longmin=-9223372036854775807L;
		long longmax=9223372036854775806L;
        System.out.println(longmin);
        System.out.println(longmax);

	}

}
