⭐ Pattern 1 — Fixed Window (foundation)

👉 Window size always = k
👉 Add right, remove left

✅ Must solve

Maximum sum subarray of size k

First negative number in window k

Count distinct elements in window k

Average of subarray size k

Maximum number of vowels in substring k

  1)class Solution {
    public int maxSubarraySum(int[] arr, int k) {
       //ok to solve optimal i can us slidinwinodw tehique 
       
                int n = arr.length;
          int maxSum = Integer.MIN_VALUE;
          
            int currSum =0;
          
             int left =0;
          
           for(int right=0;right<n;right++){
                currSum +=arr[right];
                
                 if(right-left+1==k){
                     maxSum = Math.max(maxSum,currSum);
                     //remove left 
                     currSum -=arr[left];
                     left++;
                 }
           }
          
          return maxSum;
    }

  2)class Solution {
    static List<Integer> firstNegInt(int nums[], int k) {
        // write code here
         int n = nums.length;
         
          List<Integer>res = new ArrayList<>();
          Deque<Integer>dq   = new ArrayDeque<>();
          
           //see first i need to maintian window and add negtive into dq 
           //then check if its empty we add list 0if not we add negtive and we laso ceh
           //when window moves we need to check if netive is there we need or update dq to get next negtives 
           
           int left =0;
           for(int right=0;right<n;right++){
                if(nums[right]<0){
                    dq.add(nums[right]);
                }
                
                //whenw e meetwindow size
                if(right-left+1==k){
                   
                   if(dq.isEmpty()){
                       res.add(0);
                   }else{
                       res.add(dq.peek());
                   }
                   
                   //and cehck left values update 
                   if(nums[left]<0){
                       dq.poll();
                   }
                   left++;
                }
           }
          
        return res;
    }
}
}
