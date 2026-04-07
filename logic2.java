public class logic2 {
    public static void main(String[] args){

        // task 1
        logic2 ex1 = new logic2();
        System.out.println(ex1.fizzString("fib"));

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
}
