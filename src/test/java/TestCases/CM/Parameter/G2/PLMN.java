package TestCases.CM.Parameter.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNParameterLastWeek4G() throws Exception {

        parameters.Parameter("4G", "PLMN", "LastWeek");
    }

    @Test
    public void PLMNParameterWeekends4G() throws Exception {

        parameters.Parameter("4G", "PLMN", "Weekends");
    }

    @Test
    public void PLMNParameterYesterday4G() throws Exception {

        parameters.Parameter("4G", "PLMN", "Yesterday");
    }

    @Test
    public void PLMNParameterCustom4G() throws Exception {

        parameters.Parameter("4G", "PLMN", "Custom");
    }
}
