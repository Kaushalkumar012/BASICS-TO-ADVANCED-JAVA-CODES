## 📌 Why This Repo?

I created this repository to:

- 📅 **Track my daily/weekly progress** in Java programming.  
- 💡 **Document and share learnings** that may help other aspiring Java developers.  
- 🧱 **Build a strong foundation** in core Java concepts before moving into advanced and real-world projects.  
- 👨‍💻 Stay consistent with hands-on coding, problem-solving, and understanding Java frameworks.  
- 🚀 Showcase my journey and growth as a **Java Developer**.  


## BASICS-TO-ADVANCED-JAVA:- (THEORY+ CODES)
This repo contains all the Problem solutions of JAVA BASICS TO ADVANCED.
### i) VARIABLES & DATA TYPES
### - Boilerplate Code( basic code structure):-

```java
public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}
```
### - Output in Java:-
i)print [ System.out.print("hello world"); ] <br>
ii)println [System.out.println("hello world"); ] <br>
iii)"/n" [System.out.print("/n hello world"); ]
 * println & /n is used for changing the line.<br>
 -> Example:-
   ```java
   public class Pattern {
    public static void main(String[] args) {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
   } 
   ```
   Output:-
   ```java
   ****
   ***
   **
   *
   ```
   ## VARIABLES In JAVA:-
   Variables in java are containers used to store data values.Every variables must be declared with a datatype.<br>
   ex:- 2*(a + b)<br>
   in this 2 is called literal and a and b are called variables.<br>
   literals means(fixed values directly written to the source code.)<br>
   NOW,<BR>
   WRITE CODE USING VARIABLES:-<BR>
   ````java
   public class Variables {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        String name ="kaushal";
        System.out.println(a);
        System.err.println(b);
        System.out.println(name);
    }
   }
   ````
   Output:-
   ```java
   5
   kaushal
   10
   ```
   ## DATA TYPES:-<br>
   i) Primitive
   ii) Non-Primitive

  ## 📊 Primitive vs Non-Primitive Data Types in Java

| Feature                | 🟢 Primitive Data Types                      | 🔵 Non-Primitive Data Types                  |
|------------------------|---------------------------------------------|---------------------------------------------|
| **Definition**         | Basic built-in data types                   | Reference types that point to objects       |
| **Examples**           | `int`, `float`, `char`, `boolean`, etc.     | `String`, `Array`, `Class`, `Interface`     |
| **Memory Storage**     | Stack memory                                | Heap memory                                 |
| **Default Value**      | Zero-based (e.g., 0, 0.0, false)            | `null`                                      |
| **Size**               | Fixed                                        | Not fixed                                   |
| **Object**             | No                                           | Yes                                         |
| **Can be null?**       | ❌ No                                        | ✅ Yes                                       |
| **Methods Available?** | ❌ No                                        | ✅ Yes                                       |
| **Inheritance**        | ❌ Not possible                              | ✅ Supports inheritance                     |
| **Wrapper Classes**    | Available (`Integer`, `Float`, etc.)         | Not required (already classes)              |

## CODE USING DIFFERENT DATATYPES:-
Example:-
````java
public class Datatype {
     public static void main(String args[]){
    int a =10;
    float f= 1.01f;
    double l =1.93999;
    string name="kaushal"
    long b= 8837;
    short d= 24;
    byte e= 8;
     System.out.println(a);
     System.out.println(f);
     System.out.println(l);
     System.out.println(name);
     System.out.println(b);
     System.out.println(d);
     System.out.println(e);
 }
}
````
Output:-
````java
10
1.01
1.93999
kaushal
8837
24
8
`````
##  Type Conversion:- (Widening Conversion)
   ⦿ Type conversion converting a variable from data type to another.
   
## When the conversion happen?<br>
   • Type compatible.<br>
   • Destination type > source type.<br>
    (Small data type stored in big datatype.)<br>
    Byte-> short > int > float > long > double.<br>  
  -> Example:-'
  ````java
import java.util.Scanner;
public class Typeconversion{
    public  static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt(); //62
        System.out.println(number);
    }
}
````
Output:-
````java
62.0
````
## Type Casting:- <BR>
⦿ Also called as Narrowing (Explicit) Type Casting.<br>
⦿ Also called manual type casting, it happens when a larger data type is converted into a smaller data type.<br>
Example:-
 ````java
import java.util.Scanner;
public class Typecasting {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in); //97
        char a = (char)sc.nextShort();
        System.out.println(a);
    }
}
````
Output:-
````
a
````
## Type Promotion In Expressions:-
i) Java automatically promotes each byte,short or char operand to int when evaluating an expression.<br>
ii) If one operand is long,float or double the whole expressions is promoted long,float or double respectively.<br>

Example <u>(when Java automatically promotes each byte, short or char operand to int)</u> <BR>
I)
````java
    public class Type_promotion{
    public static void main(String args[]){
    char a ='a';
    char b ='b';
    System.out.println( (int)b);
    System.out.println( (int)a);
    System.out.println(b-a);
    
    }
}
````
Output:-
````java
 98
 97
 1
````
II}
````java
public class convert_higher{
    public static void main(String args[]){
        short a =5;
        byte b = 25;
        char c= 'c';
        byte result = a+b+c;
        System.out.println(result);
    
    }
}
````
Output:-
````java
Error its shows that byte can't change to int datatype but using type casting we can.
````

Example:-<u>(If one operand is long,float or double the whole expressions is promoted long,float or double.)</u> <BR>
````java
public class convert_higher{
    public static void main(String args[]){
      long a =60;
      int b =10;
      double d =90;
      double ans = a+b;
      System.out.println(ans);
     
    }
}
````
Output:-
````java
70.0
````

   
⦿ VARIABLES & DATA TYPES QUESTIONS.<BR>
[Click Here.pdf](https://github.com/user-attachments/files/20673293/Click.Here.pdf)   

### OPERATORS IN JAVA:-
Symbols that tell compiler to peform some operation.<BR>
### Types of Operators:-<BR>
i)Arithmetic Operator(unary/binary)<BR>
ii)Relational Operator<BR>
iii)Logical Operator<BR>
iv)Bitwise Operator<BR>
v)Assignment Operator<BR>

⦿ Arithmetic Operator:- Are used for performing basic mathematical operations.<br>
•Binary Operators:-(+),(-),(*),(/),(%)<br>
Are Operators that work on two operands.<br>
Example:-
````java

public class arithmetic_binary {
    public static void main(String[] args) {
    int a = 6;
    int b = 5;
    System.err.println(a+b);

    }   
}
````
Output:-
`````java
11
`````
•<h1>Unary Operator:- Operator that operates on a single operand.</h1> <br>
They are used to perform operations like increment,decrement,negation and logical not.<br>
•Increment Operator(++) increases the value of a variable by 1.<br>
<h3>There are Two types of Incremnt Operatrors:-<br></h3>
•Post-Increment(a++):The variable is used first, then incremented.<br>
Example:- 

````java


public class Postincrement {
    public static void main(String[]args){
        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
    
}
````
Output:-
````java
6
5
````
•Pre-Increment(++a):-The variable is incremented first, then used.
Example:-
````java

public class Preincrement {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; 
        System.err.println(a);
        System.err.println(b);
    }
}
````
Output:-
````java
11
11
````
•Decrement Operator(--):- Is used to decrease the value of a variable by 1.<br>
<h3>There are Two types of Incremnt Operatrors:-<br></h3>
•Post-decrement(a--):The variable is used first, then decremented.<br>
Example:-

````java
int a = 5;
int b= a--; // int b=5,a=4
````
•Pre-decrement(--a):The variable is decremented first, then used .<br>
Example:-

````java
int a = 6;
int b = --a; //int a= 5, b=5
````
### RELATIONAL OPERATORS:-
Are used to compare two values.They return a boolean result.-either true or false-based on whether the specified condition is met.<br>
The operators are:-<br>
• ==(equal to)<br>
• !=(not equal to)<br>
• >(greater than)<br>
• <(less than)<br>
• >=(greater than or equal to)<br>
• <=(less than or equal to)<br>

# LOGICAL OPERATOR:-
• Used to perform logical operations on boolean expressions.
## Three types of Logical Operators.
i) Logical AND (&&):It retuns true only if both the conditions are true.
example:-
````java
int a = 10;
int b = 20;
System.out.println(a<b && b<30); //Its returns true:
````
ii) Logical OR (||): It returns true if at least one condition is true.
Example:-
```java
int a = 5;
int b = 10;
System.out.println(a>b || b>8); // Its return True one case is true.
````


iii) Logical NOT (!)

  



    






   
   

    
