import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      if(n<0) {return -1;}

int t1=0,t2=1;
int nextTerm=0;
for (int i = 1; i<= n; ++i)
{
nextTerm = t1 + t2;
t1 = t2;
t2 = nextTerm;

}
return t1;
}      
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
