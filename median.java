public class median {
public static void main(String[] args) {                 //median when array list is already sorted
    int list[] = {1,2,3,4,5,6,7,8,9,10};
     int median=list.length/2;
     if(list.length%2!=0){
System.out.println(list[median]);
     }else{float evenmedian =list[median] + list[median-1];
         System.out.println(evenmedian/2);
     }

}}
