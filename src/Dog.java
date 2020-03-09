package src.src;
//Собаки ещё как умеют звуки воспроизводить, если ты понимаешь, о чём я:)
public class Dog extends Animals implements BiteAbility,PlaySound {

    public Dog(String name) {

    }

    public Dog () {

    }

    @Override
    protected void jump() {

    }
//А вот если бы у тебя не было в Animals этого метода, то тебе бы его не пришлось здесь реализовывать.
    // Но собаки тоже могут царапаться

 //   @Override
  //  public void scratch() {

   // }

    @Override
    public void bite() {
        System.out.print("Гав-гав");
    }


    @Override
    public void PlaySounds() {

    }
}
