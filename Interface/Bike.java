public class Bike implements Vehicle{ 
    @Override
    public void Engine(){
        System.out.println("Engine type is V7");
    }
    @Override
      public void HP(){
        System.out.println("Horse Power per km is 100 ");
      }
      @Override
      public int getTopSpeed(){
        return 800;
      }
}