package factory_management;

public class BasicTimeMachine extends TimeMachine{


  public BasicTimeMachine(){
    ComponentsFactory componentFactory = new ComponentsFactory();
    super.setName("Basic Time Machine");

    Component fluxCapacitor = componentFactory.getComponent("Flux Capacitor");
    super.addComponent(fluxCapacitor);
  }
}