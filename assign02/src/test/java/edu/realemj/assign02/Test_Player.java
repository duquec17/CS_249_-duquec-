package edu.realemj.assign02;
// NOTE: CHANGE realemj to YOUR SITNETID!!!
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Player {
    @Test()
    public void test_firstName() {
        Player p1 = new Player();
        Player p2 = new Player();
        Assert.assertEquals(p1.getFirstName(), "");
        Assert.assertEquals(p2.getFirstName(), "");

        p1.setFirstName("Bob");
        p2.setFirstName("Joe");
        Assert.assertEquals(p1.getFirstName(), "Bob");
        Assert.assertEquals(p2.getFirstName(), "Joe");
    }

    @Test()
    public void test_lastName() {
        Player p1 = new Player();
        Player p2 = new Player();
        Assert.assertEquals(p1.getLastName(), "");
        Assert.assertEquals(p2.getLastName(), "");

        p1.setLastName("Smith");
        p2.setLastName("Johnson");
        Assert.assertEquals(p1.getLastName(), "Smith");
        Assert.assertEquals(p2.getLastName(), "Johnson");
    }

    @Test()
    public void test_height() {
        Player p1 = new Player();
        Player p2 = new Player();
        Assert.assertEquals(p1.getHeight(), 0);
        Assert.assertEquals(p2.getHeight(), 0);

        p1.setHeight(107);
        p2.setHeight(97);
        Assert.assertEquals(p1.getHeight(), 107);
        Assert.assertEquals(p2.getHeight(), 97);
    }

    @Test()
    public void test_weight() {
        Player p1 = new Player();
        Player p2 = new Player();
        Assert.assertEquals(p1.getWeight(), 0);
        Assert.assertEquals(p2.getWeight(), 0);

        p1.setWeight(210);
        p2.setWeight(108);
        Assert.assertEquals(p1.getWeight(), 210);
        Assert.assertEquals(p2.getWeight(), 108);
    }

    @Test()
    public void test_calculateBMI() {
        Player p = new Player();
        p.setHeight(72);
        p.setWeight(165.1);
        Assert.assertEquals(p.calculateBMI(), 22);

        p.setHeight(74);
        p.setWeight(210.3);
        Assert.assertEquals(p.calculateBMI(), 26);

        p.setHeight(70);
        p.setWeight(167.9);
        Assert.assertEquals(p.calculateBMI(), 24);  
    }

    @Test()
    public void test_getNameString() {
        Player p = new Player();
        Assert.assertEquals(p.getNameString(), ", ");

        p.setFirstName("Bob");
        p.setLastName("Smith");
        Assert.assertEquals(p.getNameString(), "Smith, Bob");
    }

    @Test()
    public void test_getHeightString() {
        Player p = new Player();
        Assert.assertEquals(p.getHeightString(), "0'-0\"");

        p.setHeight(72);        
        Assert.assertEquals(p.getHeightString(), "6'-0\"");

        p.setHeight(74);        
        Assert.assertEquals(p.getHeightString(), "6'-2\"");

        p.setHeight(70);        
        Assert.assertEquals(p.getHeightString(), "5'-10\"");
    }

    @Test()
    public void test_getWeightString() {
        Player p = new Player();
        Assert.assertEquals(p.getWeightString(), "0.0 lbs.");

        p.setWeight(167.9);
        Assert.assertEquals(p.getWeightString(), "167.9 lbs.");
    }

    @Test()
    public void test_toString() {
        Player p = new Player();

        String output = 
            "NAME: , " + "\n" +
            "WEIGHT: 0.0 lbs." + "\n" +
            "HEIGHT: 0'-0\"" + "\n" +
            "BMI: 0" + "\n";

        Assert.assertEquals(p.toString(), output);

        p.setFirstName("Bruce");
        p.setLastName("Wayne");
        p.setHeight(74);
        p.setWeight(210.3);
        output = """
            NAME: Wayne, Bruce
            WEIGHT: 210.3 lbs.
            HEIGHT: 6'-2\"
            BMI: 26   
            """;
        Assert.assertEquals(p.toString(), output);
    }   
}
