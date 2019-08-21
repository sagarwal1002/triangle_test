//TRIANGLE TEST CODE BY SAKSHAM
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    // TODO
    Scanner in = new Scanner(System.in);
   //Input
    System.out.println("Enter first side length");
    double a = in.nextDouble();
    double junkA = a;  //Adding junk variables as backup
    System.out.println("Enter 2nd side length");
    double b = in.nextDouble();
    double junkB = b;
    System.out.println("Enter 3rd side length");
    double c = in.nextDouble();
    double junkC = c;
    //Sorting
    if (a>c){
  a=c;
        c=junkA;}
    if (b>c){
  b=c;
        c= junkB;}
       //"What Kind of Triangle" Logic
    if(a+b>c){
        double d = (a*a) + (b*b);
        if(d==(c*c)){System.out.println("Right Triangle.");}
        else if(d>(c*c)){System.out.println("Acute Triangle.");}
        else if(d<(c*c)){System.out.println("Obtuse Triangle.");}
       }
    else { System.out.println("Not a triangle.");}
  }
}
