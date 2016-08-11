package planet_management;

public class Neptune extends Planet {

  int moons;

  public Neptune(int diameter, String name, int moons){
    super(diameter, name);
    this.moons = moons;
  }
  
}