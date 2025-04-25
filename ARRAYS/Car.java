public class Car   {

     String Brand;
     String Model;
    int limit;

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

        public void setlimit(int limit){
         this.limit = limit;
        }

        public int getlimit(){
         return limit;
       }

      public Car(String  Carbrand,String CarModel,int SpeedLimit) {
               this.Brand = Carbrand;
               this.Model = CarModel;
               this.limit = SpeedLimit;
               
       }
       
    public void display(){
    
      System.out.println("Car Brand: "+Brand);
      System.out.println("Car model : "+Model);
      System.out.println("Car speed limit is: "+limit);
      }
}
