package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		boolean[] primes = new boolean[41];
	for (int i = 2; i<=40; i ++)
	{ 
		primes[i] = true;
	}
	for(int i=4; i<=40; i+=2)
	{ 
		primes[i] = false;
	}
	for(int i = 6; i<= 40; i+=3)
	{
		primes[i] = false;
	}
	for (int i = 10; i<= 40; i+=5)
	{
		primes[i] = false;
	}
	for (int i = 14; i <= 7; i+=7 )
	{
		primes[i] = false;
	}


    for (int i = 0; i <= 40; i++)
    {
    	if (primes[i] == true)
    	{
    		  System.out.println(i + " is a prime number.");
    	}
    }


}
}