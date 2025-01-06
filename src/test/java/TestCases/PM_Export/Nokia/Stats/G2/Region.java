package TestCases.PM_Export.Nokia.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsDaily2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"Daily", "All", true);
    }
    @Test
    public void RegionStatsDailyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"Daily", "All", true);
    }

    @Test
    public void RegionStatsDailyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"DailyBH", "All", true);
    }


}
