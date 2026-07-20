


public class main {
public static void main(String[] args){

//class obj 
//class



}
}


//practice 
// String str ="i am java dev";
// int count=1;

// String str1 = "i am c++ dev";
// String []word = str1.split(" ");
// for(int i = 0; i < word.length; i++) {
// System.out.println(word[i]);
// }



// for(int i =0;i<str.length();i++){
//         if(str.charAt(i)==' ')
//         count++;
        
// }
// System.out.println("It contains : " + count +" words" );



// String s = "Java";
// s.concat(" Developer");
// System.out.println(s);



// StringBuilder sb = new StringBuilder("IAM");
// sb.append(" Developer");
// System.out.println(sb);
//not thread safe

// StringBuffer b = new StringBuffer("rishi");
// b.append("kumar");
// System.out.println(b);
// thread sAFE







//print words seperatly 
// String str = "I am learning Java";

// String[] word = str.split(" ");

// for (int i = 0; i <str.length(); i++) {

// System.out.println(word[i]);

// }







        // find how many words in java 
// String str="i am learning java";
// int count=1;


// String[] word = str.split(" "); 
// System.out.println(word.length);



// for(int i = 0;i<str.length();i++){

//         if(str.charAt(i) == ' ')
//         count ++;

// }
//         System.out.println("words :" + str + " printed " + count + " times ");


// }









        //palindrome

// String str = "madam";
// String rev="";

// for(int i =str.length()-1 ;i>=0;i--)
// {
// rev= rev + str.charAt(i);
// System.out.print(str.charAt(i));
// }
// if(str.contentEquals(rev)){
// System.out.println(" is an panlindrome");
// }
// else
// {
//         System.out.println("  is not an palindrome");
// }










// String basics 

// String name1="Rishi";
// String name2="kumar";

// System.out.println(name1);

// System.out.println(name1.charAt(0));

// System.out.println(name1.length());

// System.out.println(name1.equals(name2));

// System.out.println(name1 == name2);

// System.out.println(name1.toUpperCase());

// System.out.println(name2.toLowerCase());

// System.out.println(name1.contains("ishi"));





//traversal looping through string

// for(int i =0;i<name1.length();i++){

//         System.out.println(name1.charAt(i));
// }
//traversal looping through string







//AEIOU COUNT THE VOWELS 



//vowels and its count 
//String str = "education";
//int count=0;

// for(int i =0; i<str.length();i++){

//         char ch = str.charAt(i);

//         if(ch == 'a' || ch == 'e'|| ch=='i' || ch=='o' || ch == 'u')
//         {
//                 System.out.println(ch);
//                 //count++;
//         }
// }
// }


//}








// 

//frequency count using hashmap to reduce the time complexity to  O(n) 
//int [] numbers={1,2,2,3,3,4,4,5};

// HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

// for(int i =0; i<numbers.length;i++){
//         if(hm.containsKey(numbers[i]))
//         {
//                 hm.put(numbers[i],hm.get(numbers[i])+1);
//         }
//         else{
//                 hm.put(numbers[i], 1);
//         }
// }
// for(Map.Entry entry:hm.entrySet()){
//         System.out.println(entry.getKey()+ "comes"+entry.getValue() );

// }
// }




//even and odd count 

//  int[] arr = {10, 15, 20, 25, 30};

//  int evencount =0;
//  int oddcount = 0;

//  for(int i= 0;i<arr.length;i++)
// {
//     if(arr[i]%2==0){
//         // evencount++;
//         System.out.println(arr[i] + " is odd number");
//     }
//     else{
//         // oddcount++;
//         System.out.println(arr[i] + " is even number");
//     }
//     }
    
    






//frequency count 
  // int[] arr = {1, 1, 2, 2, 2, 3};

        // boolean[] visited = new boolean[arr.length];

        // for(int i = 0; i<arr.length;i++)
        // {
        //     if(visited[i]){
        //         continue;
        //     }
        //     int count = 1;

        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //             visited[j]=true;
        //         }
        //     }
        //     System.out.println(arr[i]+ " visites " + count + " times ");

        // }




// //find the duplicate

// int[] arr = {1,1,3,2,3,2,4,5};

// for(int i =0;i<arr.length;i++)
// {
//     for(int j = i+1;j<arr.length;j++)
// {   
//     if(arr[i]== arr[j])
//     System.out.println("duplicate  is :"+ arr[i]);
//     }
// }






//second largest element in array 
//     int[] arr = {10,30,40,90,20,80,100,120};

//     int largest = arr[0];
//     int secondlargest = arr[0];

//     for (int i = 0; i <arr.length; i++) {

// if(arr[i]>largest){
//     secondlargest = largest;
//     largest= arr[i];
// }
// else if(arr[i]>secondlargest){
//     secondlargest=arr[i];

// }
//     }
//     System.out.println(secondlargest);
//     System.out.println(largest);








//     //reverse an array 
// int[] arr = {1,2,3,4,5};

// for(int i = arr.length-1; i>=0;i--){
//     System.out.println(arr[i]);
// }






        // //linear search 
        // int[] numbers = {10,20,30,40,50};
        // int target = 30;

        // for(int i =0; i<numbers.length;i++)
        // {
        //     if(numbers[i] == target){
        //     System.out.println("Target foud at index :" + i);
        //     }    
        // }







//average 
// int[] numbers = {4,1,8,2,6};

// int sum = 0;

// for(int i = 0 ; i < numbers.length;i++){
// sum = sum + numbers[i];
// }

// int Average = sum /numbers.length;
// System.out.println(Average);
//avg







//max and min  
//max and min  array 
// int[] numbers = {45,12,89,23,56};

// int max = numbers[0];

// for(int i=0;i<numbers.length;i++){

// if(max < numbers[i])
// {
//     max = numbers[i];
// }    
//     }

//     System.out.println(max);

//max and min  array 




//sum of all the array 
// int[] numbers = {10,20,30,40,50};

// int sum=0;
// int i;

// sum = sum + numbers[i];

// for(int i=0;i<numbers.length;i++){
// System.out.println(sum);
// }

//sum of all the array 





        




//ARRAY 
        // ArrayList<Integer> list = new ArrayList<>();

    // int[] arr = {110,20,30,40,50};


    // System.out.println( arr[1]=999);

    

//     for(int i= 0;i<arr.length;i++)
//     {
//     // for(int n : arr)
//     System.out.println(arr[i] );
// }

    // System.out.println("length"+arr.length);

    //ARRAY
