import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        
        
        for(int i = 0; i < n; i++ ){
            
            for(int j = 0; j < m; j++){
                
                if(matrix[i][j] == 0){
                    
                    row.add(i);
                    col.add(j);
                }
                
                
                
            }
        }
        
       
    Iterator it1 = row.iterator();
        Iterator it2 = col.iterator();
        
        
        while(it1.hasNext()){
            
            int rows = (int)it1.next();
            
            for(int i = 0; i < m; i++){
                
                matrix[rows][i] = 0;
            }
            
        }
        
        
        
           while(it2.hasNext()){
            
            int cols = (int)it2.next();
            
            for(int i = 0; i < n; i++){
                
                matrix[i][cols] = 0;
            }
            
        }
        
        
    }
}