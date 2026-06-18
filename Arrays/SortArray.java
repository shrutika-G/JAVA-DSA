public class SortArray{
    public static void main(String[] args){
        int a[]={3,5,2,6,1};
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
             System.out.print(a[i]);
             
        }
        System.out.println(a.length);
        boolean isSorted=true;
        for(int i=0;i<a.length-1;i++){
             if(a[i]>a[i+1]){
                isSorted=false;
             }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

       
   }
}