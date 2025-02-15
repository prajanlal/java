public class Polymorphism{
    public void sportcar() {
        System.out.println("bmw is a sports car");
    }

    class topengine {
        public void sportcar() {
            System.out.println("bmw is a super sport car");
        }

        class topspeed {
            public void speed() {
                System.out.println("BUGGATI has world record for top speed");
            }
        }
    }
}
