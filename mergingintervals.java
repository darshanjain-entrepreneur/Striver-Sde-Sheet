import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
       
         if(intervals.length == 1){
             List<Interval> ans = new ArrayList<>();
             ans.add(new Interval(intervals[0].start , intervals[0].finish));
            return ans;
        }
      int n = intervals.length;
        
        
      Arrays.sort(intervals , (i1 , i2) -> Integer.compare(i1.start , i2.start));
        
        
        for(int i = 1; i < intervals.length; i++){
            
            if(intervals[i].start <= intervals[i-1].finish){
                
                intervals[i].start = Math.min(intervals[i-1].start , intervals[i].start);
                intervals[i].finish = Math.max(intervals[i].finish , intervals[i-1].finish);
                
                intervals[i-1].start = -1;
                intervals[i-1].finish = -1;
                
                n = n-1;
            }else{
                
                
                
            }
            
            
            
            
        }
       
        
        List<Interval> ans = new ArrayList<>();
       
        
        for(int i = 0; i < intervals.length; i++){
            
            if(intervals[i].start !=-1){
                ans.add(new Interval(intervals[i].start , intervals[i].finish));
              
                
            }
        }
        
        
        
        return ans;


    }
}