public class bestqanda {

public static void main(String[] args) {





}
}




//factorial 

// int n=3;

// int fact=1;

// for (int i = 1; i <= n; i++){
//     fact=fact*i;
// }
// System.out.println(fact);
// }
// }



//Count Vowels
// String str= "Education".toLowerCase();

// int vowels =0;
// int constant=0;

// for (int i = 0;i < str.length(); i++){
// char ch = str.charAt(i);

//  if(ch>='a' && ch<='z'){
// if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
//     vowels++;
//     else
//     constant++;

// }}
// System.out.println(vowels);
// System.out.println(constant);
    
// }



        //prime number

        // int num=5;
        // int count=0;

        // if(num > 1){
        //     for(int i =1;i<=num;i++)
        //     {
        //         if(num%i==0)
        //         count++;
        //     }
        //         if(count == 2)
        //     System.out.println(" prime ");
        //     else
        //     System.out.println(" not an prime");
        // }



        //Method2

//         int num = 13;

//         boolean prime = true;

//         if(num <= 1)
//         prime = false;

//         for(int i=2 ; i<=num;i++)
// {
//     if(num%i==0)
//     prime=false;
//     break;
// }
// System.out.println(prime);




//method3
//public class bestqanda
//     public static boolean isprime(int n){
//         if(n<=1)
//         return false;
// for (int i = 2; i < n; i++) {
//     if(n%i==0)
//     return false;
    
// }
// return true;
//     }

//     public static void main(String[] args) {

//         System.out.println(isprime(17));
//         System.out.println(isprime(18));


        
//  }





    //fizz buzz 
    // for(int i=1;i<=100;i++){

    // if(i%15==0)
    //     System.out.println( i  +"FizzBuzz");

    // else if(i%3==0)
    //     System.out.println( i + "Fizz");

    // else if(i%5==0)
    //     System.out.println(i +"Buzz");

    // else
    //     System.out.println(i);








    // panildorme

    // String str="madam";

// String rev="";

// for(int i=str.length()-1;i>=0;i--){

//     rev+=str.charAt(i);

// }

// if(str.equals(rev))
//     System.out.println("Palindrome");
// else
//     System.out.println("Not");

//     String str="madam";

// int left=0;
// int right=str.length()-1;

// boolean palindrome=true;

// while(left<right){

//     if(str.charAt(left)!=str.charAt(right)){

//         palindrome=false;
//         break;

//     }

//     left++;
//     right--;

// }

// System.out.println(palindrome);




//reverse a string 

// public class ReverseString {

//     public static void main(String[] args) {

//         String str = "hello";
//         String result = "";

//         for(int i = str.length()-1; i>=0; i--) {

//             result += str.charAt(i);

//         }

//         System.out.println(result);

//     }
// }