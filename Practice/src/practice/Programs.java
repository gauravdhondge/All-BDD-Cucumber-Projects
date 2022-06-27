package practice;

import java.util.Arrays;

public class Programs {

	
	public static void main(String[] args) {
	
System.out.println("print array as it is");		
		
int a[] = {1,44,65,34,12};

for(int i=0;i<=a.length-1;i++) {
	
	System.out.println(a[i]);
}

System.out.println("print array in ascending order");

Arrays.sort(a);

for(int i=0;i<=a.length-1;i++) {
	
	System.out.println(a[i]);
}

System.out.println("print array in descending order");


for(int i=a.length-1;i>=0;i--) {
	
	System.out.println(a[i]);
}

		
		
		
		
		
		
	}
	
}
