package edu.realemj.assign03;
// NOTE: CHANGE realemj to YOUR SITNETID!!!
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Letterhead {

    private String [] allNames = {
            "Empty Industries",
            "WAYNE ENTERPRISES",
            "Luthor Inc.",
            "KENT FARMS",
            "Green Lantern Corp."
    };

    private String [] allSlogans = {
            "",

            "...\n",

            "Power, Trust,\n"
                + "Control\n",

            "A family owned business\n"
                + "serving Smallville for over\n"
                + "37 years\n",

            "Saving the galaxy\n"
                + "for the low, low price of free.\n"
                + "You always get\n"
                + "what you pay for :)\n"
    };

    private char [] allChars = {'.', '*', '$', '#', '@'};

    private String [] allHeaderAnswers = {
            "........................................\n" +
            ". Empty Industries                     .\n" +
            ".                                      .\n" +
            ".                                      .\n" +
            ".                                      .\n" +
            ".                                      .\n" +
            ".                                      .\n" +
            "........................................\n",

            "****************************************\n" +
            "* WAYNE ENTERPRISES                    *\n" +
            "*                                      *\n" +
            "* ...                                  *\n" +
            "*                                      *\n" +
            "*                                      *\n" +
            "*                                      *\n" +
            "****************************************\n",

            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$ Luthor Inc.                          $\n" +
            "$                                      $\n" +
            "$ Power, Trust,                        $\n" +
            "$ Control                              $\n" +
            "$                                      $\n" +
            "$                                      $\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n",

            "########################################\n" +
            "# KENT FARMS                           #\n" +
            "#                                      #\n" +
            "# A family owned business              #\n" +
            "# serving Smallville for over          #\n" +
            "# 37 years                             #\n" +
            "#                                      #\n" +
            "########################################\n",

            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@ Green Lantern Corp.                  @\n" +
            "@                                      @\n" +
            "@ Saving the galaxy                    @\n" +
            "@ for the low, low price of free.      @\n" +
            "@ You always get                       @\n" +
            "@ what you pay for :)                  @\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
    };

    public Letterhead [] createSampleHeaders() {
        Letterhead [] headers = new Letterhead[allNames.length];
        headers[0] = new Letterhead(allNames[0], new String[]{}, allChars[0]);
        for(int i = 1; i < allNames.length; i++) {
            headers[i] = new Letterhead(allNames[i], allSlogans[i].split("\n"), allChars[i]);
        }
        return headers;
    }

    @Test()
    public void test_getName() {
        Letterhead [] headers = createSampleHeaders();
        for(int i = 0; i < headers.length; i++) {
            Assert.assertEquals(headers[i].getName(), allNames[i] + "");
        }
    }

    @Test()
    public void test_getSlogan() {
        Letterhead [] headers = createSampleHeaders();
        for(int i = 0; i < headers.length; i++) {
            Assert.assertEquals(headers[i].getSlogan(), allSlogans[i] + "");            
        }

        // Verify we aren't just copying the reference
        String fullExampleSlogan = "We do\n...stuff...\n";
        String [] exampleSlogan = fullExampleSlogan.split("\n");

        Letterhead example = new Letterhead("Vague Industries", exampleSlogan, '$');
        Assert.assertEquals(example.getSlogan(), fullExampleSlogan);  
        exampleSlogan[0] = "We really do";
        Assert.assertEquals(example.getSlogan(), fullExampleSlogan, "Do NOT just copy references!"); 
    }

    @Test()
    public void test_getBoundaryChar() {
        Letterhead [] headers = createSampleHeaders();
        for(int i = 0; i < headers.length; i++) {
            Assert.assertEquals(headers[i].getBoundaryChar(), allChars[i]);
        }
    }

    @Test()
    public void test_setName() {
        Letterhead [] headers = createSampleHeaders();
        String newName = "Harold Industries";
        headers[0].setName(newName);
        Assert.assertEquals(headers[0].getName(), newName + "");
    }

    @Test()
    public void test_setSlogan() {
        Letterhead [] headers = createSampleHeaders();
        String newSlogan = "Do you know\nthe Muffin Man????\n";
        String [] sloganArray = newSlogan.split("\n");
        headers[0].setSlogan(sloganArray);
        Assert.assertEquals(headers[0].getSlogan(), newSlogan);

        // Changing the array to make sure a copy was made internally
        sloganArray[0] = "Dost thou know";
        Assert.assertEquals(headers[0].getSlogan(), newSlogan, "Do NOT just copy references!");
    }

    @Test()
    public void test_setBoundaryChar() {
        Letterhead [] headers = createSampleHeaders();
        char newChar = '&';
        headers[0].setBoundaryChar(newChar);
        Assert.assertEquals(headers[0].getBoundaryChar(), newChar);
    }

    @Test()
    public void test_toString() {
        Letterhead [] headers = createSampleHeaders();

        // Testing based strictly on constructor
        for(int i = 0; i < headers.length; i++) {
            Assert.assertEquals(headers[i].toString(), allHeaderAnswers[i]);
        }

        // Change one of them and try again
        String newName = "Harold Industries";
        headers[0].setName(newName);
        String newSlogan = "Do you know\nthe Muffin Man????\n";
        headers[0].setSlogan(newSlogan.split("\n"));
        char newChar = '&';
        headers[0].setBoundaryChar(newChar);

        Assert.assertEquals(headers[0].toString(),
                "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n" +
                        "& Harold Industries                    &\n" +
                        "&                                      &\n" +
                        "& Do you know                          &\n" +
                        "& the Muffin Man????                   &\n" +
                        "&                                      &\n" +
                        "&                                      &\n" +
                        "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");
    }
}
