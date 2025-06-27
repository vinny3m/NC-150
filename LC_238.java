
public class LC_238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = productExceptSelf(nums1);
        printArray(result1); 

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = productExceptSelf(nums2);
        printArray(result2); 
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
