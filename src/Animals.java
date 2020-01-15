package src.src;

public abstract class Animals<weight> {

    public String name;
    public static int weight;


    public Animals(String name) {
        this.name = name;
    }
    public Animals(int weight) {this.weight = weight;}

    public Animals() {

    }

    public void eat() {
        System.out.println("Ом-ном-ном");
    }

    protected abstract void jump();

    public static void getName() {
    }

    public void print() {
    }

    public abstract void scratch();

}
