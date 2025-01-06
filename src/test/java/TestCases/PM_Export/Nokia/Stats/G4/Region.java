package TestCases.PM_Export.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"Daily", "All", true);
    }
    @Test
    public void RegionStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"Daily", "All", true);
    }

    @Test
    public void RegionStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"DailyBH", "All", true);
    }


}
