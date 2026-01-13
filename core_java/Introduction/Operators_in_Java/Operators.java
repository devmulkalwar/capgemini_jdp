

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
