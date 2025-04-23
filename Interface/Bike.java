public  class Bike implements Vehicle {
    public void Start(){
        System.out.print("Kawasaki has stated");
     
                }
                public static void Speed(){
                    System.out.print("The speed has limited to 100kmph");
                }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet.");
      }
    }   