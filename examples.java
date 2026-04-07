
public class examples {


    public static void main(String[] args) {
      // task 1
        /*int[] nums = {1, 2, 3, 7};
       System.out.println(firstLast6(nums));*/

        // task 2
       /* int[] arr1 = {1, 2, 3, 7};
        int[] arr2 = {1,3};
        examples ex = new examples();
        System.out.println(ex.commonEnd(arr1,arr2));*/

        //task 3
       /* int[] arr = {1, 2, 3};
        examples ex3= new examples();
        ex3.reverse3(arr);
*/
        // task 4
        /*int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};
        examples ex4 = new examples();
        ex4.middleWay(arr1,arr2);*/

        // task 5
       /* int [] arr = {4,2};
        examples ex5 = new examples();
       System.out.println(ex5.no23(arr));

*/
        // task 6
        /*int [] arr = {2,3,5};
        examples ex6 = new examples();
        ex6.fix23(arr);
*/
        // task 7
        /*int [] arr = {1, 2};
        examples ex7 = new examples();
        ex7.makeMiddle(arr);*/

        // task 8
      /*  int [] arr = {1, 2, 3, 4, 5};
        examples ex8 = new examples();
        ex8.midThree(arr);*/

        // task 9
        /*int [] arr = {1, 1, 1};
        examples ex9 = new examples();
        System.out.println(ex9.unlucky1(arr));
*/
        // task 10
       /* int [] arr = {1, 2, 3, 1};
        examples ex10 = new examples();
        System.out.println(ex10.sameFirstLast(arr));
*/
        // task 11
        /*int [] arr = {1, 2, 3};
        examples ex11 = new examples();
        ex11.maxEnd3(arr);
        */
        // task 12
        /*int [] arr = {1, 2, 3};
        examples ex12 = new examples();
        ex12.makeEnds(arr);
*/
        // task 13
        /*int [] arr = {1, 2};
        examples ex13 = new examples();
        ex13.makeLast(arr);
*/
        // task 14
        /*int [] a={7, 2, 3};
        int [] b={1};
        examples ex14 = new examples();
        ex14.start1(a,b);
*/
        // task 15
        /*int [] a={4,4};
        int [] b={2,2};
        examples ex15 = new examples();
        ex15.plusTwo(a,b);
        */
        // task 16
       /* int [] b={1,2,3};
        examples ex16 = new examples();
        ex16.maxTriple(b);
        */

        //task 17
       /* int [] a={1,4};
        int [] b={1, 2, 3};
        examples ex17 = new examples();
        ex17.make2(a,b);*/

        //task 18
        /*examples ex18 = new examples();
        ex18.makePi();*/

        // task 19
      /*  int [] b={1, 2, 3};
        examples ex19 = new examples();
        ex19.rotateLeft3(b);*/

        // task 20
       /* int [] a ={1, 2, 3};
        examples ex20 = new examples();
       ex20.sum2(a);*/

       // task 21
        /*int [] a ={2,5};
        examples ex21 = new examples();
        System.out.println(ex21.has23(a));
        */

        // task 22
       /* int [] a ={2,3};
        examples ex22 = new examples();
        System.out.println(ex22.double23(a)) ;
*/
        // task 23
       /* int [] a ={1,2};
        int [] b ={3,4};
        examples ex23 = new examples();
        ex23.biggerTwo(a,b);*/

        // task 24
     /*   int [] a ={1,2,3,4};

        examples ex24 = new examples();
        ex24.swapEnds(a);
        */
        // task 25
       /* int [] a ={1,2,3};
        examples ex25 = new examples();
        ex25.frontPiece(a);*/

        // task 26
        int [] a ={1,2,3};
        int [] b ={7, 9, 8};
        examples ex26 = new examples();
        ex26.front11(a,b);


    }



    public static boolean firstLast6(int[] nums) {

        if ((nums[0] == 6) || nums[nums.length - 1] == 6) {
            return true;
        }
            return false;

    }
    public  boolean commonEnd(int []arr1,int []arr2){
        if((arr1[0] == arr2[0]) || (arr1[arr1.length -1] == arr2[arr2.length -1])){
            return true;
        }
        return false;
    }

    public void reverse3(int [] arr ){
       int [] newArray = {arr[2],arr[1],arr[0]};
       System.out.println(java.util.Arrays.toString(newArray));

    }
    public void middleWay(int []arr1 , int []arr2){
        int [] newArr = {arr1[1],arr2[1]};
        System.out.println(java.util.Arrays.toString(newArr));
    }
    public boolean no23(int [] arr){

        if (arr[0]==2 || arr[1]==2 || arr[0]==3 || arr[1]==3){
            return false;
        }
        return true;
    }

    public void  fix23(int [] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==2 && arr[i+1]==3){
                arr[i+1] = 0;
            }
        }
        System.out.println(java.util.Arrays.toString(arr));

    }

    public void makeMiddle(int []arr){
        int middle = arr.length /2;
        int [] newArr ={arr[middle -1],arr[middle]};
        System.out.println(java.util.Arrays.toString(newArr));
    }

    public void midThree(int [] arr){
        int middle = arr.length /2;
        int [] newArr ={arr[middle-1],arr[middle ],arr[middle+1]};
        System.out.println(java.util.Arrays.toString(newArr));
    }

    public boolean unlucky1(int [] arr){
        if((arr[0]==1 && arr[1]==3) || (arr[1]==1 && arr[2]==3)){
            return true;
        }
        return false;
    }
public boolean sameFirstLast(int [] arr){
      if((arr.length>= 1)  && (arr[0]==arr[arr.length -1])){
          return true;
      }
      return false;
}

public void maxEnd3(int[] arr){
       int max = Math.max(arr[0],arr[2]);
    for(int i=0; i<arr.length;i++){
        arr[i]= max;
    }
    System.out.println(java.util.Arrays.toString(arr));
}

public void makeEnds(int [] arr){
        if(arr.length>= 1){
            int [] newArr = {arr[0],arr[arr.length-1]};
            System.out.println(java.util.Arrays.toString(newArr));

        }
}

public void makeLast(int[]arr){
        int [] newArray =new int[arr.length * 2];
        newArray[newArray.length-1]= arr[arr.length-1];
    System.out.println(java.util.Arrays.toString(newArray));

}
public void start1(int[]a,int[]b){
        int count = 0;

        if(a[0]==1){
            count++;
        }
        if(b[0]==1){
            count++;
        }
        System.out.println(count);
}

public void plusTwo(int[]a,int[]b){
        if(a.length == 2 && b.length == 2){
            int [] plusArray = {a[0],a[1],b[0],b[1]};
            System.out.println(java.util.Arrays.toString(plusArray));

        }
}

public void maxTriple(int [] arr ){
       if(arr.length>= 1 && arr.length % 2 != 0) {
           int first= arr[0];
           int middle = arr[arr.length /2];
           int last = arr[arr.length-1];

           int max= Math.max(first,Math.max(middle,last));
           System.out.println(max);
       }
}

public void make2(int[]a, int[]b) {
    if (a.length >= 2) {
        int[] newArray ={a[0], a[1]};
        System.out.println(java.util.Arrays.toString(newArray));

    } else if (a.length == 1) {
        int[] newArray = {a[0], b[0]};
        System.out.println(java.util.Arrays.toString(newArray));
    } else {
        int[] newArray = {b[0], b[1]};
        System.out.println(java.util.Arrays.toString(newArray));
    }

}
public void makePi(){
        int[] arr={3,1,4};
    System.out.println(java.util.Arrays.toString(arr));
}

public void rotateLeft3(int [] arr){
        int [] newArr = {arr[1],arr[2],arr[0]};
    System.out.println(java.util.Arrays.toString(newArr));
}

public void sum2(int[] arr){
        if(arr.length>= 2){
            System.out.println( arr[0] + arr[1]) ;
        } else if (arr.length == 1) {
            System.out.println(arr[0]);
        }else{
            System.out.println("0");
        }
}

public boolean has23(int [] arr){
        if(arr.length ==2){
            if(arr[0]==2 || arr[1]==2 || arr[0]==3 || arr[1]==3){
                return true;
            }
        }
     return false;
}

public boolean double23(int[] arr){
    if(arr.length ==2){
        if((arr[0]==2 && arr[1]==2) || (arr[0]==3 && arr[1]==3)){
            return true;
        }

    }
    return false;
}
public void biggerTwo(int[] a,int[] b){
        if(a.length == 2 && b.length == 2 ){
            int aSum = a[0] + a[1];
            int bSum = b[0] + b[1];

            if(aSum>bSum){
                System.out.println(java.util.Arrays.toString(a));
            }else {
                System.out.println(java.util.Arrays.toString(b));
            }
        }
}

public void swapEnds(int[] arr){
        if(arr.length>=1){
            int temp = arr[0];
            arr[0]= arr[arr.length-1];
            arr[arr.length -1]= temp;
            System.out.println(java.util.Arrays.toString(arr));
        }
}

public void frontPiece(int [] arr){
        if(arr.length>= 2){
            int [] newArr ={arr[0],arr[1]};
            System.out.println(java.util.Arrays.toString(newArr));
        } else if (arr.length == 1) {

            int [] newArr ={arr[0]};
            System.out.println(java.util.Arrays.toString(newArr));
        }
}
public void front11(int [] a, int [] b){
        int [] newArray = {a[0],b[0]};
    System.out.println(java.util.Arrays.toString(newArray));
}
}






