package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Programs {
	
	
//	public static boolean isPrime(int n) {
//
//		if (n < 2) {
//
//			return false;
//		}
//
//		for (int i = 2; i<=n / 2; i++) {
//
//			if (n % i == 0) {
//
//				return false;
//			}
//
//		}
//
//		return true;
//
//	}	
	
	
	
public static void main(String[] args) {
	
//------to check whether no is prime or not------------------------------------------------	
	
//	int n = 5;
//
//	if (isPrime(n)) {
//
//		System.out.println("The number is prime");
//	}
//
//	else {
//
//		System.out.println("The number is not prime");
//	}
	
	
//----------to print prime numbers between 1-100--------------------------------------------	

//	for (int i = 1; i <= 100; i++) {
//
//		if (isPrime(i)) {
//
//			System.out.println("The prime numbers are:" + i);
//		}
//
//	}
	
	
//-----count vowels in String-------------------------- 
	
//	String a = "geeksforgekks";
//	
//	int count = 0;
//	
//	for(int i=0;i<a.length();i++) {
//		
//		
//		if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||
//				
//		a.charAt(i)=='o'||a.charAt(i)=='u') {
//		
//			count++;
//			
//	}	
//	}	
//		
//		
//	
//	
// System.out.println("total no.of vowels in string :"+count);
	
 
	

//-----------concat the strings-------------------

//String s1 = "jayesh";
//String s2 = "gaurav";
//String s3 = "madhuri";
//
//
//
//s1 = s1.concat(s2).concat(s3);
//
//
//System.out.println(s1);

//--------------no. of words in string---------------------------

//String a = "hello hi by";
//
//System.out.println(a.split("\\s+").length);
	
	//   using scanner class//
	
//	System.out.println("Enter the string");
//	
//	Scanner sc = new Scanner(System.in);
//	
//	String a = sc.nextLine(); //---------read the words from next line----//
//	 
//	 int count = 1; //----you will have to give some single word/character, and it will start from 1
//	 
//	 for(int i=0;i<a.length();i++) {
//		 
//		 
//		 if((a.charAt(i)== ' ') &&(a.charAt(i+1)!=' ')){
//			
//			 count++;
//			 
//		 }
//	 }
//	
//  System.out.println(count);
	 
	 

//----------String contains vowels or not------------------------------

//String a = "test me";
//
//if(a.matches(".*[aeiou].*")) {
//	
//	System.out.println("yes");
//}
//	
//else {
//	
//	System.out.println("no");
//}
	
//------pallindrome no----------------------------------------------	
	
//String a = "1234";
//String b = "";
//
//for(int i=a.length()-1; i>=0; i--) {
//	
//	b = b+a.charAt(i);
//}
//
//if(a.equals(b)) {
//	
//	
//	System.out.println("no is palindrome");
//	
//}
//
//else {
//	
//	System.out.println("no is not palindrome");
//}
	
//----------how many no are even or odd in array-------------------------------	
	

//int a[] = {22,4,5,7,12};
//int even =0;
//int odd = 0;
//
//for(int i=0; i<a.length;i++) {
//	
//	if(a[i]%2==0) {
//	
//	even++;
//		
//	}
//	
//	else {
//		
//		odd++;
//	}
//	
//	
//}
//	
//System.out.println("odd no:"+odd);	
//System.out.println("even no:"+even);	
	
	
	
	
//-------find greatest of two no's without using if else condition------------------	
	
//int a = 100;
//int b = 20;
//int c;
//
//c=a>b?a:b;
//
//System.out.println(c);


//-------find how many upper and lower case letters are there in a string-------------

	
//	String a = "WELcome TO AutomatioN";
//	int lower = 0;
//	int upper = 0;
//	char b;
//	
//	for(int i=0; i<a.length(); i++) {
//		
//		b= a.charAt(i);
//
////-----65 & 90 int ----------------------------		
//	if(b>='A'&& b<='Z') {
//	
//		upper++;
//	}
//		
//	else if(b>='a'&& b<='z') {
//		
//		lower++;
//		
//	}
//	}
//
//
//System.out.println("no of uppercase letters:"+upper);
//System.out.println("no of lowercase letters:"+lower);
	
	
//-------find the sum of no's in the array----------------------------------------	
	
	
//	int a[]= {22,45,3,12,5};
//	int sum = 0;
//	
//	for(int i=0; i<a.length; i++) {
//		
//		sum = sum+ a[i];
//	}
//	
//  System.out.println("Sum of no's in array is:"+sum);	
//	
	

//--------count spaces in the string--------------------------------------------------	

//	String a = "ad  sksksk sssi6 hy5bn6try7ijjsi   ";
//	int count = 0;
//	int c;
//
//	for (int i = 0; i <= a.length()-1; i++) {
//
//		c = a.charAt(i);
//
//		if (c == ' ') {
//
//			count++;
//		}
//
//	}
//
//	System.out.println("No of spaces in the String:" + count);
	
	
//-----to find no is odd or even-------------------------------------------
	
//	int a = 10;
//	
//	if(a%2==0) {
//		
//	System.out.println("no is even");	
//		
//	}
//	
//	else {
//		
//		System.out.println("no is odd");	
//		
//	}
	
//---------------swapping of two no's with using third variable--------------------------	
	
//	int a = 10;
//	int b = 20;
//	int c;
//	
//	c = a;
//	a=b;
//	b=c;
//	
//	System.out.println("a:"+a);
//	System.out.println("b:"+b);
	
//----------------swapping of two no's without using third variable---------------------	
	
//	int a = 10;
//	int b = 20;
//		
//	a= a+b; //30
//	b= a-b; // 30-20 = 10
//	a= a-b; // 30-10 = 20
//	
//	System.out.println("a:"+a);
//	System.out.println("b:"+b);	
	
	
//---------------factorial no-------------------------------------------------	
	
//int a = 5;
//int b = 1;
//
//for(int i=1; i<=a; i++) {
//	
//	b = b*i;
//	
//}
//	
//System.out.println("Factorial is:"+b);	
	

//-------------find how many special characters are there in string-------------------------------------------------	
	
	
//	String a = "jayesh*&^%";
//	int count = 0;
//
//	for (int i = 0; i <= a.length()-1; i++) {
//
//		if (!Character.isDigit(a.charAt(i))&&!Character.isLetter(a.charAt(i))
//			&&!Character.isWhitespace(a.charAt(i))) {
//
//			count++;
//
//		}
//
//	}
//	
//	if(count==0) {
//		
//	System.out.println("no special characters in String");	
//		
//	}
//	
//	else {
//		
//	System.out.println("special characters found are:"+count);
//		
//	}
  
  
  //-------------print string without special character-----------------
  
//  String s =  "@#$% ***&^^% ((((*&^^^^ jayesh";
//  String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
//
//  System.out.println(s1);
//  
//  
  
 
//-------------replacing 1st staring characters in the string-----------------------
  
//           String a = "jayesh";
//           String a1 = a.replaceFirst("ja", "ma");
//           System.out.println(a1);
 
   
	
	
//-----------------------remove duplicate characters from string--------------------
	
	
//	String a = "programming";
//	StringBuilder sb = new StringBuilder();
//	Set<Character> set = new LinkedHashSet();
//	for(int i=0; i<a.length();i++) {
//		
//		set.add(a.charAt(i));
//	}
//	
//	for(Character c :set) {
//	
//		sb.append(c);
//	}
//	
//	
//	System.out.println(sb);
	
	

//-----------to find how much time a alphabet is repeated in the string------------------------
	
	
//	String a = "java programming java opps java";
//	 
//	int TotalAlphabets = a.length();
//	
//	System.out.println(TotalAlphabets);
//	
//	int TotalCount_afterRemove = a.replace("a","").length();
//	
//	
//	int count = TotalAlphabets-TotalCount_afterRemove;
//	
//	System.out.println("number of occurrances of a:"+count);
	
	
//---------------------OR-----------------------------------------------	
	
//	long count1 =a.chars().filter(e -> (char)e=='a').count();
//	System.out.println(count1);
	
  
  
 //-----------String contains alphabets or not---------------------------------- 
  
//  String a = "school";
//   
//   char[] b = a.toCharArray();
//  
//for(int i=0; i<a.length(); i++) {
//	
//	  boolean ans = Character.isAlphabetic(b[i]);
//
//System.out.println(ans);
//}
   
 //------------------how much alphabets are there in the string-------------------

//String a = "school";
//int count =0;
//
//char[] b = a.toCharArray();
//
//for(int i=0; i<a.length(); i++) {
//	
//	  boolean ans = Character.isAlphabetic(b[i]);
//
//	  
//	if(ans==true) {
//		
//		count++;
//	}
//	  
//}
//
//System.out.println(count);
	
	
	
	
	

 //--------------------how much numerics are there in the string-------------------
	
	
//	String a = "jayesh 1232234";
//	int count = 0;
//	
//	char[] b = a.toCharArray();
//	
//	for(int i=0; i<a.length(); i++) {
//		
//		boolean ans = Character.isDigit(b[i]);
//	
//	if(ans==true) {
//		
//		count++;
//		
//	}
//	}
//	
//	System.out.println(count);
	

//-------how much numerics and alphabets present in the string------------------------
	
	
//	String a = "jayesh 1232234";
//	int countAlbhabets = 0;
//	int countnumerics = 0;
//	char[] b = a.toCharArray();
//	
//	for(int i=0; i<a.length(); i++) {
//		
//		boolean alpha = Character.isAlphabetic(b[i]);
//		boolean num = Character.isDigit(b[i]);
//	
//	if(alpha==true) {
//		
//		countAlbhabets++;
//		
//	}
//	
//  if(num==true) {
//		
//	countnumerics++;
//		
//	}
//	}
//	
//	System.out.println(countAlbhabets);
//	System.out.println(countnumerics);


	
//---------------spaces present in the string----------------------------
	
//	String a = "jayesh 1232234";
//	int countspaces = 0;
//	
//	char[] b = a.toCharArray();
//	
//	for(int i=0; i<a.length(); i++) {
//		
//		boolean space = Character.isSpaceChar(b[i]);
//		boolean space = Character.isWhitespace(b[i]);
//	
//	if(space==true) {
//		
//		countspaces++;
//		
//	}
//	}
//	
//	
//	System.out.println(countspaces);

	  
	
//--------------find duplicate no's from the array--------------------------	
	
//	int a[] = { 2, 3, 44, 44, 67, 87, 44, 5 };
//	
//
//	for (int i = 0; i < a.length; i++) {
//
//		for (int j = i + 1; j < a.length; j++) {
//
//			if (a[i] == a[j]) {
//
//				System.out.println(a[i]);
//
//			}
//
//		}
//
//	}	
	
	
//--------------print initials/first character of string-----------------------------------	
	
//	String a = "Jayesh Shamkumar Dhondge";
//	
//	char b[] = a.toCharArray();
//	
//	for(int i=0; i<b.length; i++) {
//		
//	if(b[i] != ' ' && (i == 0 || b[i-1]== ' ')){
//		
//		System.out.println(b[i]);
//		
//	}
//		
//	}
	
	
//-----------------------reversing the string---------------------------------	
	
//	String a = "abc def ghi";
//	String rev = "";
//
//	for(int i=a.length()-1; i>=0;i--){
//
//	rev = rev+a.charAt(i);
//
//	}
//
//	System.out.println(rev);
	
	
//----------------------find max value in an array-----------------------------	
	
//	int a[] = {1,2,3,4,5};
//	int max = a[0];    // assuming 0th position as max value
//	
//	for(int i=1; i<a.length;i++) {
//		
//		if(a[i]>max) {
//			
//			max = a[i];
//			
//		}
//	}
//		
//	
//	System.out.println(max);
	
	
//----------------------find min value in an array-----------------------------	
	
//	int a[] = {11,2,34,44,56};
//	int min = a[0];    // assuming 0th position as min value
//	
//	for(int i=1; i<a.length;i++) {
//		
//		if(a[i]<min) {
//			
//			min = a[i];
//			
//		}
//	}
//		
//	
//	System.out.println(min);
	
	
//------------------find common elements between arrays---------------------------	
	
//	int array1[] = {1,2,3,4,5,6,7};
//	
//	int array2[] = {5,6,7,8,9,10};
//	
//	for(int i=0;i<array1.length;i++) {
//		
//		for(int j=0;j<array2.length;j++) {
//			
//		if(array1[i]==array2[j]) {
//			
//			System.out.println(array1[i]);
//		}
//			
//		}
//	}
	
//------------------find common elements between arrays using set collection---------------------------		
	
//   int array1[] = {1,2,3,4,5,6,7};
//	
//	int array2[] = {5,6,7,8,9,10};
//	
//	Set<Integer> set = new HashSet<>();
//	
//	for(int i=0;i<array1.length;i++) {
//		
//		for(int j=0;j<array2.length;j++) {
//			
//		if(array1[i]==array2[j]) {
//		set.add(array1[i]);
//			
//			
//		}
//			
//		}
//	}
//	
//	for(int c :set) {
//		
//		System.out.println(c);
//	}
	
	
//--------------------swapping values in an array------------------------------
	
//	int a[] = {15,12,13,14,11};
//	
//	int temp = a[0];
//	a[0] = a[4];
//	a[4]= temp;
//	
//	
//	System.out.println(Arrays.toString(a));

	
	
}
}
