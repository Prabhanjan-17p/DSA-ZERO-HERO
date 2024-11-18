public class Comparssion {
     public static void main(String[] args) {
         String name3 = "kaanha";
         String name4 =  "kaanha";
         String name5 = name3;
         System.out.println(name5==name4); // it check the value and datatype
         System.out.println(name3.equals(name5));
         // in the above case name3, name4 are creating 1 same object in heap , inside the String pool

         String name1 = new String("kaanha");
         String name2 =  new String("kaanha");
         System.out.println(name1==name2);
         // in the above case name1, name2 are creating 2 different object in heap but out side the String pool

//         Note -- When you need to check only the value then you used .equals() method
     }
}
