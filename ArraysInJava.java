public class ArraysInJava {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        String[] names = new String[6];

        int[] nums = {1,34,5,6,7,5,4};
        String[] namis = {"asd", "aasd","ewsd"};
        for(int i = 0;i<nums.length; i++){
            System.out.println("nums["+i+"] -> "+nums[i]);
        }
    }
}
