// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
   
       // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // long ans=0;
        // for(int i=1;i<n-1;i++){
        //     int lMax=arr[i];
        //     for(int j=i;j>=0;j--){
        //         lMax=Math.max(lMax,arr[j]);
        //     }
        //     int rMax=arr[i];
        //     for(int j=i+1;j<n;j++){
        //         rMax=Math.max(rMax,arr[j]);
        //     }
        //     ans+=Math.min(lMax,rMax)-arr[i];
        // }
        // return ans;
         long res=0;
        // int n=arr.length;
        int []lMax=new int [n];
        int []rMax=new int [n];
         lMax[0]=arr[0];
        for(int i=1;i<n;i++){
            lMax[i]=Math.max(lMax[i-1],arr[i]);
        }
         rMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rMax[i]=Math.max(rMax[i+1],arr[i]);
        }
        for(int i=1;i<n-1;i++){
            res+=(Math.min(lMax[i],rMax[i])-arr[i]);
        }
        
    return res;
    } 
}
    

