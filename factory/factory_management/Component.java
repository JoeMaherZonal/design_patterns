package factory_management;

public abstract class Component{

  String name;
  String discription;

  public Component(){
    this.name = null;
    this.discription = null;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setDiscription(String discription){
    this.discription = discription;
  }

}