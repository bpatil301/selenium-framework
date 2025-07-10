import org.testng.annotations.*;


public class FirstTestNG {

@BeforeMethod
    public void setup()
{
    System.out.println("Setup Executed");
}
@Test
    public void testLogin()
{
    System.out.println("Test executed");
}
@AfterMethod
    public void teardoen()
{
    System.out.println("Teardown executed");
}

}
