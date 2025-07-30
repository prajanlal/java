public interface Hybridinheritance  {
     void NovalPlanet();
}

class SolarSystem  {
    String life;
    void basicfunctions() {
        System.out.println("Basic functions of Solar System");
    }
}
class Earth extends SolarSystem {
    void EarthInfo() {
    System.out.println("Has life"+life);
    }
}
class Mars extends SolarSystem {
    void MarsInfo() {
        System.out.println("Mars has no life"+life);
    }
}
 class test extends SolarSystem {
    public static void main(String args[]) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
    }
}
