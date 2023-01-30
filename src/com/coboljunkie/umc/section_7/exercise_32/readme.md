Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):

<li>Method named getWidth without any parameters, it needs to return the value of width field.</li>

<li>Method named getHeight without any parameters, it needs to return the value of height field.</li>

<li>Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.</li>

<li>Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.</li>

<li>Method named getArea without any parameters, it needs to return the area of the wall.</li>



TEST EXAMPLE

→ TEST CODE:

1 Wall wall = new Wall(5,4);<br>
2 System.out.println("area= " + wall.getArea());<br>
3<br>
4 wall.setHeight(-1.5);<br>
5 System.out.println("width= " + wall.getWidth());<br>
6 System.out.println("height= " + wall.getHeight());<br>
7 System.out.println("area= " + wall.getArea());<br>


→ OUTPUT:

area= 20.0<br>
width= 5.0<br>
height= 0.0<br>
area= 0.0<br>




NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 5 methods and 2 constructors.

NOTE: Do not add a main method to the solution code.