class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int arr[] = new int[3];
        
        for(int i = 0; i < n;i++){
            
            if(nums[i] == 0){
                arr[0] = arr[0] + 1;
            }else if(nums[i] == 1){
                
                arr[1] = arr[1] + 1;
            }else{
                
                
                arr[2] = arr[2] + 1;
            }
            
            
        }
        
        int k = 0;
        
        for(int i = 0; i <= 2; i++){
            
            int value = arr[i];
        
            while(value > 0){
                
                nums[k] = i;
                k++;
                value--;
            }
            
            
            
        }
        
        
        
        
        
        
    }
}