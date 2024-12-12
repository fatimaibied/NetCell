package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNXDDParameter4G() throws Exception {

        parameters.Parameter("4G", "PLMN XDD", "LastWeek");
    }

    @Test
    public void PLMNXDDParameterWeekends4G() throws Exception {

        parameters.Parameter("4G", "PLMN XDD", "Weekends");
    }

    @Test
    public void PLMNXDDParameterYesterday4G() throws Exception {

        parameters.Parameter("4G", "PLMN XDD", "Yesterday");
    }

    @Test
    public void PLMNXDDParameterCustom4G() throws Exception {

        parameters.Parameter("4G", "PLMN XDD", "Custom");
    }
}
