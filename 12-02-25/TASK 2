public class ThreadTwo implements Runnable{
public void run() {
	System.out.println("From ThreadTwo!");
	System.out.println("From ThreadTwo!");
	try {
	System.out.println(10/0);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception");
	}
}
public static void main(String[] args) {
	ThreadTwo t2=new ThreadTwo();
	Thread thread1=new Thread(t2);
	Thread thread2=new Thread(t2);
	thread1.start();
	thread2.start();
	t2.run();
}
}
