package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Daily", "All", true);
    }
    @Test
    public void RegionStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Daily", "All", true);
    }
    @Test
    public void RegionStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Weekly", "All", true);
    }

    @Test
    public void RegionStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"DailyBH", "All", true);
    }

}
