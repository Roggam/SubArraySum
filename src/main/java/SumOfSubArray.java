public class SumOfSubArray {

    public static long SubArraySum( int arr[])
    {
        long result = 0;


        for (int i=0; i< arr.length; i++)
            result += (arr[i] * (i+1) * (arr.length-i));


        return result ;
    }

}
