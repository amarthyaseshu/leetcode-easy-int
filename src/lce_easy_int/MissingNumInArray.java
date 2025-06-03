package lce_easy_int;

public class MissingNumInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};

        for (int i = 1; i <= arr.length ; i++) {
            if(arr[i-1]!=i){
                System.out.println(i);
                break;
            }
        }
    }
}
