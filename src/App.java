   public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("how\"s you?");
        System.out.println(8 / 3);
    }
}
   
// primitives? basic data types
// byte wrapper class
// short
// int
// long 
// float
//double
//System.out.println(Interger.SIZE); // 4 BYTE = 32 bits
//System.out.println(BYTE.SIZE); // 4 BYTE = 32 bits

if(condition)
{
// do something
(X > Y) 
    System.out.println("X is greater than Y");
    else{
        System.out.println("Y is greater than X");
    }
}

public String fizzString(String str) {
    
    int strlength = str.length();
    char no1 = str.charAt(0);
    char charx = str.charAt(strlength-1);
    if(no1 == 'f' && charx=='b'){
      return "FizzBuzz";
    }
    else if(no1=='f'){
      return "Fizz";
    }
    else if(charx=='b'){
      return "Buzz";
    }
  return str;
}
