##Factory Pattern

Factory design pattern in Java one of the core design pattern. Factory Design pattern is based on Encapsulation object oriented concept. Factory method is used to create different object from factory often refereed as Item and it encapsulate the creation code. So instead of having object creation code on client side we encapsulate inside Factory method in Java.

In this Factory pattern examples, objects are being created without exposing the creation logic to the client and refer to newly created object using a common interface.

**Step 1:** Create a Interface - In my example, I created **_Shape_**

**Step 2:** Create concrete classes that implements the interface - In my example, I created **_Circle, Rectangle, Square_**

**Step 3:** Create a factory to generate object of concrete classes based on given information. - I created **_ShapeFactory_** in this example.


**Step 4:** Implement by using the ShapeFactory to get the object of concrete classes by passing an information such as type of shape that we want.

