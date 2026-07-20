public class exceptiohandle {
    public static void main(String[] args) {
        
    int i=0;
    int j=0;
    int[] arr = {1, 2, 3, 4, 5};
System.out.println("welcome to exception handling");

try {
    int k=i/j;
    int s=arr[10];
    System.out.println(s);
    
}

catch(ArithmeticException e){
    System.out.println("Cannot divide by zero: ");
}

catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Array index is out of bounds: " );
}

catch(StringIndexOutOfBoundsException e){
    System.out.println("String index is out of bounds: " );

}

catch(Exception e){
    System.out.println("An error occurred: "); }



    

    System.out.println("welcome to exception handling");
    System.out.println("welcome to exception handling");

    }
}
