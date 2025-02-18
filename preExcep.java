import java.util.*;

class preExcep {
    public static void main(String[] args) {
        int i=9;
        int j=0;
        int k=0;
        try{
            k=i/j;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(k);
        }
}