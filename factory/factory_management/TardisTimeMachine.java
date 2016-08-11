package factory_management;

public class TardisTimeMachine extends TimeMachine{


  public TardisTimeMachine(){
    ComponentsFactory componentFactory = new ComponentsFactory();
    super.setName("Tardis");

    Component fluxCapacitor = componentFactory.getComponent("Flux Capacitor");
    Component extractorFan = componentFactory.getComponent("Extractor Fan");
    Component defenceShield = componentFactory.getComponent("Defence Shield");
    Component telephone = componentFactory.getComponent("Telephone");
    Component wormholeRefractor = componentFactory.getComponent("Wormhole Refractor");
    super.addComponent(fluxCapacitor);
    super.addComponent(extractorFan);
    super.addComponent(defenceShield);
    super.addComponent(telephone);
    super.addComponent(wormholeRefractor);
  }
}