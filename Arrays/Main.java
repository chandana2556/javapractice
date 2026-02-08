// <!--📌 Array Topics You Should Cover (In THIS Order)
// 1️⃣ Basics of Arrays
// Declaration
// Initialization
// Traversal (printing)

// 2️⃣ Array Operations (VERY IMPORTANT ⭐)
// Insertion
// Deletion
// Searching (linear search)
// Updating elements

// 3️⃣ Programs on Arrays
// Find max & min
// Reverse an array
// Count even/odd
// Sum & average

// 4️⃣ Logical Problems
// Second largest element
// Remove duplicates
// Frequency count
// --!>

//DECLARATION AND INITIALIZATION
// import java.util.Arrays;
// class Main{
//     public static void main(String [] args){
//         int [] arr = {10,20,30,40,50};
//         for(int i=0 ; i<arr.length;i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }


// //MODIFYING THE ORIGINAL ARRAY
// class Main{
//     public static void main(String[] args) {
//         int [] arr = {10,20,30,40,50,0};
//         int n=5;
//         int pos=2;
//         int element=25;
//         for(int i=n-1;i>=pos;i--){
//             arr[i+1]=arr[i];
//         }
//         arr[pos]=element;
//         n++;
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


//USE A NEW ARRAY
// class Main{
//     public static void main(String[] args) {
//         int [] arr = {10,20,30,40,50};
//         int [] newArr = new int[arr.length+1];
//         int pos=2;
//         int element=25;
//         for(int i=0;i<pos;i++){
//             newArr[i]=arr[i];
//         }
//         newArr[pos]=element;
//         for (int i = pos; i < arr.length; i++) {
//             newArr[i + 1] = arr[i];
//         }
//         for(int i=0;i<newArr.length;i++){
//             System.out.println(newArr[i]);
//         }
//     }
// }



//DELETION IN SAME ARRAY
// class Main{
//     public static void main(String[] args) {
//         int [] arr = {10,20,30,40,50};
//         int n=5;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         int pos=2;
//         for(int i=pos;i<n-1;i++){
//             arr[i]=arr[i+1];
//         }
//         n--;
//         System.out.println("After Deletion");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//DELETION IN NEW ARRAY METHOD
// class Main{
//     public static void main(String[] args) {
//         int [] arr = {10,20,30,40,50};
//         int [] newArr = new int [arr.length-1];
//         int pos=2;
//         for(int i=0;i<pos;i++){
//             newArr[i]=arr[i];
//         }
//         for(int i=pos+1;i<arr.length;i++){
//             newArr[i-1]=arr[i];
//         }
//         for(int i=0;i<newArr.length;i++){
//             System.out.println(newArr[i]);
//         }
//     }
// }

//SEARCHING
// class Main{
//     public static void main(String[] args) {
//         int [] arr={10,20,30,40,50};
//         int k=20;
//         int i;
//         for(i=0;i<arr.length;i++){
//             if(arr[i]==k){
//                 System.out.println("Found");
//                 break;
//             }
//         }
//         if(i==arr.length){
//             System.out.println("Not Found");
//         }
//     }
// }



//UPDATING ELEMENT
// class Main{
//     public static void main(String[] args) {
//         int []arr={10,20,30,40,50};
//         int newValue=25;
//         int index=2;
//         arr[index]=newValue;
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//MIN 
// class Main{
//     public static void main(String[] args) {
//         int []arr={30,20,50,10,40};
//         int max_ele=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(max_ele>=arr[i]){
//                 max_ele=arr[i];
//             }
//         }
//         System.out.println(max_ele);
//     }
// }


//MAX
// class Main{
//     public static void main(String[] args) {
//         int []arr={30,20,50,10,40};
//         int max_ele=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(max_ele<=arr[i]){
//                 max_ele=arr[i];
//             }
//         }
//         System.out.println(max_ele);
//     }
// }


//REVERSE AN ARRAY
// class Main{
//     public static void main(String[] args) {
//         int [] arr={10,20,30,40,50};
//         int left=0;
//         int right=arr.length-1;
//         while(left<right){
//             int temp=arr[right];
//             arr[right]=arr[left];
//             arr[left]=temp;
//             left++;
//             right--;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }
// }


//COUNT EVEN AND ODD
// class Main{
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5};
//         int count=0;
//         int odd_count=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 count++;
//             }else{
//                 odd_count++;
//             }
//         }
//         System.out.println("Even Count "+count);
//         System.out.println("Odd Count "+odd_count);
//     }
// }


//SUM AND AVERAGE
// class Main{
//     public static void main(String[] args) {
//         int [] arr={10,20,30,40,50};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         int average=sum/arr.length;
//         System.out.println(sum);
//         System.out.println(average);
//     }
// }

//Second Largest Element
// class Main{
//     public static void main(String[] args) {
//         int [] arr={10,50,20,40,30};
//         if(arr.length<2){
//             System.out.println("second largest is not possible");
//             return;
//         }
//         int max=Integer.MIN_VALUE;
//         int SecondMax=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 SecondMax=max;
//                 max=arr[i];
//             }else if(arr[i]>SecondMax && arr[i]!=max){
//                 SecondMax=arr[i];
//             }
//         }
//         if(SecondMax==Integer.MIN_VALUE){
//             System.out.println("No second largest element");
//         }else{
//             System.out.println("Second Largest Element "+SecondMax);
//         }
//     }
// }



//REMOVE DUPLICATES
// class Main{
//     public static void main(String[] args) {
//         int [] arr = {10,80,80,30,70,70};
//         int j=0;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]!=arr[j]){
//                 j++;
//                 arr[j]=arr[i];
//             }
//         }
//         for(int i=0;i<=j;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



//FREQUENCY COUNT
// class Main{
//     public static void main(String[] args) {
//         int [] arr={10,20,10,40,20};
//         boolean[] visited = new boolean[arr.length];
//         for(int i=0;i<arr.length;i++){
//             if(visited[i]==true)
//                 continue;
//         int count=1;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]==arr[j]){
//                 count++;
//                 visited[j]=true;
//             }
//         }
//         System.out.println(arr[i]+" occurs "+count+" times ");
//         }      
//     }
// }