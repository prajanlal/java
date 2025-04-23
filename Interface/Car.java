public class Car implements Vehicle {
      String Brand;
      String Model;
      String limit;
      
        @Override
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
        public void setlimit(String limit){
         this.limit = limit;
        }
        public String getlimit(){
         return limit;
        
        }
       public void start(){
          System.out.println("The car is starting");
       }
      public Car(String Carbrand,String CarModel,String SpeedLimit) {
               this.Brand = Carbrand;
               this.Model = CarModel;
               this.limit = SpeedLimit;
               
       }
    public void display(){
      System.out.println("The car brand is: "+Brand);
      System.out.println("The car model name is: "+Model);
      System.out.println("The car speed limit is"+limit);
   
}
}