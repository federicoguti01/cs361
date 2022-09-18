/**
 * 
 */
package mystack;

/**
 * @author Federico Gutierrez (fg42768n@pace.edu)
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack == null) {
			return null;
		}
		T temp = theStack.val;
		theStack = theStack.next;
		return temp;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newStack = new MyNode<T>(v, theStack);
		theStack = newStack;
		System.out.println(theStack.val);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stack = new MyStack<Integer>();
		// Push 1 and 2
		stack.push(1);
		stack.push(2);
		// Pop
		stack.pop();
		// Push 5
		stack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> people = new MyStack<Person>();
		// Push a person p1 with your name
		Person fede = new Person("Federico", "Gutierrez");
		people.push(fede);
		// Push a person p2 with my name
		Person scharff = new Person("Christelle", "Scharff");
		people.push(scharff);
		
	}

}
