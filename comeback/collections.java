package comeback;
import java.util.*;
// public class collections{
//         public static void main(String[] args){
//             ArrayList<Integer> list = new ArrayList<>();
//             list.add(5);
//             list.add(15);
//             list.add(25);
//             list.add(35);
//             System.out.println("List: " +list);
//             list.remove(Integer.valueOf(25));
//             System.out.println("Updated List: "+list);
//         }
// }


//Hashset
// public class collections{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,2};
//         HashSet<Integer>set=new HashSet<>();
//         for(int num:arr){
//             set.add(num);
//         }
//         System.out.println("Unique Elements Count="+set.size());
//         System.out.println("unique elements"+set);
//     }
// }

//HashMap
// public class collections{
//     public static void main(String [] args){
//         HashMap<String,Integer> map = new HashMap<>();
//         map.put("Chandana", 95);
//         map.put("Charan", 85);
//         map.put("Dhakshitha", 96);
//         System.out.println(map);
//         System.out.println("Marks of chandana"+map.get("Chandana"));
//         System.out.println("key :"+map.keySet());
//         System.out.println("Values: "+map.values());
//     }
// }


//problem in hashmap
// public class collections{
//     public static void main(String[] args) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int arr[]={1,1,2,2,3,3,3,4,4};
//         for(int num:arr){
//             if(map.containsKey(num)){
//                 map.put(num,map.get(num)+1);
//             }else{
//                 map.put(num,1);
//             }
//         }
//         for(int key : map.keySet()){
//             System.out.println(key + " -> " + map.get(key));
//         }
//     }
// }


//Stack
// class collections{
//     public static void main(String[] args) {
//         Stack<Integer>stack = new Stack<>();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         stack.push(40);
//         stack.push(50);
//         System.out.println(stack);
//         System.out.println("Top Element: "+stack.peek());
//         stack.pop();
//         System.out.println("after pop"+stack);
//     }
// }


//Queue
// public class collections{
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         System.out.println(q);
//         System.out.println("Front"+q.peek());
//         q.remove();
//         System.out.println("After remove: "+q);
//     }
// }


//1.Insert elements and print
// public class collections{
//     public static void main(String [] args){
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(10);
//         arr.add(20);
//         arr.add(30);
//         arr.add(40);
//         System.out.println(arr);
//     }
// }

//Reverse an ArrayList
// public class collections{
//     public static void main(String[] args){
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(10);
//         arr.add(20);
//         arr.add(30);
//         arr.add(40);
//         System.out.println("Original Array"+arr);
//         int i=0;
//         int j=arr.size()-1;
//         while(i<j){
//             int temp = arr.get(i);
//             arr.set(i,arr.get(j));
//             arr.set(j, temp);
//             i++;
//             j--;
//         }
//         System.out.println("Reversed list:"+arr);
//     }
// }

//using built in function
// public class collections{
//     public static void main(String[] args){
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(10);
//         arr.add(20);
//         arr.add(30);
//         arr.add(40);
//         System.out.println("Original Array"+arr);
//         Collections.reverse(arr);
//         System.out.println("Reversed list:"+arr);
//     }
// }


//using new Array
// public class collections{
//     public static void main(){
        // ArrayList<Integer>arr=new ArrayList<>();
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // arr.add(40);
//         System.out.println("Original Array"+arr);
//         ArrayList<Integer>vc = new ArrayList<>();
//         for(int i=arr.size()-1;i>=0;i--){
//             vc.add(arr.get(i));
//         }
//         System.out.println(vc);
//     }
// }


//using stack
// public class collections{
//     public static void main(String[] args) {
//         ArrayList<Integer>arr=new ArrayList<>();
//         arr.add(10);
//         arr.add(20);
//         arr.add(30);
//         arr.add(40);
//         Stack<Integer>stack=new Stack<>();
//         for(int num:arr){
//             stack.push(num);
//         }
//         ArrayList<Integer>vc=new ArrayList<>();
//         while(!stack.isEmpty()){
//             vc.add(stack.pop());
//         }
//         System.out.println(vc);
//     }
// }


//Remove even numbers from the array
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer>arr=new ArrayList<>();
                // arr.add(10);
                // arr.add(21);
                // arr.add(30);
                // arr.add(47);
                // System.out.println("original array:"+arr);
//                 Iterator<Integer>it = arr.iterator();
//                 while(it.hasNext()){
//                         int num = it.next();
//                         if(num%2==0){
//                                 it.remove();
//                         }
//                 }
//                 System.out.println("After removing evens"+arr);
//         }
// }

//Min Max
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer>arr=new ArrayList<>();
//                 arr.add(10);
//                 arr.add(21);
//                 arr.add(30);
//                 arr.add(47);
//                 arr.add(12);
//                 System.out.println("original array:"+arr);
//                 int max_ele=arr.get(0);
//                 int min_ele=arr.get(0);
//                 for(int i=1;i<arr.size();i++){
//                         if(arr.get(i)>max_ele){
//                                 max_ele=arr.get(i);
//                         }
//                         if(arr.get(i)<min_ele){
//                                 min_ele=arr.get(i);
//                         }
//                 }
//                 System.out.println("Maximum Element:"+max_ele);
//                 System.out.println("Minimum Element:"+min_ele);

//         }
// }


//second largest element
// public class collections{
//         public static void main(String[] args) {
                // ArrayList<Integer> arr = new ArrayList<>();
                // arr.add(10);
                // arr.add(36);
                // arr.add(23);
                // arr.add(15);
                // arr.add(98);
                // System.out.println("original array"+arr);
//                 int largest=Integer.MIN_VALUE;
//                 int secondlargest=Integer.MIN_VALUE;
//                 for(int num : arr){
//                         if(num>largest){
//                                 secondlargest=largest;
//                                 largest=num;
//                         }else if(num>secondlargest && num!=largest){
//                                 secondlargest=num;
//                         }
//                 }
//                 System.out.println("Second Largest: "+secondlargest);
//         }
// }

//Remove Duplicates
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer> arr = new ArrayList<>();
//                 arr.add(10);
//                 arr.add(36);
//                 arr.add(23);
//                 arr.add(15);
//                 arr.add(98);
//                 System.out.println("original array"+arr);  
//                 int j=1;
//                 for(int i=0;i<arr.size();i++){
//                         if(arr.get(i)!=arr.get(j)){
//                                 arr.next();
//                         }
//                 }
//                 System.out.println("Removed duplicates"+arr);
//         }
// }


//remove duplicates 
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer> arr = new ArrayList<>();
//                 arr.add(10);
//                 arr.add(36);
//                 arr.add(23);
//                 arr.add(15);
//                 arr.add(36);
//                 arr.add(10);
//                 System.out.println("original array"+arr); 
//                 ArrayList<Integer>result = new ArrayList<>();
//                 for(int i=0;i<arr.size();i++){
//                         boolean isDuplicate=false;
//                         for(int j=0;j<i;j++){
//                                 if(arr.get(i).equals(arr.get(j))){
//                                         isDuplicate=true;
//                                         break;
//                                 }       
//                         }
//                         if(!isDuplicate){
//                                 result.add(arr.get(i));
//                         }
//                 }
//                 System.out.println("After removing duplicates: "+result);
//         }
// }

//remove duplicates using hashset
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer> arr = new ArrayList<>();
//                 arr.add(10);
//                 arr.add(36);
//                 arr.add(23);
//                 arr.add(15);
//                 arr.add(36);
//                 arr.add(10);
//                 System.out.println("Original Array:"+arr);
//                 HashSet<Integer>set=new HashSet<>(arr);
//                 arr = new ArrayList<>(set);
//                 System.out.println("After removing duplicates "+arr);
//         }
// }

//remove duplicates using sorting
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer> arr = new ArrayList<>();
//                 arr.add(10);
//                 arr.add(36);
//                 arr.add(23);
//                 arr.add(15);
//                 arr.add(36);
//                 arr.add(10); 
//                 System.out.println("original array:"+arr);
//                 Collections.sort(arr);
//                 ArrayList<Integer> result = new ArrayList<>();
//                 for(int i=1;i<arr.size();i++){
//                         if(!arr.get(i).equals(arr.get(i-1))){
//                                 result.add(arr.get(i));
//                         }
//                 }
//                 System.out.println("After removing duplicates"+result);
//         }
// }


//Merge Two Lists
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer> list1 = new ArrayList<>();
//                 list1.add(10);
//                 list1.add(20);
//                 list1.add(30);
//                 System.out.println("list1: "+list1);
//                 ArrayList<Integer> list2 = new ArrayList<>();                
//                 list2.add(40);
//                 list2.add(50);
//                 list2.add(60);
//                 System.out.println("list2: "+list2);
//                 list1.addAll(list2);
//                 System.out.println(list1);
//         }
// }


// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer> list1 = new ArrayList<>();
//                 list1.add(10);
//                 list1.add(20);
//                 list1.add(30);
//                 System.out.println("list1: "+list1);
//                 ArrayList<Integer> list2 = new ArrayList<>();                
//                 list2.add(40);
//                 list2.add(50);
//                 list2.add(60);
//                 System.out.println("list2: "+list2);
//                 ArrayList<Integer> result = new ArrayList<>();
//                 for(int num: list1){
//                         result.add(num);
//                 }
//                 for(int num: list2){
//                         result.add(num);
//                 }
//                 System.out.println("Merges List"+result);
//         }
// }


//check if list is sorted
// public class collections{
//         public static void main(String[] args) {
//                 ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,56,40));
//                 boolean isSorted=true;
//                 for(int i=0;i<arr.size()-1;i++){
//                         if(arr.get(i)>arr.get(i+1)){
//                                 isSorted=false;
//                                 break;
//                         }
//                 }
//                 if(isSorted){
//                         System.out.println("Array is sorted!" );
//                 }else{
//                         System.out.println("Array is not sorted!");
//                 }       
//         }
// }


//Convert Array → ArrayList
// public class collections{
//         public static void main(String[] args) {
//                 int arr[] = {10,20,30,40,50};
//                 System.out.println("Array: "+arr);
//                 ArrayList<Integer> list = new ArrayList<>();
//                 for(int num: arr){
//                         list.add(num);
//                 }
//                 System.out.println(list);
//         }
// }