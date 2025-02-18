import java.util.*;


class SumProductException extends Exception{
    public SumProductException(String s){
        super(s);
    }
}
public class userExcep {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int sum = 0;
        int product = 1;
        for(Integer t : list){
            if(t>0){
                sum+=t;
            }else{
                product*=t;
            }
        }
            if(sum < product){
                System.out.println(product);
            }else{
                try{
                    throw new SumProductException("Sum is greater");
                }catch(Exception e){
                    System.out.println(e);
                }
         
           }
    }
}