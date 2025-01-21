/*
    Newton Raison Method
        root = (X)+(N/X)/2  (where X is the imagine root and Root is the actual root)
        1- Assign X to N
        2- Loop running
        3- Update the value of X = Root
 */


public class NewtonRapsonMethod {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static  double sqrt(double n){
        double X = n;
        double root;
        while (true){
            root= 0.5 *(X + (n/X));

            if (Math.abs(root-X) < 1){
                break;
            }
            X = root;
        }
        return root;
    }
}
