public class Duplicate{
        public static void main(String[] args){
        int a[]={3,6,6,1,3,1,2,2};
        
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
        System.out.println();
        for(int i=0;i<a.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(a[i]==a[j]){
                    break;
                }
            }
            if(j==i){
                System.out.print(a[i]);
            }
            System.out.println();
        }

       
   }
}