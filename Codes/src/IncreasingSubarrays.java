
public class IncreasingSubarrays {
	public static void main(String hg[]){
     int arr[]={1,2,3,4,5,6};
     int count=0;
     boolean flag=true;
     for (int i=0; i<arr.length; i++)
     {
         // Pick ending point
         for (int j=i+1; j<arr.length; j++)
         {
             if (arr[j] > arr[j-1])
                 count++;
  
             else
                 break;
         }
     }
     System.out.println(count);
	}
}
