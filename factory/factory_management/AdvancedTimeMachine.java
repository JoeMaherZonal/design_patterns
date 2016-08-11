package factory_management;

public class AdvancedTimeMachine extends TimeMachine{


  public AdvancedTimeMachine(){
    ComponentsFactory componentFactory = new ComponentsFactory();
    super.setName("Advanced Time Machine");

    Component fluxCapacitor = componentFactory.getComponent("Flux Capacitor");
    Component extractorFan = componentFactory.getComponent("Extractor Fan");
    super.addComponent(fluxCapacitor);
    super.addComponent(extractorFan);
  }
}