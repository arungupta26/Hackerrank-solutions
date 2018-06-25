import io.reactivex.Observable;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) {

       fakeUserInput()
                .subscribe(line -> System.out.println(line));


    }


    public static Observable<Integer> fakeUserInput() {
        return  Observable.intervalRange(1,20,500,56, TimeUnit.MILLISECONDS)
                .map(number-> new Random().nextInt(100))
                ;
    }
}
