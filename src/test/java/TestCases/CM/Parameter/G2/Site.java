package TestCases.CM.Parameter.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteParameterLastWeek2G() throws Exception {

        parameters.Parameter("2G", "Site", "LastWeek");
    }
    @Test
    public void SiteParameterWeekends2G() throws Exception {

        parameters.Parameter("2G", "Site", "Weekends");
    }

    @Test
    public void SiteParameterYesterday2G() throws Exception {

        parameters.Parameter("2G", "Site", "Yesterday");
    }

    @Test
    public void SiteParameterCustom2G() throws Exception {

        parameters.Parameter("2G", "Site", "Custom");
    }
}
