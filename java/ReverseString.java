import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {

        //fizz buzz

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        if(number % 5 == 0 && number % 3 == 0)
        System.out.println(" fizz buzz");
        else if( number % 3 == 0)
        System.out.println("fizz");
        else if( number % 5 == 0)
        System.out.println("buzz");
        else
        System.out.println(number);
}
}

//largest element

// int[] arr={5,6,7,8,9,0};
// int largest = arr[0];

// for(int i= 0; i<arr.length;i++){

//     if(arr[i] > largest )
//         largest = arr[i];
// }
// System.out.println(largest);

//     }



        //palindrome

        // String normal = "madam";
        // String rev = "";

        // for (int i = normal.length()-1; i >= 0; i--) {
        //     rev = rev + normal.charAt(i);
        // }

        // if (normal.equals(rev)) {
        //     System.out.println("palindrome");
        // } else {
        //     System.out.println("not a palindrome");
        // }



//reverse a string in o(n)
    //    String str = "hello";
    //     String result = "";

    //     for(int i = str.length()-1; i>=0; i--) {

    //         result = result +  str.charAt(i);

    //     }

    //     System.out.println(result);
