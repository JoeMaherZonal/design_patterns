import static org.junit.Assert.*;
import org.junit.*;
import factory_management.*;

public class TimeMachineTest {

  TimeMachine basicTimemMachine;
  TimeMachine advancedTimeMachine;
  TimeMachine superTimemMachine;
  TimeMachine tardis;

  @Before
  public void before(){
    basicTimemMachine = new BasicTimeMachine();
    advancedTimeMachine = new AdvancedTimeMachine();
    superTimemMachine = new SuperTimeMachine();
    tardis = new TardisTimeMachine();
  }

  @Test
  public void checkBasicHAsBeenCreated(){
    assertEquals("Basic Time Machine", basicTimemMachine.getName());
  }

  @Test
  public void basicHasComponents(){
    assertEquals(1, basicTimemMachine.countComponents());
  }

  @Test
  public void checkAdvancedHAsBeenCreated(){
    assertEquals("Advanced Time Machine", advancedTimeMachine.getName());
  }

  @Test
  public void advancedHasComponents(){
    assertEquals(2, advancedTimeMachine.countComponents());
  }

  @Test
  public void checkSuperHAsBeenCreated(){
    assertEquals("Super Time Machine", superTimemMachine.getName());
  }

  @Test
  public void superHasComponents(){
    assertEquals(3, superTimemMachine.countComponents());
  }

  @Test
  public void checkTardisHAsBeenCreated(){
    assertEquals("Tardis", tardis.getName());
  }

  @Test
  public void tardisHasComponents(){
    assertEquals(5, tardis.countComponents());
  }
}