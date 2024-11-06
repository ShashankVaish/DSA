public class question {
    static void countoccurence(int[] arr){
        int index=0;
        for (int i=0;i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=index--;
                }
            }
            for (int j = i;j< arr.length;j++){
                int count=0;
                if (arr[j]==index){
                    count++;
                    System.out.println("number is "+arr[i]+" count "+count);
                }
                else{
                    
                    System.out.println("number is"+arr[i]+"count 1");
                }
            }


        }



    }
    public static void main(String[] args) {
        int[] l1 = {1,1,2,3,4,5,6,5};
        countoccurence(l1);

    }
}
