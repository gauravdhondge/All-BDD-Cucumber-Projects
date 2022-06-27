package practiceJAVA;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
	
		
	int a[]= {12,33,44,555,1};
	
	for(int i=0;i<=a.length-1;i++) {
		
		System.out.println(a[i]);
		
		
	}
		
	Arrays.sort(a);	
	
	System.out.println("print array in asc");
		
	for(int i=0;i<=a.length-1;i++) {
		
		System.out.println(a[i]);
	}
		
	System.out.println("print array in dsc");	
		
	
	
	for(int i=a.length-1;i>=0;i--) {
		
		System.out.println(a[i]);
	}
	
	
	
	
	
	
	
	
		
	}
	
}
