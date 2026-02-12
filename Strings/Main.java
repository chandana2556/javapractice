// Basic String Concepts
// String declaration
// Input / Output
// length()
// charAt()
// substring()
// equals() vs ==

// Problems
// Reverse a string
// Check palindrome
// Count vowels & consonants
// Find duplicate characters
// Frequency of characters
// Remove spaces
// Toggle case
// Anagram check



package Strings;
// //DECLARATION
// import java.util.Scanner;
// // class Main{
// //     public static void main(String[] args) {
// //         String name="Chandana";
// //         System.out.println("Name: "+name);
// //     }
// // }


// //INPUT AND OUTPUT
// // class Main{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter your Name: ");
// //         String name = sc.nextLine();
// //         System.out.println("Name: " +name);
// //         sc.close();
// //     }
// // }


// //LENGTH()
// // class Main{
// //     public static void main(String[] args) {
// //         String s="Chandana";
// //         System.out.println(s.length());
// //     }
// // }

// //CHARAT()
// // class Main{
// //     public static void main(String[] args) {
// //         String s="Chandana";
// //         System.out.println(s.charAt(4));
// //     }
// // }


// //Substring
// // class Main{
// //     public static void main(String[] args) {
// //         String s="Chandana";
// //         System.out.println(s.substring(4));
// //     }
// // }


// //substring(startindex,endindex)
// // class Main{
// //     public static void main(String[] args) {
// //         String s="Chandana";
// //         System.out.println(s.substring(0,4));
// //     }
// // }

// //== operator
// // class Main{
// //     public static void main(String[] args) {
// //         String s="Chandana";
// //         String s2="Chandana";
// //         System.out.println(s==s2);
// //     }
// // }


// Reverse string
//  class Main{
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the String: ");
//          String str=sc.nextLine();
//          String reverse="";
//          for(int i=str.length()-1;i>=0;i--){
//              reverse = reverse + str.charAt(i);
//          }
//          System.out.println("Reversed String :"+reverse);
//          sc.close();
//      }
//  } 


//Check Palindrome
//  class Main{
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the String");
//          String str=sc.nextLine();
//            String reverse="";
//          for(int i=str.length()-1;i>=0;i--){
//              reverse=reverse+str.charAt(i);
//          }
//          if(str.equalsIgnoreCase(reverse)){
//              System.out.println("Palindrome");
//          }else{
//              System.out.println("Not Palindrome");
//          }
//          sc.close();
//      }
//  }


// COUNT VOWELS AND CONSONANTS
//  class Main{
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the String");
//          String str = sc.nextLine();
//          int vowels=0;
//          int consonants=0;
//          for(int i=0;i<str.length();i++){
//              char ch = str.charAt(i);
//              if (ch == 'a' || ch == 'e' || ch == 'i' || 
//                  ch == 'o' || ch == 'u' ||
//                  ch == 'A' || ch == 'E' || ch == 'I' || 
//                 ch == 'O' || ch == 'U') {
//                 vowels++;
//             }else{
//                 consonants++;
//             }
//         }
//         System.out.println("vowel count:"+vowels);
//         System.out.println("Consonant:"+consonants);
//         sc.close();
//     }
// }



// //FIND DUPLICATE CHARACTERS
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the String");
//         String str=sc.nextLine();
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(str.charAt(i)==str.charAt(i-1)){
//                 System.out.println("Duplicate character"+str.charAt(i)+"at index"+i);
//             }
//         }
//         sc.close();
//     }
// }



// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String:");
//         String str = sc.nextLine();

//         for (int i = 1; i < str.length(); i++) {

//             if (str.charAt(i) == str.charAt(i - 1)) {
//                 System.out.println(
//                     "Duplicate character '" + str.charAt(i) + "' at index " + i
//                 );
//             }
//         }

//         sc.close();
//     }
// }



// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String:");
//         String str = sc.nextLine();

//         int[] freq = new int[256]; // for all ASCII characters

//         // Count frequency
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             freq[ch]++;
//         }

//         System.out.println("Duplicate characters:");

//         // Print duplicates
//         for (int i = 0; i < 256; i++) {
//             if (freq[i] > 1) {
//                 System.out.println((char) i + " → " + freq[i] + " times");
//             }
//         }

//         sc.close();
//     }
// }


//Find Duplicate Character
//TC :O(n^2)
import java.util.Scanner;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String");
//         String str = sc.nextLine();
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length();j++){
//                 if(str.charAt(i)==str.charAt(j)){
//                     System.out.println(str.charAt(i));
//                     break;
//                 }
//             }
//         }
//         sc.close();
//     }
// }


//FIND DUPLICATE CHARACTERS
//TC:O(N)
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String");
//         String str=sc.nextLine();
//         int []freq=new int[256];
//         for(int i=0;i<str.length();i++){
//             freq[str.charAt(i)]++;
//         }
//         System.out.println("Duplicate Characters");
//         for(int i=0;i<str.length();i++){
//             if(freq[str.charAt(i)]>1){
//                 System.out.println(str.charAt(i));
//                 freq[str.charAt(i)]=0;
//             }
//         }
//         sc.close();
//     }
// }


// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String");
//         String str=sc.nextLine();
//         int []freq=new int[256]; 
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             freq[ch]++;
//         }
//         System.out.println("Character Frequencies: ");
//         for(int i=0;i<str.length();i++){
//             char ch= str.charAt(i);
//             if(freq[ch]!=0){
//                 System.out.println(ch+"->"+freq[ch]);
//                 freq[ch]=0;
//             }
//         }
//         sc.close();
//     }
// }

//Remove Spaces
// class Main{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter String:");
//         String str= sc.nextLine();
//         String result="";
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch!=' '){
//                 result=result+ch;
//             }
//         }
//         System.out.println(result);
//         sc.close();
//     }
// }




//Toggle Case
// class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the String");
//         String str=sc.nextLine();
//         String result="";
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch>='A' && ch<='Z'){
//                 result=result+(char)(ch+32);
//             }else if(ch>='a'&&ch<='z'){
//                 result=result+(char)(ch-32);
//             }else{
//                 result=result+ch;
//             }
//         }
//         System.out.println("After Toggle:"+result);
//         sc.close();
//     }
// }


//Convert Upper Case to Lower Case and Lower to Upper
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String");
//         String str = sc.nextLine();
//         if(str.equals(str.toUpperCase())){
//             System.out.println(str.toLowerCase());
//         }else{
//             System.out.println(str.toUpperCase());
//         }
//         sc.close();
//     }
// }



//Anagram
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String1: ");
//         String str1 = sc.nextLine();
//         System.out.println("Enter String2: ");
//         String str2 = sc.nextLine();
//         str1=str1.replaceAll("\\s+","").toLowerCase();
//         str2=str2.replaceAll("\\s+", "").toLowerCase();
//         if(str1.length()!=str2.length()){
//             System.out.println("not anagram");
//             sc.close();
//             return;
//         }
//         int[] freq=new int[26];
//         for(int i=0;i<str1.length();i++){
//             freq[str1.charAt(i)-'a']++;
//         }
//         for(int i=0;i<str2.length();i++){
//             freq[str2.charAt(i)-'a']--;
//         }
//         for(int i=0;i<26;i++){
//             if(freq[i]!=0){
//                 System.out.println("Not Anagram");
//                 sc.close();
//                 return;
//             }
//         }
//         System.out.println("Anagram");
//         sc.close();
//     }
// }
