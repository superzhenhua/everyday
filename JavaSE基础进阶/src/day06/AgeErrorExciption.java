package day06;

public class AgeErrorExciption extends RuntimeException{
    public AgeErrorExciption() {
    }

    public AgeErrorExciption(String message) {
        super(message);
    }
}
