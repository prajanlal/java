public  class Bike  {

  private  String Brand;
  private  String Model;
  private  String SpeedLimit;
  private String MadeIn;
          
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

                public Bike(String brand,String BikeModel,String limit,String Country){
                    this.Brand = brand;
                    this.Model = BikeModel;
                    this.SpeedLimit = limit;
                    this.MadeIn = Country;
     
                }
                public  void display() {
                  System.out.println("The is the name of the brand: "+Brand);
                  System.out.println("This the name of the model: "+Model);
                  System.out.println("This is the name of the Bike speed limit: "+SpeedLimit);
                  System.out.println("This is the companies name of origin place: "+MadeIn);
                }
                
}
                    