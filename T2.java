public class T2{

public static void main(String[] args){

// Initializing String variable with null value
String nullString = null;
 
// Checking if nullString.equals(any_string) or works fine.
try {
    // This line of code throws NullPointerException
    // because ptr is null
    if (nullString.equals("any_string"))
        System.out.println("Both strings are same.");
    else
        System.out.println("Both strings are same.");
} catch (NullPointerException e) {
e.printStackTrace();
    
//System.out.println("NullPointerException occurred");
} catch (Exception e) {
e.printStackTrace();
    
//System.out.println("NullPointerException occurred");
}
}
}