package planet_management;

public class Uranus extends Planet {

  int moons;

  public Uranus(int diameter, String name, int moons){
    super(diameter, name);
    this.moons = moons;
  }

}