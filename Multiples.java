package JavaLab;
class Five extends Thread
{
 public void run()
 {
	 System.out.println("Multiples of 5: \n");
	 for(int i=0;i<=100;i=i+5)
	 {
		 System.out.print("  "+i);
	 }
 }
}
class Ten extends Thread
{
 public void run()
 {
 System.out.println("\nMultiples of 10: \n");
 for(int i=0;i<=200;i=i+10)
 {
	 System.out.print("  "+i);
 }
 }
}
public class Multiples {
 public static void main(String[] args) {
 Five f=new Five();
 f.start();
 Ten t=new Ten();
 t.start();
 }
}
