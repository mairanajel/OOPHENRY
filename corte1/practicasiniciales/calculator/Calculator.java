package calculator;

import java.util.Scanner;

public class Calculator {
  public Calculator(){
    
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b) {
    return a - b;
  } 

  public int multiply(int a, int b) {
    return a*b;
  }

  public double divide(int a, int b) {
    return a/b;
  }

  public int modulo(int a, int b) {
    return a%b;
  }
  
  public static void main(String[] args) {
      
    Scanner digito = new Scanner(System.in);
    
    System.out.print("Escriba el primer digito:");
    int F1 = digito.nextInt();
    
    System.out.print("Escriba el segundo digito:");
    int F2 = digito.nextInt();
            
    Calculator myCalculator = new Calculator(); 
    System.out.println(myCalculator.add(F1,F2));
    System.out.println(myCalculator.substract(F1,F2));
    System.out.println(myCalculator.multiply(F1,F2));
  
  }
}
