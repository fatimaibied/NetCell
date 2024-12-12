package TestCases.CM.Parameter.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNParameterLastWeek2G() throws Exception {

        parameters.Parameter("2G", "PLMN", "LastWeek");
    }

    @Test
    public void PLMNParameterWeekends2G() throws Exception {

        parameters.Parameter("2G", "PLMN", "Weekends");
    }

    @Test
    public void PLMNParameterYesterday2G() throws Exception {

        parameters.Parameter("2G", "PLMN", "Yesterday");
    }

    @Test
    public void PLMNParameterCustom2G() throws Exception {

        parameters.Parameter("2G", "PLMN", "Custom");
    }
}
