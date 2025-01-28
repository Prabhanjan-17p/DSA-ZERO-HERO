import java.util.ArrayList;

public class Linear_Search_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6};
        int tar = 6;
        System.out.println(find(arr,tar,0));
        System.out.println(find2(arr,tar,0));
        System.out.println(find2Last(arr,tar,arr.length-1));
        findAllIndex(arr,tar,0);
        System.out.println(list);
        System.out.println(findAllIndexUseArrayList(arr,6,0,new ArrayList<>()));//also
        ArrayList<Integer> ans = findAllIndexUseArrayList(arr,6,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(findAllIndexUseArrayList2(arr,6,0));
    }
    static boolean find(int[] arr,int tar,int in){
        if (in == arr.length-1){
            return false;
        }

        return arr[in] == tar || (find(arr,tar,in+1));
    }
    static int find2(int[] arr,int tar,int in){
        if (in == arr.length){
            return -1;
        }
        if (arr[in] == tar){
            return in+1;
        }
        else {
            return find2(arr,tar,in+1);
        }
    }
    static int find2Last(int[] arr,int tar,int in){
        if (in == -1){
            return -1;
        }
        if (arr[in] == tar){
            return in+1;
        }
        else {
            return find2(arr,tar,in-1);
        }
    }

    static  ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int tar,int in){
        if (in == arr.length){
            return ;
        }
        if (arr[in] == tar){
            list.add(in);
        }
        findAllIndex(arr,tar,in+1);
    }

    //Note -- When return a list in recursion the object are same ,so that the stored in same list
    static ArrayList<Integer> findAllIndexUseArrayList(int[] arr,int tar,int in,ArrayList<Integer> list ){
        if (in == arr.length){
            return list;
        }
        if (arr[in] == tar){
            list.add(in);
        }

       return findAllIndexUseArrayList(arr,tar,in+1,list); //in List are different reference variable but same object
    }

    static ArrayList<Integer> findAllIndexUseArrayList2(int[] arr,int tar,int in){
        ArrayList<Integer> list = new ArrayList<>();
        if (in == arr.length){
            return list;
        }
        //This will contain the answer for that function only
        if (arr[in] == tar){
            list.add(in);
        }


        ArrayList<Integer> ansFromBellowCalls = findAllIndexUseArrayList2(arr,tar,in+1);

        list.addAll(ansFromBellowCalls); // This line run when recursion is over

        return list;
    }
}
