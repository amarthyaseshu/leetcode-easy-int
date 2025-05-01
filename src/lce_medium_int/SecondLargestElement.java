package lce_medium_int;

//Given an array of positive integers arr[], return the second largest element from the array.
//If the second largest element doesn't exist then return -1.
//Note: The second largest element should not be equal to the largest element.

//Input: arr[] = [12, 35, 1, 10, 34, 1]

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr={13,13,12,10,1,91,91,83,24,24,93,92};

        int firstLargest=arr[0];
        int secondLargest=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }else if(arr[i]!=firstLargest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
