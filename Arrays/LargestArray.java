public class LargestArray{
    public static void main(String[] args){
        int a[]={3,8,2,10,5};
         int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
        }
        System.out.println("Largest Number:"+largest);
    }
}