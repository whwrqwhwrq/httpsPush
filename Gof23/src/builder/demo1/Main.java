package builder.demo1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Computer computer = director.build(new Worker());


    }
}
