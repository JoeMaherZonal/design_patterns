package planet_management;

public class Saturn extends Planet {

  int moons;
  
  public Saturn(int diameter, String name, int moons){
    super(diameter, name);
    this.moons = moons;
  }

  public int getNumberOfMoons(){
    return moons;
  }

}