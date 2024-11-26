package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats3G() throws Exception {

        State.Stats("3G", "Site", false,"Hourly");
    }

    @Test
    public void SiteStatsAggregation3G() throws Exception {

        State.Stats("3G", "Site", true,"Hourly");
    }

}
