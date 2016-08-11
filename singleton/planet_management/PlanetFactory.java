package planet_management;

public class PlanetFactory {

  Planet mercury;
  Planet venus;
  Planet earth;
  Planet mars;
  Planet jupiter;
  Planet saturn;
  Planet uranus;
  Planet neptune;

  public PlanetFactory(){
    this.mercury = null;
    this.venus = null;
    this.earth = null;
    this.mars = null;
    this.jupiter = null;
    this.saturn = null;
    this.uranus = null;
    this.neptune = null;
  }

  public Planet getMercury(){
    if(this.mercury == null){
      Planet newMercury = new Mercury(4879, "Mercury");
      return newMercury;
    }else{
      return this.mercury;
    }
  }

  public Planet getVenus(){
    if(this.venus == null){
      Planet newVenus = new Venus(12104, "Venus");
      return newVenus;
    }else{
      return this.venus;
    }
  }

  public Planet getEarth(){
    if(this.earth == null){
      Planet newEarth = new Earth(12756, "Earth", 1);
      return newEarth;
    }else{
      return this.earth;
    }
  }

  public Planet getMars(){
    if(this.mars == null){
      Planet newMars = new Mars(12756, "Mars", 2);
      return newMars;
    }else{
      return this.mars;
    }
  }

  public Planet getJupiter(){
    if(this.jupiter == null){
      Planet newJupiter = new Jupiter(142984, "Jupiter", 67);
      return newJupiter;
    }else{
      return this.jupiter;
    }
  }

  public Planet getSaturn(){
    if(this.saturn == null){
      Planet newSaturn = new Saturn(142984, "Saturn", 62);
      return newSaturn;
    }else{
      return this.saturn;
    }
  }

  public Planet getUranus(){
    if(this.uranus == null){
      Planet newUranus = new Uranus(142984, "Uranus", 27);
      return newUranus;
    }else{
      return this.uranus;
    }
  }

  public Planet getNeptune(){
    if(this.neptune == null){
      Planet newNeptune = new Neptune(142984, "Neptune", 14);
      return newNeptune;
    }else{
      return this.neptune;
    }
  }


}