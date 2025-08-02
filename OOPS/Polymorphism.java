public class Polymorphism{
    public void sportcar() {
        System.out.println("bmw is a sports car that is very cool nd fast like a king fpr all them");
    }

    class topengine {
        public void sportcar() {
            System.out.println("bmw is a super sport car thas has a top engine on the planet");
        }

        class topspeed {
            public void speed() {
                System.out.println("BUGGATI has world record for top speed on the planet better than bmw");
            }
        class petrolVariend {
            String fuelType;
            public void petrol() {
                System.out.println("petrol is a fuel"+fuelType+ "that is used in light vehicless");
            }
        }
        class dieselVariand {
            String fuelTpe;
           public void diesel() {
            System.out.println("Diesel is a fuel that is used in heavy vehicles");
           }
        }
        }
    }
}
