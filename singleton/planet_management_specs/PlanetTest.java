import static org.junit.Assert.*;
import org.junit.*;
import planet_management.*;

public class PlanetTest {

  Planet mercury;
  Planet venus;
  Planet earth;
  Planet mars;
  Planet jupiter;
  Planet saturn;
  Planet uranus;
  Planet neptune;

  @Before
  public void before(){
    mercury = new Mercury(4879, "Mercury");
    venus = new Venus(12104, "Venus");
    earth = new Earth(12756, "Earth", 1);
    mars = new Mars(12756, "Mars", 2);
    jupiter = new Jupiter(142984, "Jupiter", 67);
    saturn = new Saturn(142984, "Saturn", 62);
    uranus = new Uranus(142984, "Uranus", 27);
    neptune = new Neptune(142984, "Neptune", 14);
  }

  @Test
  public void mercuryHasName(){
    assertEquals("Mercury", mercury.getName());
  }

  @Test
  public void venusHasName(){
    assertEquals("Venus", venus.getName());
  }

  @Test
  public void earthHasName(){
    assertEquals("Earth", earth.getName());
  }

  @Test
  public void marsHasName(){
    assertEquals("Mars", mars.getName());
  }

  @Test
  public void jupiterHasName(){
    assertEquals("Jupiter", jupiter.getName());
  }

  @Test
  public void saturnHasName(){
    assertEquals("Saturn", saturn.getName());
  }

  @Test
  public void uranusHasName(){
    assertEquals("Uranus", uranus.getName());
  }

  @Test
  public void neptuneHasName(){
    assertEquals("Neptune", neptune.getName());
  }

}