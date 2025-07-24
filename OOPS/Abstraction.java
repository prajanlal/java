abstract class Animal {
    public void sleep() {
        System.out.println("Zzz");
    }
}

    // Subclass
    class Cow extends Animal {
        public void animalSound() {
            System.out.println("The cow says: moo moo");
        }
    }
class Goat extends Animal {
    public void goat{
    System.out.println("The goat says: suii");
    }
}
class fox extends Animal {
    public void fox() {
        System.out.println("The fox says: auoo");
    }
}
      // main class
    class  Main{
        public static void main(String[] args) {
            Cow myCow = new Cow();
            myCow.animalSound();
            myCow.sleep();
        }
    }



