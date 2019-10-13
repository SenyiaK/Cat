public class Cat extends Animals implements PlaySound{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    void jump() {
        System.out.println("Прыгать");
    }

    @Override
    public void scratch() {
        System.out.print("Царапать");
    }

    @Override
    public void PlaySounds() {
        System.out.print("Скажи что-нибудь");

    }
}