package edu.realemj.assign02;
// NOTE: CHANGE realemj to YOUR SITNETID!!!
import edu.realemj.testing.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_CharacterCreation {

    private void compareEachLine(String actual, String expected, String typeData) {
        // Split each string
        String [] actualList = actual.split("\n");
        String [] expectedList = expected.split("\n");

        for(int i = 0; i < expectedList.length; i++) {
            String a = "";
            if(i < actualList.length) {
                a = actualList[i];
            }
            String e = expectedList[i];
            a = a.trim();
            e = e.trim();
            Assert.assertEquals(a, e, typeData + " Line " + i + ": output not the same!\n");
        }            
    }

    @Test()
    public void testMain() {

        String [] allInputs = {
            """
            Diana Prince
            72
            165.1
            """,

            """
            Bruce Wayne
            74
            210.3
            """,

            """
                    Peter   Parker
            70
                    167.9
            """                
        };

        GeneralTesting.OutPack [] correctOutputs = {
            new GeneralTesting.OutPack(
                    """
                    Enter name:
                    Enter height in inches:
                    Enter weight in pounds:
                    NAME: Prince, Diana
                    WEIGHT: 165.1 lbs.
                    HEIGHT: 6'-0\"
                    BMI: 22
                    """,
                    ""),
            new GeneralTesting.OutPack(
                    """
                    Enter name:
                    Enter height in inches:
                    Enter weight in pounds:
                    NAME: Wayne, Bruce
                    WEIGHT: 210.3 lbs.
                    HEIGHT: 6'-2\"
                    BMI: 26
                    """, 
                    ""),
            new GeneralTesting.OutPack(
                    """
                    Enter name:
                    Enter height in inches:
                    Enter weight in pounds:
                    NAME: Parker, Peter
                    WEIGHT: 167.9 lbs.
                    HEIGHT: 5'-10\"
                    BMI: 24
                    """, 
                    ""),
        };

        for(int i = 0; i < allInputs.length; i++) {
            // Start redirect
            GeneralTesting.StreamPack.getInstance().start(allInputs[i]);

            // Call main
            CharacterCreation.main(null);

            // Stop redirect
            GeneralTesting.OutPack programOutput = GeneralTesting.StreamPack.getInstance().stop();

            // Compare to correct result            
            try {
                compareEachLine(programOutput.getStdOut(), correctOutputs[i].getStdOut(), "STDOUT");
                compareEachLine(programOutput.getStdErr(), correctOutputs[i].getStdErr(), "STDERR");
            }
            catch(Error e) {
                // OK, specific error
                e.printStackTrace();                
                // So give us the full view as well
                try {                    
                    Assert.assertEquals(programOutput, correctOutputs[i]);
                }
                catch(Error f) {
                    System.err.println("FULL OUTPUT:");
                    f.printStackTrace();
                    throw f;
                }
            }

        }
    }
}
