package constructor;

public class Students {
//: We can use access modifiers while declaring a constructor. It controls the object creation. In other words, 
	//we can have private, protected, public or default constructor in Java
//A Java constructor cannot be abstract, static, final, and synchronized
	
	public Students(int x)
	{
		System.out.println("1");
		
	}
	
	public    Students()
	{
		
		//this(10);
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		
		Students s=new Students();
		Students s1=new Students(58);
		//paramatrised 
	}
	
	/*In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

	It is a special type of method which is used to initialize the object.

	Every time an object is created using the new() keyword, at least one constructor is called.

	It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

	

	There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

	Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

	Rules for creating Java constructor
	There are two rules defined for the constructor.

	Constructor name must be the same as its class name
	A Constructor must have no explicit return type
	A Java constructor cannot be abstract, static, final, and synchronized
	
	In the above class,you are not creating any constructor so compiler provides you a default constructor. Here 0 and null values are provided by default constructor.
	
	*/
}
