<h3>Point</h3>
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):

<li>Method named getX without any parameters, it needs to return the value of x field.</li>

<li>Method named getY without any parameters, it needs to return the value of y field.</li>

<li>Method named setX with one parameter of type int, it needs to set the value of the x field.</li>

<li>Method named setY with one parameter of type int, it needs to set the value of the y field.</li>

<li>Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.</li>

<li>Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.</li>

<li>Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.</li>



How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

Where √ represents square root.





TEST EXAMPLE

→ TEST CODE:

Point first = new Point(6, 5);<br>
Point second = new Point(3, 1);<br>
System.out.println("distance(0,0)= " + first.distance());<br>
System.out.println("distance(second)= " + first.distance(second));<br>
System.out.println("distance(2,2)= " + first.distance(2, 2));<br>
Point point = new Point();<br>
System.out.println("distance()= " + point.distance());<br>
OUTPUT

distance(0,0)= 7.810249675906654<br>
distance(second)= 5.0<br>
distance(2,2)= 5.0<br>
distance()= 0.0<br>
NOTE: Use Math.sqrt to calculate the square root √.

NOTE: Try to avoid duplicated code.

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 7 methods.

NOTE: Do not add a main method to the solution code.