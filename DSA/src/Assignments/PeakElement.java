package Assignments;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr = {1,2,1,3,5,6,4};
        int peak=0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                peak=i;
            }
        }

        System.out.println(peak);
	}

}
