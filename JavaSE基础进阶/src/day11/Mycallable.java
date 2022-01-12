package day11;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("表白了"+i);
        }
        return "答应";
    }
}
