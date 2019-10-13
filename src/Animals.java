public abstract class Animals {

    public String name;

    public Animals(String name) {
        this.name = name;
    }

    public Animals() {

    }

    public void eat() {
        System.out.println("Ом-ном-ном");
    }

    abstract void jump();

    public void getName() {
    }

    public void print() {
    }

    public abstract void scratch();
}