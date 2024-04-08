package com.java.association;

public class CohesiveExample  
{   
public void addition(int a, int b)  
{  
int sum = a + b;  
System.out.println("Addition of the numbers " + a + " and " + b + " is: " + sum);  
}  
  
public void findingVowel(char a)  
{  
switch(a)  
{  
case 'a' :  
case 'e' :  
case 'i' :  
case 'o' :  
case 'u' :  
    System.out.println(a + " is a vowel.");  
break;  
default:  
   System.out.println(a + " is not a vowel.");  
}  
}    
public static void main(String argvs[])  
{  
int a = 9;  
int b = 46;  
char c = 't';  
char d = 'o';  

CohesiveExample obj = new CohesiveExample();  
obj.addition(a, b);  
obj.findingVowel(c);  
obj.findingVowel(d);  
}  
}  