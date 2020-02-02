package src.src;
public class Cat extends Animals implements PlaySound, AbilityToScratch {


   public Cat(String name) {


    // this.name = name;
    }

    public Cat() {

    }


    @Override
    public  void jump() {
        System.out.println("Прыгать");
    }

    @Override
    public void scratch() {
        System.out.print("Царапать");
    }

    @Override
    public void PlaySounds() {
        System.out.print("Мяу-мяу");

    }
}
