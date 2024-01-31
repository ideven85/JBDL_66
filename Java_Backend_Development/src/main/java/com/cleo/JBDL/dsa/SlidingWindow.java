package com.cleo.JBDL.dsa;
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        double logk = Math.log(k);
        double[] prefix = new double[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i] + Math.log(nums[i]);
        }

        int ans = 0;
        for (int i = 0; i < prefix.length; i++) {
            int lo = i + 1, hi = prefix.length;
            while (lo < hi) {
                int mi = lo + (hi - lo) / 2;
                if (prefix[mi] < prefix[i] + logk - 1e-9) {
                    lo = mi + 1;
                }
                else hi = mi;
            }
            ans += lo - i - 1;
        }
        return ans;
    }
}
public class SlidingWindow {

    public int findLength (int[] nums, int k) {
        int left = 0;
        int curr = 0; // curr is the current sum of the window
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    /*
    You are given a binary string s (a string containing only "0" and "1").
    You may choose up to one "0" and flip it to a "1".
     What is the length of the longest substring achievable that contains only "1"?
     Logic: window.count("0")<=1..1 because we can flip 0 to 1
     */
    public int findLength (String s) {
        int curr=0,left=0,right=0,answer=0;
        for (right = 0; right < s.length(); right++) {
            if(s.charAt(right)=='1')
                curr++;
            else{
                while(s.charAt(left)!='0'){
                    curr--;
                    left--;
                }
                answer=Math.max(answer,right-left+1);
            }
        }
        return answer;


    }

    public int findLengthLeetCode(String s) {
        // curr is the current number of zeros in the window
        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right)== '0') {
                curr++;
            }

            while (curr > 1) {//window.count<=1
                if (s.charAt(left) == '0') {
                    curr--;
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,answer=0,current_pointer=1;
        for (int right = 0; right < nums.length; right++) {
            current_pointer*=nums[right];
            while(current_pointer>=k){
                current_pointer/=nums[left];
                left++;
            }
            //3 Elements means 3*2=6 subArrays
            int temp=right-left+1;
            answer+=temp;//SubArrays will increase with each iteration
            System.out.println(answer);
        }
        return answer;
    }

    public int findBestSubarray(int[] nums, int k) {

       /* int left=0,answer=0,curr=0;
        for (int i = 0; i < nums.length-k; i++) {
            curr=0;
            for (int j = i; j < i+k; j++) {
                curr+=nums[i];
            }
            left++;
            answer=Math.max(answer,curr);

        }
        return answer;*/
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
        public static void main (String[] args) {
        int[] nums = {10,5,2,6}; int k=100;
        SlidingWindow sl = new SlidingWindow();
        System.out.println(sl.numSubarrayProductLessThanK(nums,k));
    }
}