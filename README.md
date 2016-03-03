# PLAT-ENG-CHALLENGE
1. Coding task: Need to finish this coding task in 2 hours.

please implement an immutable queue with the following api:

	Scala Version:
	trait Queue[T] {
	  def isEmpty: Boolean

	  def enQueue(t: T): Queue[T]

	  def deQueue(t: T): Queue[T]

	  def head: Option[T]
	}

	object Queue {
	  def empty[T]: Queue[T] = ???
	}

	Java Version:
	public interface Queue[T] {

	    public Queue<T> enQueue(T t);

	    public Queue<T> deQueue(T t);

	    public T head();

	    public boolean isEmpty();
	}

2. Design Question: Design A Google Analytic like Backend System.