package practiceJAVA;

import java.util.Arrays;

public class Array {

	
	public static void main(String[] args) {
		
		
		int a[] = {122,23,333,44};
		
 System.out.println("---print original array---");
		
		for(int x=0;x<=a.length-1;x++) {
			
			System.out.println(a[x]);
			
		}
		
		
 System.out.println("---print ascending array---");	
	
		Arrays.sort(a);
		
	
       for(int x=0;x<=a.length-1;x++) {
			
			System.out.println(a[x]);
			
		}
		
    
  System.out.println("---print descending array---");	
		
		
  for(int x=a.length-1; x>=0;x--) {
		
		System.out.println(a[x]);
		
	}
  
  
  int c = 20;
  double d;
  
  d=c;
  
  System.out.println(d);
  
  double f = 23.5556;
  int s = (int) f;
  
  System.out.println(s);
  
  
  
		
	}
	
}
