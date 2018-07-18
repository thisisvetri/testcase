package com.ex2;

public class Palin {

	  public int reverse(int a)
	  {
		  int p=0,x;
		  while(a>0)
		  {
			  x = a%10;
			  p=p*10+x;
			  a=a/10;
		  }
		  return p;
	  }
}