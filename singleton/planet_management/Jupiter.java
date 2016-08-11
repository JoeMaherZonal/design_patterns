package planet_management;

public class Jupiter extends Planet {

  int moons;
  
  public Jupiter(int diameter, String name, int moons){
    super(diameter, name);
    this.moons = moons;
  }

  public int getNumberOfMoons(){
    return moons;
  }

}