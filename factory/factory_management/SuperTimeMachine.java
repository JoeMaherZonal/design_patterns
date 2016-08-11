package factory_management;

public class SuperTimeMachine extends TimeMachine{


  public SuperTimeMachine(){
    ComponentsFactory componentFactory = new ComponentsFactory();
    super.setName("Super Time Machine");

    Component fluxCapacitor = componentFactory.getComponent("Flux Capacitor");
    Component extractorFan = componentFactory.getComponent("Extractor Fan");
    Component defenceShield = componentFactory.getComponent("Defence Shield");
    super.addComponent(fluxCapacitor);
    super.addComponent(extractorFan);
    super.addComponent(defenceShield);
  }
}