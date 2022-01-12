/*
package 练习题;

public class TreadQian implements Runnable{

    private DoorDemo people;
    public TreadQian(DoorDemo  people) {
        this.people=people;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                if(people<=0){
                    break;
                }else{
                    System.out.println();
                    people--;
                }
            }
        }
    }
}
*/
