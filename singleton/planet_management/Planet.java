package planet_management;

public abstract class Planet{

  int diameter;
  String name;

  public Planet(int diameter, String name){
    this.name = name;
    this.diameter = diameter;
  }

  public String getName(){
    return name;
  }

  public int getDiameter(){
    return diameter;
  }
}