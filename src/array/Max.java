package array;

public class Max {
    public static void main(String[] args) {
        int arr[]={1,4,8,5,6,7,4,36,};
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max<arr[i]) {
                max=arr[i];


            }

        }
        System.out.println(max);
    }
}
