import java.util.*;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(5,3,9,4,6);
        Stream<Integer> data = num.stream();
        Stream<Integer> evendata = data.filter(n -> n%2 == 0);
        evendata.forEach( n -> System.out.println(n));
    }
}