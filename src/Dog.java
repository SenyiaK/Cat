package src.src;

public class Dog extends Animals implements Bite {

    public Dog(String name) {  super(name);    }

    public Dog () { super();  }

    @Override
    protected void jump() {

    }

    @Override
    public void scratch() {

    }

    @Override
    public void Bite() {
        System.out.print("Гав-гав");
    }

}
