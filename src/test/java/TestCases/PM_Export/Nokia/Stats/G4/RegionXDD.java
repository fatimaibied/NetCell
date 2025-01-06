package TestCases.PM_Export.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Region XDD", false,"Hourly", "All", true);
    }

    @Test
    public void RegionXDDStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region XDD", true,"Hourly", "All", true);
    }

    @Test
    public void RegionXDDStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Region XDD", false,"Daily", "All", true);
    }
    @Test
    public void RegionXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region XDD", true,"Daily", "All", true);
    }

    @Test
    public void RegionXDDStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region XDD", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region XDD", true,"DailyBH", "All", true);
    }


}
