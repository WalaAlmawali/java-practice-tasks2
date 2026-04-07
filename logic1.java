public class logic1 {
    public static void main(String[] args){
        logic1 ex1= new logic1();
       System.out.println(ex1.cigarParty(70,true));

    }
public boolean cigarParty(int cigars, boolean isWeekend){

        if(isWeekend){
            if( cigars >= 40){
                return true;
            }else {
                return false;
            }

        } else if (cigars >= 40 && cigars <= 60) {
            return true;
        }else {
            return false;
        }

}

}
