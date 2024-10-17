import java.util.Arrays;
//swap of 2 arrays
class SwapCall {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println("Before swapping:");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Swap2Arrays.swap(arr1, arr2);
        System.out.println("After swapping:");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        
    }
}
