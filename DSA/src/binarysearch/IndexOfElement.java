package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfElement {

	public static void main(String[] args) {
		int []nums= {5,7,7,7,7,8,8,10};
		int target=8;
        int []ans = searchRange(nums,target);
		System.out.println(Arrays.toString(ans));
		}
	
	
	public static int[] searchRange(int[] nums,int target) {
		int []ans= {-1,-1};
		ans[0]=search(nums, target, true);
		ans[1]=search(nums, target, false);
		return ans;
	}


	public static int search(int[] nums,int target,boolean firstStartIndex) {
		int start = 0;
		int end = nums.length;
		int mid=0;
		int ans=-1;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(target<nums[mid]) {
				end=mid-1;
			}
			else if(target>nums[mid]) {
				start=mid+1;
			}
			else {
				ans = mid;
				if(firstStartIndex) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return ans;
	}

	}

