package factory_management;

public class ComponentsFactory {

    Component fluxcapacitor;
    Component defencesheild;
    Component extractorfan;
    Component wormholerefractor;
    Component telephone;

  public Component getComponent(String requiredComponent){
    if(requiredComponent == "Flux Capacitor"){
      fluxcapacitor = new FluxCapacitor();
      return fluxcapacitor;
    } else
    if(requiredComponent == "Defence Sheild"){
      defencesheild = new DefenceShield();
      return defencesheild;
    } else
    if(requiredComponent == "Extractor Fan"){
      extractorfan = new ExtractorFan();
      return extractorfan;
    } else
    if(requiredComponent == "Wormhole Refractor"){
      wormholerefractor = new WormholeRefractor();
      return wormholerefractor;
    } else
    if(requiredComponent == "Telephone"){
      telephone = new Telephone();
      return telephone;
    } else return null;
  }
}
