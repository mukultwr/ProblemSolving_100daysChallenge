// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        int maximum_sum=kadane(a,n);
        if(maximum_sum<0){
            return maximum_sum;
        }
        int a_sum=0;
        for(int i=0;i<n;i++){
            a_sum+=a[i];
            a[i]=-a[i];
        }
        int max_circular=a_sum+kadane(a,n);
        return Math.max(max_circular,maximum_sum);
         }
    static int kadane(int a[],int n){
        int curSum=a[0];
        int res=a[0];
        for(int i=1;i<n;i++){
            curSum=Math.max(curSum+a[i],a[i]);
            res=Math.max(res,curSum);
        }
        return res;
    }
}

