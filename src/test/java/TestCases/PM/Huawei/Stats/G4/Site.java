package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats4G() throws Exception {

        State.Stats("4G", "Site", false,"Hourly");
    }

    @Test
    public void SiteStatsAggregation4G() throws Exception {

        State.Stats("4G", "Site", true,"Hourly");
    }

}
