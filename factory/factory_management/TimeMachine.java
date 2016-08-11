package factory_management;
import java.util.*;

public abstract class TimeMachine{

  String name;
  ArrayList<Component> components;

  public TimeMachine(){
    this.name = null;
    this.components = new ArrayList<Component>();
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void addComponent(Component newComponent){
    this.components.add(newComponent);
  }

  public int countComponents(){
    return components.size();
  }

}