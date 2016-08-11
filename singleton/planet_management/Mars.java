package planet_management;

public class Mars extends Planet {

  int moons;

  public Mars(int diameter, String name, int moons){
    super(diameter, name);
    this.moons = moons;
  }
  
}