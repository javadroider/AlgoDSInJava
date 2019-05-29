## S.O.L.I.D Design Priniciples ##
- - - -

### 1. Single Responsibility Principle ###
- The single responsibility principle (SRP) asserts that a class or module should do one thing only. Now, this is kind of subjective, so the principle is reinforced with the heuristic that the class or module should have only one reason to change.

### 2. Open/Closed Principle ###
- The Open/Closed Principle states that code entities should be open for extension, but closed for modification.
- It's closed for modification, but it can be extended by, for instance, inheriting from it and overriding or extending certain behaviors.
- A great example of this in real life is sitting in your pocket in the form of a smartphone. All such phones have app stores and these app stores let you extend the base functionality of the phone. Sure, it ships with the basics: camera operation, actual calls, text messages, etc. But via the app store, you can extend the phone's capabilities to allow you to manage your todo list, play inane video games, and even serve as a flashlight or wireless access point.

### 3. Liskov Substitution Principle ###
- Any child type of a parent type should be able to stand in for that parent without things blowing up.
- We must make sure that new derived classes are extending the base classes without changing their behavior.
- For example, if you have a class, Animal, with a makeNoise() method, then any subclass of Animal should reasonably implement makeNoise(). Cats should meow, dogs should bark, etc. What you wouldn't do is define a MuteMouse class that throws IDontActuallyMakeNoiseException. This violates the LSP, and the argument would be that this class has no business inheriting from Animal.
https://www.oodesign.com/liskov-s-substitution-principle.html

Example
Below is the classic example for which the Likov's Substitution Principle is violated. In the example 2 classes are used: Rectangle and Square. Let's assume that the Rectangle object is used somewhere in the application. We extend the application and add the Square class. The square class is returned by a factory pattern, based on some conditions and we don't know the exact what type of object will be returned. But we know it's a Rectangle. We get the rectangle object, set the width to 5 and height to 10 and get the area. For a rectangle with width 5 and height 10 the area should be 50. Instead the result will be 100

// Violation of Likov's Substitution Principle
class Rectangle
{
	protected int m_width;
	protected int m_height;

	public void setWidth(int width){
		m_width = width;
	}

	public void setHeight(int height){
		m_height = height;
	}


	public int getWidth(){
		return m_width;
	}

	public int getHeight(){
		return m_height;
	}

	public int getArea(){
		return m_width * m_height;
	}	
}

class Square extends Rectangle 
{
	public void setWidth(int width){
		m_width = width;
		m_height = width;
	}

	public void setHeight(int height){
		m_width = height;
		m_height = height;
	}

}

class LspTest
{
	private static Rectangle getNewRectangle()
	{
		// it can be an object returned by some factory ... 
		return new Square();
	}

	public static void main (String args[])
	{
		Rectangle r = LspTest.getNewRectangle();
        
		r.setWidth(5);
		r.setHeight(10);
		// user knows that r it's a rectangle. 
		// It assumes that he's able to set the width and height as for the base class

		System.out.println(r.getArea());
		// now he's surprised to see that the area is 100 instead of 50.
	}
}

### 4. Interface Segregation Principle ###
- The Interface Segregation Principle (ISP) says that you should favor many, smaller, client-specific interfaces over one larger, more monolithic interface. In short, you don't want to force clients to depend on things they don't actually need. Imagine your code consuming some big, fat interface and having to re-compile/deploy with annoying frequency because some method you don't even care about got a new signature.
- To picture this in the real world, think of going down to your local corner restaurant and checking out the menu. You'll see all of the normal menu mainstays, and then something that's just called "soup of the day." Why do they do this? Because the soup changes a lot and there's no sense reprinting the menus every day. Clients that don't care about the soup needn't even be concerned, and clients that do use a different interface -- asking the server.

### 5. Dependency Inversion ###
- The Dependency Inversion Principle (DIP) encourages you to write code that depends upon abstractions rather than upon concrete details. You can recognize this in the code you read by looking for a class or method that takes something generic like "Stream" and performs operations on it, as opposed to instantiating a specific Filestream or Stringstream or whatever. This gives the code in question a lot more flexibility -- you can swap in anything that conforms to the Stream abstraction and it will still work.
