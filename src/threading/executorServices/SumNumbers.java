package threading.executorServices;

import java.util.concurrent.Callable;

public class SumNumbers implements Callable {

    int input;
    int sum = 0;
    public SumNumbers(){ }

    public SumNumbers(int input){
        this.input = input;
    }

    @Override
    public Object call() throws Exception {
        for (int i = 0; i<input; i++){
            sum = sum+i;
//            System.out.println(" Sum " + sum);
        }
        return sum;
    }
}
