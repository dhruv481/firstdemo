# firstdemo
 JAVA Programming 
 <br>
 <h3>Primitive Data types and sizes:</h3>
 byte - 1 [-128 to 127]<br>
 short - 2 [-32768 to 32767]<br>
int - 4 [1,2,3,...]<br>
long - 8 [12345678900L]<br>
float - 4 [3.14F]<br>
double - 8 [34.234235D]<br>
char - 2 [a,b,c,d,e,...]<br>
boolean - 1 [True/False]

<h3>Non-Primitive data types:</h3>
String<br>
Array<br>
Class<br>
<b>Always initialise non-primitive data types with new keyword</b>
<br><br>
<h3>Strings in Java</h3><br>
        
        //Initialization
        String fname = "Dhruv";
        String lname = "Gupta";

        //Concatenation
        String name = fname + " " + lname;
        System.out.println(name);

        //charAt (starts from index 0)
        System.out.println(name.charAt(3));

        //Length
        System.out.println(name.length());

        //replace (works separately for lowercase and uppercase)
        String demo =  "Aman";
        String demonew = demo.replace('a','b');
        System.out.println("old = " + demo + "     and new = " + demonew);

        //Sub-string (first index is taken into substring and last index is not taken)
        System.out.println(name.substring(6,11));


Output:

        age = 22
        Dhruv Gupta
        u
        11
        old = Aman     and new = Ambn
        Gupta

