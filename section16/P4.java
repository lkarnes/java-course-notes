public class P4 {
    public static void main(String[] args){
       double balance, rate;
       int years = 0;
       balance = 15000;
       rate = 1.07;
    //    while(balance < 1000000){
    //        balance *= rate;
    //         ++years;
    //    } 
    do {
        balance *= rate;
        ++years;
    }while(balance < 100000);
       System.out.print(years);
    }
}
