public class logic2 {
    public static void main(String[] args){

        // task 1
       /* logic2 ex1 = new logic2();
        System.out.println(ex1.fizzString("fib"));*/

        // task 2
       /* logic2 ex2 = new logic2();
        System.out.println(ex2.inOrder(1,1,2,true));*/

        // task 3
        logic2 ex3 = new logic2();
        System.out.println(ex3.lessBy10(11,1,7));
    }

    public String fizzString(String str){
        if(str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk){
        if(bOk == false){
            if(b > a && c > b){
                return true;
            }
        } else if (bOk == true) {
            if(c > b){
                return true;
            }
        }
        return false;
    }

    public boolean lessBy10(int a, int b, int c){
        if((Math.abs(a-b) >= 10) || (Math.abs(a-c) >= 10) || (Math.abs(b-c) >= 10)){
            return true;
        }
        return false;
    }
}
