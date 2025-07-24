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
    public void eats() {
    System.out.println("The goat ats: grass");
    }
}
class fox extends Animal {
    public void foxSound() {
        System.out.println("The fox says: auoo");
    }
}
      
    class  Main{
        public static void main(String[] args) {
            Cow myCow = new Cow();
            myCow.animalSound();
            myCow.sleep();
            
            Goat mygoat = new Goat();
            mygoat.goateats();
            mygoat.sleep();
            
            Fox myfox = new Fox();
            myfox.foxSound();
            myfox.sleep();
        }
    }



