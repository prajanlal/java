public class Car implements Vehicle {
    @Override
    public void Engine(){
        System.out.println(" Engine power per km is higher than a bike");
    }
    @Override
    public void HP(){
        System.out.println("Horse Power per km is about 1000kmph");
    }
    @Override
    public int getTopSpeed(){
        return 1000;
    }
}