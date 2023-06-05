import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> p) 
	{
	
  int n = p.size();
  

  int index = 0;int count  = 0;
  if(n == 1){
	  
	  return p;
  } 


  for(int i = n-2; i>= 0; i--){

      if(p.get(i) < p.get(i + 1)){
          index = i;
		  count = 1;
break;
	  }


  }


if(count == 0){
dosort(p , 0 , n-1);
return p;
	
}

for(int i = n-1; i >= index; i--){

	if(p.get(index) < p.get(i)){
int temp = p.get(index);
p.set(index, p.get(i));
p.set(i, temp);
dosort(p , index + 1 , n-1);
break;


	}
}


return p;


	}

public static void dosort(ArrayList<Integer> p , int start , int end){

while(start <= end){
	int temp = p.get(start);
	p.set(start , p.get(end));
	p.set(end, temp);
	start++;
	end--;
}


}

}
