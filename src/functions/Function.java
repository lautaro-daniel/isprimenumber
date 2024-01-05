package functions;

import java.util.List;

public class Function {

    public boolean isPrimeNumber(int number){
        return number%2==0;
    }

    public void primeNumbers(){
        for (int index = 1; index <= 100; index++){
            if (index % 2 == 0){
                System.out.println(index);
            }
        }
    }
}
