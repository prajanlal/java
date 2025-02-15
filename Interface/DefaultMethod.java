interface Vehicle{
   
   public void start();
               
   default void stop(){
  System.out.println("the vehicle has stopped");
   }
}
  
  
        
        
     
