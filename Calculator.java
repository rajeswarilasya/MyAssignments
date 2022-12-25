package week1.day1;

public class Calculator {
 public void subtractTwoNumbers() {
	 int a=20;
     int b=10;
     int c=a-b;
     System.out.println(c);
    }

 public int multiply(int a, int b)
 { return a*b;
 }
 
 public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.subtractTwoNumbers();
	
	System.out.println(cal.multiply(10, 20));
}}