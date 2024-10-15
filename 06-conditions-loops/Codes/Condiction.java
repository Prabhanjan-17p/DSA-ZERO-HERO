public class Condiction {
    public static void main(String[] args) {
        /*
        Syntax of the if else condition
        if(Boolean expression True or False){
            //Body
        }else{
            //Body
        }
         */

        int salary = 233200;
//        if (salary > 10000){
//            salary = salary+2000;
//        } else {
//            salary = salary+1000;
//        }
//        System.out.println(salary);


        //Multiple if-else statement
        if (salary > 500000){
            salary =salary+5000;
        } else if (salary > 10000) {
            salary = salary+3000;
        } else {
            salary = salary+1000;
        }
        System.out.println(salary);
    }
}
