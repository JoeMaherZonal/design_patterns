package planet_management;
import behaviors.*;

public class Earth extends Planet implements Orbitable {

  int moons;

  public Earth(int diameter, String name, int moons){
    super(diameter, name);
    this.moons = moons;
  }

  public int getNumberOfMoons(){
    return moons;
  }
  
}