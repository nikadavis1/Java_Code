package Job_Prac;

import java.util.Arrays;
import java.lang.*;

public class Job_interview_question {
	
	 public static int[] plusOne(int[] digits) {
	        int tem;
	        int currentSize=digits.length;
	        int newSize=digits.length+1;         //plus one size for of the digits 
	        int [] newArray= new int[newSize];  //new array with the added element 
	        
	        
	        tem=digits[digits.length-1]+1;      //add 1 to the last element 
	        digits[digits.length-1]=tem;
	       
	        if(digits[digits.length-1]<9){       //if digit is less than 9 than return digit
	            return digits;
	         }
	        else if( digits[digits.length-1]>9 && digits.length>1){    //check to see if last digit is greater than 9
	                digits[digits.length-1]=0;                        //turn the last digit into 0
	                for(int i=digits.length-2;i<digits.length;i--){
	                    if((digits[i]+1)<=9){                //check to see if digit is less than 9
	                        digits[i]=digits[i]+1;           //add 1 to the digit 
	                        return digits;
	                    }
	                    else if(digits[i]+1>9){          //check is current digit is greater than 9
	                        if(i>0){                     //if the digit isn't in the furthest left position
	                            digits[i]=0;             //than replace the digit with 0
	                        }
	                        else if(i==0){                //check if the current digit is in the furthest left position
	                            if((digits[i]+1)<9){      //if current digit is less than 9 than add 1 and return digit
	                                digits[i]=digits[i]+1;
	                                return digits;
	                            }
	                            else if((digits[i]+1)>9){           //check if current digit is greater than 9
	                                for(int x=0;x<currentSize;x++){ //copy digit array to to new array
	                                    newArray[x]=digits[x];
	                                }
	                                newArray[newSize-1]=0;   //added 0 to the end of the digit
	                                newArray[0]=1;
	                                return newArray;
	                            }
	                        }
	                            
	                    }
	            
	                
	            }
	       }
	           else {                     //if a digit is a  9
	        	                          //put a 1 0 in the new Array and return it
                   newArray[newSize-1]=0;
                   newArray[0]=1;
                   return newArray; 
	           }
	    
	        return digits;
	        
	    }
	
	
	
	 public static int lengthOfLastWord(String s) {
	        String [] split = s.split(" ");              //Split up the string by the spaces between words 
	        if(split.length==0){                         //checks to see if the string has no words
	            System.out.println("no word");
	            return 0;
	        }
	        String result = split[split.length-1];      //Place the last word in the result varible
	        return result.length();                     //returns the sizes of the last word
	        
	    }
	
	
	public static int findDist(int [] num) {
		int [] res_Array=new int[num.length-1]; //Array holds the subtration results
		int res=0,j=0;
		
		Arrays.sort(num); //Java method to sort arrays
		
		
		for(int i =0; i<num.length-1;i++) {
			res_Array[i]=num[i]-num[i+1];          //subtract the elements in array and put the solution in the result array
			if(res_Array[i]<0)                    //in the current element is less then the element b
				res_Array[i]=res_Array[i]*-1;     //mutiply the result by -1 to make it an positive number than place the result in the 
		}                                        //result array
		
		Arrays.sort(res_Array);                  //sort the result to least  to greatness
		
		return res_Array[0];                     //return the shortest distance      
	}
	
	
	
	
	public static int maxSubArray(int[] nums) {
	       int res = 0,j=0;                         //set the result varible to 0 and the j counter to 0
	       int maybe = 0;                           //maybe is the answer that might be largest sum
	       int[] max_subArr=new int[nums.length];   //this array will have the subarray with the maximum sum
	        
	        for (int i=0;i<nums.length-1;i++){
	        		maybe = nums[i]+nums[i+1]+maybe;   // add two numbers in the nums array and set the result to maybe
	                if(maybe > res)                   //check if maybe is greater than res
	                {
	                	max_subArr[j]=nums[i];        //put the elements in nums into the max subarray 
	                    res = max_subArr[j]+res;     //add the elements in max subarray
	                    //System.out.println(max_subArr[j]);
	                    j++;
	                                                 //increment counter
	                }
	        }
	        
	    return res;
	    
	    }
	 public static void main(String [] args) {
		 int [] nums = new int [] {3,70,50,15,98,7,122,65};
		 int [] nums2 = new int [] {9};
		 int [] nums3;
		 int result1,result2,result3;
		 nums3=plusOne(nums2);
		 //String word="Nika is in need of a job";
		 /*result1=maxSubArray(nums); //call function
		 result2=findDist(nums);
		 result3=lengthOfLastWord(word);
		 //System.out.println(result1);
		 System.out.println(result2);
		 System.out.println(result3);*/
		 for(int i=0;i<nums3.length;i++) {
			 System.out.println(nums3[i]);
		 }
		 
	 }
}
