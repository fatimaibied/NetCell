package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats2G() throws Exception {

        State.Stats("2G", "Region", false,"Hourly");
    }

    @Test
    public void RegionStatsAggregation2G() throws Exception {

        State.Stats("2G", "Region", true,"Hourly");
    }

    @Test
    public void RegionDailyStats2G() throws Exception {

        State.Stats("2G", "Region", true,"Daily");
    }

    @Test
    public void RegionDailyBHStats2G() throws Exception {

        State.Stats("2G", "Region", true,"DailyBH");
    }
}
