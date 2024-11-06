public class Main {
    public static void main(String[] args) {
        //shallow copy
//        int[] arr = {1 ,2,3,4};
//        int[] arr1 = arr;
//        arr1[0]=100;
//        arr1[1]=200;
//        System.out.println("shallow copy");
//        for (int i = 0;i< arr.length;i++){
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        System.out.println("original array");
//        for (int i = 0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }





        //deap copy
        int[] arr = {1 ,2,3,4};
        int[] arr1 = arr.clone();
        arr1[0]=100;
        arr1[1]=200;
        System.out.println("deap  copy");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("original array");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }

}