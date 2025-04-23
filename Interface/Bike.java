public  class Bike implements Vehicle {
    String Brand;
    String Model;
    String SpeedLimit;
    String MadeIn;
          
          public void setBrand(String Brand){
            this.Brand = Brand;

          }
          public String getBrand(){
            return Brand;
          }
          public void setModel(String Model){
            this.Model = Model;
          }
          public String getModel(){
            return Model;
          }
          public void setSpeedLimit(String SpeedLimit){
            this.SpeedLimit = SpeedLimit;
          }
          public String getSpeedLimit(){
            return SpeedLimit;
          }
          public void setMadeIn(String MadeIn){
             this.MadeIn = MadeIn;
          }
          public String getMadeIn(){
            return MadeIn;
          }


    public void Start(){
        System.out.print("Kawasaki has stated");
     
                }
                public static void Speed(){
                    System.out.print("The speed has limited to 100kmph");
                }
                public Bike(String brand,String BikeModel,String limit,String Country){
                    this.Brand = brand;
                    this.Model = BikeModel;
                    this.SpeedLimit = limit;
                    this.MadeIn = Country;
                }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet.");
      }
      
    }   