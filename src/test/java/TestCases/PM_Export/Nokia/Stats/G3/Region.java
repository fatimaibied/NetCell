package TestCases.PM_Export.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"Daily", "All", true);
    }
    @Test
    public void RegionStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"Daily", "All", true);
    }

    @Test
    public void RegionStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"DailyBH", "All", true);
    }

}
