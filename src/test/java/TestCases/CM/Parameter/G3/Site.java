package TestCases.CM.Parameter.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteParameter3G() throws Exception {

        parameters.Parameter("3G", "Site", "LastWeek");
    }
    @Test
    public void SiteParameterWeekends3G() throws Exception {

        parameters.Parameter("3G", "Site", "Weekends");
    }

    @Test
    public void SiteParameterYesterday3G() throws Exception {

        parameters.Parameter("3G", "Site", "Yesterday");
    }

    @Test
    public void SiteParameterCustom3G() throws Exception {

        parameters.Parameter("3G", "Site", "Custom");
    }
}
