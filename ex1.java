public class ex1 {

        int year;
        double rate;
        long  principle;
        
    
        void getamount(int y, double r,   long p)
        {
    
            year=y;
            rate = r;
            principle=p;
        }
        void calculation()
            {
                double interest = year*principle*rate;
                System.out.println(interest);
    
            }
    
            public static void main(String[] args) {
                
                ex1 s= new ex1();
                s.getamount(5,0.05, 100000);
                s.calculation();
            }
        
    
    
    }
