public class SecondLargest{
    public static void main(String[] args){
        int a[]={2,5,3,7,8};
        int largest=a[0];
        int secondLargest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }
        }
        System.out.println(secondLargest);
    }
}