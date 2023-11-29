package Java;
import java.util.Scanner;


class MultiplicationTable{
//	void PrintMultiplicationTable(int number) {
		synchronized void PrintMultiplicationTable(int number) {
		for(int i =1;i<=10;i++) {
			System.out.println(i+"X"+number+"="+i*number);
		}
	}
}


class MyThread1 extends Thread{
	MultiplicationTable t ;
	MyThread1(MultiplicationTable t){
	this.t=t;
	
}
	public void run(){
		System.out.println(Thread.currentThread().getPriority());
		t.PrintMultiplicationTable(5);
	}
}
	 
	class MyThread2 extends Thread{
		MultiplicationTable t ;
		MyThread2(MultiplicationTable t){
		this.t=t;
		}
		
		public void run(){
			
			System.out.println(Thread.currentThread().getPriority());
			t.PrintMultiplicationTable(7);
		}
	}
	
	
public class ThreadDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	MultiplicationTable m = new MultiplicationTable();
    MyThread1 t=new MyThread1(m);
   
	
    MyThread2 t2=new MyThread2(m);
    
    t2.setPriority(2);
    t2.start();
    t.start();
    
    
	}


}