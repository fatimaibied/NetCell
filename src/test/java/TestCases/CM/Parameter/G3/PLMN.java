package TestCases.CM.Parameter.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNParameterLastWeek3G() throws Exception {

        parameters.Parameter("3G", "PLMN", "LastWeek");
    }

    @Test
    public void PLMNParameterWeekends3G() throws Exception {

        parameters.Parameter("3G", "PLMN", "Weekends");
    }

    @Test
    public void PLMNParameterYesterday3G() throws Exception {

        parameters.Parameter("3G", "PLMN", "Yesterday");
    }

    @Test
    public void PLMNParameterCustom3G() throws Exception {

        parameters.Parameter("3G", "PLMN", "Custom");
    }
}
