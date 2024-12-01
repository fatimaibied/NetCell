package TestCases.CM.Parameter.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteParameter4G() throws Exception {

        parameters.Parameter("4G", "Site", "Last Week");
    }
    @Test
    public void SiteParameterWeekends4G() throws Exception {

        parameters.Parameter("4G", "Site", "Weekends");
    }

    @Test
    public void SiteParameterYesterday4G() throws Exception {

        parameters.Parameter("4G", "Site", "Yesterday");
    }

    @Test
    public void SiteParameterCustom4G() throws Exception {

        parameters.Parameter("4G", "Site", "Custom");
    }
}