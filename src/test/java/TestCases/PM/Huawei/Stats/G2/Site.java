package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats2G() throws Exception {

        State.Stats("2G", "Site", false,"Hourly");
    }

    @Test
    public void SiteStatsAggregation2G() throws Exception {

        State.Stats("2G", "Site", true,"Hourly");
    }

    @Test
    public void SiteDailyStats2G() throws Exception {

        State.Stats("2G", "Site", true,"Daily");
    }

    @Test
    public void SiteDailyBHStats2G() throws Exception {

        State.Stats("2G", "Site", true,"DailyBH");
    }
}
