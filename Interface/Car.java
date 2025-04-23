public class Car implements Vehicle {
      String Brand;
      String Model;
      String limit;
      String MadeIn;
        @Override
        public void setBrand(String Brand){
         this.brand = brand;
        }
        public String getBrand(){
         return brand;
        }
        public void setModel(String Model){
         this.model = model;
        }
        public String getModel(){
         return model;
        }
        public void setlimit(String limit){
         this.limit = limit;
        }
        public String getlimit(){
         return limit;
        }
        pubilc void MadeIn(String MadeIn){
         this.MadeIn = MadeIn;
        }
        public String getMadeIn(){
         return MadeIn;
        }
       public void start(){
          System.out.println("The car is starting");
       }
      public Car(String Carbrand,String CarModel,String SpeedLimit,String Country) {
               this.Brand = Carbrand;
               this.Model = CarModel;
               this.limit = SpeedLimit;
               this.MadeIn = Country;
       }
    public void display(){
      System.out.println("The car brand is: "+Brand);
      System.out.println("The car model name is: "+Model);
      System.out.println("The car speed limit is"+limit);
      System.out.println("The Car origin was in: "+MadeIn);
}
}