public class FinalExample1 {
    final int counter;

    public FinalExample1(int counter) {
        this.counter = counter;
        System.out.println(counter);
    }

    private void printCounter() {
        System.out.println(counter);
    }

    //when we declare final variable without initialization it required to
    //declare constructor
    public static void main(String[] args) {

        FinalExample1 finalExample1= new FinalExample1(1);
        finalExample1.printCounter();

        FinalExample1 finalExample2= new FinalExample1(10);
        finalExample2.printCounter();
    }
}
