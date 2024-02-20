
# Study Java

Simply because I want to make a documentation. 
                    
Integer Types (Primitive)
-
| Type    | Size    | Value |
| --------| --------|-------|
| byte    | 1 byte  |-128 to 127|
| boolean | 1 bit   |True or False|
| short   | 2 bytes |-32,768 to 32,767|
| char    | 2 bytes |single letter / ASCII|
| int     | 4 bytes |-2,147,483,648 to 2,147,483,647|
| float   | 4 bytes |6 to 7 decimal digits|
| long    | 8 bytes |-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
| double  | 8 bytes |15 decimal digits|

*long end with L, float end with f, and double end with d.

Strings
-
| Syntax        | Output |
| ------------- | ------|
| toUpperCase() | HELLO WORLD |
| toLowerCase() | hello world |
| firstName + " " + lastName  | firstName lastName |
| (firstName.concat(lastName))  | firstName lastName |
| \' | \'Snow White\' |
| \" | \"Snow White\" |
| \\ | Snow \\ White |
| \n | new line (Hello\nWorld) |
| \r | carriage return (Hello\rWorld) |
| \t | tab (Hello\tWorld) |
| \b | backspace (Hel\blo World) |
| \f | form feed |

Math
-
| Syntax           | Output |
| ------------     | -------|
| Math.max(5, 10)  | 10 |
| Math.min(5, 10)  | 5 |
| Math.sqrt(49)    | 7 |
| Math.abs(-5.3)   | 5.3 |
| int randomNum = (int)(Math.random() * 101);   | 0 to 100 |

Java Conditions and If Statements
-

* Less than: a < b
* Less than or equal to: a <= b
* Greater than: a > b
* Greater than or equal to: a >= b
* Equal to a == b
* Not Equal to: a != b

Java Break and Continue 
-
`break` It was used to "jump out" of a switch statement.

    for (int i = 0; i < 10; i++) {
        if (i == 4) {
        break;
      }
      System.out.println(i);
    }

`continue` breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

    for (int i = 0; i < 10; i++) {
        if (i == 4) {
        continue;
      }
      System.out.println(i);
    }

Java Arrays 
-
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

    String[] fruits = {"Melon", "Durian", "Grape", "Banana", "Apple"};
    System.out.println(fruits[0]);
    // Outputs Melon

* Array Length: To find out how many elements an array has. 

        String[] fruits = {"Melon", "Durian", "Grape", "Banana", "Apple"};
        System.out.println(fruis.length);
        // Outputs 5

* Loop Through An Array: use the for `loop`, and use the `length` property to specify how many times the loop should run.

        String[] fruits = {"Melon", "Durian", "Grape", "Banana", "Apple"};
        for (int i = 0; i < fruits.length; i++) {
        System.out.println(fruits[i]);
        }
        // Output Melon, Durian, Grape, Banana, Apple

* Loop Through an Array with For-Each: used exclusively to loop through elements in arrays.

        String[] fruits = {"Melon", "Durian", "Grape", "Banana", "Apple"};
        for (String i : fruits) {
        System.out.println(i);
        }
        // Output Melon, Durian, Grape, Banana, Apple

*  Multidimensional Arrays: is an array of arrays.
        
        // 2 Dimensional Array
        int[][] numbers = { {1, 2, 3, 4}, {5, 6, 7} };

OOP (Object Oriented Programming)
- 
* OOP is faster and easier to execute
* OOP provides a clear structure for the programs
* OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
* OOP makes it possible to create full reusable applications with less code and shorter development time
* Classes and objects are the two main aspects of object-oriented programming. A class is a template for objects, and an object is an instance of a class. Example: https://github.com/missterre12/study-java/blob/main/assets/class.png
    
