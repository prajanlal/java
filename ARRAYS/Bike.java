public  class Bike {

    String SBrand;
    String SModel;
    int SpeedLimit;
    String MadeIn;
     
          public void setSBrand(String SBrand){
            this.SBrand = SBrand;

          }
          public String getSBrand(){
            return SBrand;
          }
          public void setSModel(String SModel){
            this.SModel = SModel;
          }
          public String getSModel(){
            return SModel;
          }
          public void setSpeedLimit(int SpeedLimit){
            this.SpeedLimit = SpeedLimit;
          }
          public int getSpeedLimit(){
            return SpeedLimit;
          }
          public void setMadeIn(String MadeIn){
             this.MadeIn = MadeIn;
          }
          public String getMadeIn(){
            return MadeIn;
          }

                public Bike(String brand,String BikeModel,int limit,String Country){
                    this.SBrand = brand;
                    this.SModel = BikeModel;
                    this.SpeedLimit = limit;
                    this.MadeIn = Country;
                }

                public  void display() {
                  System.out.println("Bike Brand "+SBrand);
                  System.out.println("Biek Model: "+SModel);
                  System.out.println("Bike speed limit is: "+SpeedLimit);
                  System.out.println("Made in which country: "+MadeIn);
                }
               

    }