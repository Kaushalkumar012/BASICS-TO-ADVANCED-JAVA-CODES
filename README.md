# BASICS-TO-ADVANCED-JAVA:- (THEORY+ CODES)
This repo contains all the Problem solutions of JAVA BASICS TO ADVANCED.
# i) VARIABLES & DATA TYPES
## - Boilerplate Code( basic code structure):-

```java
public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}
```
## - Output in Java:-
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
## TYPE CONVERSION:-



 



   
   
 
   

   
   

    
