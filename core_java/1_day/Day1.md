# Capgemini Internship Day 1 Notes

## Data Types in Java

### Classification of datatypes in java

![DataTypes in Java](https://media.geeksforgeeks.org/wp-content/uploads/20250619155321977504/data_types_in_java.webp)

### Primitive Datatypes in Java 

| Type    | Description                  | Default | Size                                  | Example            | Range |
|---------|------------------------------|---------|---------------------------------------|--------------------|-------|
| boolean | Logical values               | false   | JVM-dependent (typically 1 byte)      | true, false        | — |
| byte    | 8-bit signed integer         | 0       | 1 byte                                | 10                 | -128 to 127 |
| char    | 16-bit Unicode character     | \u0000  | 2 bytes                               | 'A', '\u0041'      | 0 to 65,535 |
| short   | 16-bit signed integer        | 0       | 2 bytes                               | 2000               | -32,768 to 32,767 |
| int     | 32-bit signed integer        | 0       | 4 bytes                               | 1000, -500         | -2,147,483,648 to 2,147,483,647 |
| long    | 64-bit signed integer        | 0L      | 8 bytes                               | 123456789L         | ±9.22e18 |
| float   | 32-bit floating point        | 0.0f   | 4 bytes                               | 3.14f              | ~6–7 digits precision |
| double  | 64-bit floating point        | 0.0d   | 8 bytes                               | 3.14159d           | ~15–16 digits precision |

### Practical coding example demonstrating all the primitive datatypes 
```java
public class DataTypes {
    public static void main(String[] args) {    
        //numeric data types
        int num1 = 10;
        System.out.println("Value of num1 is : "+ num1);
        float num2 = 10.1f;
        System.out.println("Value of num2 is : "+ num2);
        double num3 = 10.2222d;
        System.out.println("Value of num3 is : "+ num3);
        long num4 = 100000L;
        System.out.println("Value of num4 is : "+ num4);
        byte num5 = 4;
        System.out.println("Value of num5 is : "+num5);
        short num6 = 30000;
        System.out.println("Value of num6 is : "+ num6);

        //character data type
        char char1 = 'a';
        System.out.println("Value of char1 is : "+char1);

        //boolean data type
        boolean isValid = true;
        System.out.println("Value of isValid is : "+ isValid);
    }
}
```
---

## Variables in java 
In Java, variables are containers used to store data in memory. Variables define how data is stored, accessed, and manipulated.

### Rules to Name Java Variables
1. Must Start with letter, _ or $
2. No keywords allowed
3. Case sensitive 
4. Only letter, numbers, _ or $ is allowed
5. No Spaces 
6. Additional rules 
    1. Variable name must be meaningful
    2. Follow naming conventions (camelCase preffered)

### Practical coding example demonstrating how to declare and initialize a variable
```java
public class Variables {
    public static void main(String[] args) {
        //numeric variables 
        int age = 10;
        System.out.println("The age of the person is : "+ age );
        
        //non-numeric variables
        String name = "Dev";
        System.out.println("The name of the person is : "+ name);

    }
}
```

## Operators in Java 

![Operators in java](https://media.geeksforgeeks.org/wp-content/uploads/20251011162509798193/java_operators.webp)

### Summary table of operators in java 

| Operator Type | Operators | Description | Example |
|--------------|-----------|-------------|---------|
| Arithmetic | + - * / % | Math operations | `a + b` |
| Relational | == != > < >= <= | Compare values | `a >= b` |
| Logical | && &#124;&#124; ! | Logical operations | `a && b` |
| Assignment | = += -= *= /= %= | Assign values | `a += 5` |
| Unary | + - ++ -- ! | Single operand ops | `++a` |
| Bitwise | & &#124; ^ ~ << >> >>> | Bit-level ops | `a & b` |
| Ternary | ?: | Conditional operator | `a > b ? a : b` |
| instanceof | instanceof | Type comparison | `obj instanceof String` |

### Practical example demonstrating all the operators in java 

```java
public class Operators {
    public static void main(String[] args) {
        //arithematic operators
        int a = 10;
        int b = 20;

        System.out.println("The sum of a and b is : "+ (a+b));
        System.out.println("The substraction of a and b is : " + (a-b));
        System.out.println("The multiplication of a and b is : " + (a*b));
        System.out.println("The division of a and b is : "+(a/b));
        System.out.println("The modulus of a and b is : "+(a%b));

        //increment and decrement operators
        int c = 10;
        int d = 5;

        System.out.println("The preincrement value of c : " + (++c));
        System.out.println("The predcrement value of d : " + (--d));

        System.out.println("The post increment value of c : " + (c++));
        System.out.println("The post decrement value of d : "+ (d--));

        //assignment operators 
        int e = 20;

        e+= 10;
        System.out.println("Value of e after += : "+ e);

        e-= 5;
        System.out.println("Value of e after += : "+ e);

        e/= 5;
        System.out.println("Value of e after += : "+ e);

        e*= 2;
        System.out.println("Value of e after += : "+ e);

        e%= 10;
        System.out.println("Value of e after += : "+ e);

        //Relational operators

        int p = 10;
        int q = 20 ;

        System.out.println("p>q : "+ (p>q));
        System.out.println("p<q : "+ (p<q));
        System.out.println("p>=q : "+ (p>=q));
        System.out.println("p<=q : "+ (p<=q));
        System.out.println("p==q : "+ (p==q));
        System.out.println("p!=q : "+ (p!=q));

        //Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x&&y) );
        System.out.println("x || y : " + (x||y) );
        System.out.println("!x : " + (!x) );

        //ternary operator

        int l = 10;
        int m = 20;

        System.out.println("Ternary operator : " + ((l>m)?"l is greater":"m is greater"));

        //bitwise operator 
          // Bitwise operators
        int o = 0b1010;
        int k = 0b1100;
      
        System.out.println("o & k : " + (o & k));
        System.out.println("o | k : " + (o | k));
        System.out.println("o ^ k : " + (o ^ k));
        System.out.println("~o : " + (~o));
        System.out.println("o << 2 : " + (d << 2));
        System.out.println("k >> 1 : " + (k >> 1));
        System.out.println("k >>> 1 : " + (k >>> 1));
    }
}
```
