class FibonacciRunnable implements Runnable
{
	int n;

	FibonacciRunnable(int n)
	{
		this.n = n;
	}

	public void run()
	{
		System.out.println("Fibonacci Series:");
		int a = 0, b = 1;

		for(int i = 1; i <= n; i++)
		{
			System.out.println(a);
			int next = a + b;
			a = b;
			b = next;
		}
	}
}

class EvenRunnable implements Runnable
{
	int start, end;

	EvenRunnable(int start, int end)
	{
		this.start = start;
		this.end = end;
	}

	public void run()
	{
		System.out.println("Even numbers between " + start + " and " + end + ":");

		for(int i = start; i <= end; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}

public class ThreadRunnableExample
{
	public static void main(String[] args)
	{
		FibonacciRunnable f1 = new FibonacciRunnable(10);
		EvenRunnable e1 = new EvenRunnable(1, 20);

		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(e1);

		t1.start();
		t2.start();
	}
}
	
