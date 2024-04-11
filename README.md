## Practical 07

![image](https://github.com/zaselalk/Java-OOP-Practice/assets/43272744/f5a282cf-61a2-4375-af20-a38aef365193)

- Write the interface called GeometricObject, which declares two abstract methods: getPerimeter() and getArea(), as specified in the class diagram.
(Perimeter : 2πr, Area : πr2)

- Write the implementation class Circle, with a variable radius, which implements the interface GeometricObject.
i. You must get the radius as a user input.
ii. radius must be a positive number(radius >= 0).
iii. If user enters a negative value, program should ask for the radius value again by prompting “Negative values are not allowed, Please re-enter a
positive value : ”


c. The class ResizableCircle is defined as a subclass of the class Circle, which also
implements an interface called Resizable, as shown in class diagram. The
interface Resizable declares an abstract method resize(), which modifies the
dimension (radius) by the given percentage. Write the interface Resizable and the
class ResizableCircle.

You must get the percent as a user input.percent must be an integer number between -100 and +100(-100<= radius>= +100) , User input value is positive it will increase the radius value
while negative value will decrease the radius value by given percentage.)

If user enters an invalid value, program should ask for the percent value again by prompting “Value entered is invalid, Please re-enter a value
between -100 to +100 : ”.


Write a test program called TestCircle to test the methods defined in Circle and ResizableCircle.

i. Create a circle object with radius 7.0
1. Display perimeter and area of the above created circle.
2. Reset the radius as 14.0 and display radius, perimeter and area of
the above created circle.

ii. Create a resizablecircle object with radius 7.0
1. Display perimeter and area of the above created resizablecircle.
2. Resize the radius by +100% and display new radius, perimeter and
area.
3. Reset the radius as 7.0, Resize the radius by -100% and display
new radius, perimeter and area.
