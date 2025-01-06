package TestCases.PM_Export.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats4G() throws Exception {

        State.Stats("Mix","4G", "Region Band", false,"Hourly", "All", true);
    }

    @Test
    public void RegionBandStatsAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region Band", true,"Hourly", "All", true);
    }
    @Test
    public void RegionBandStatsDaily4G() throws Exception {

        State.Stats("Mix","4G", "Region Band", false,"Daily", "All", true);
    }
    @Test
    public void RegionBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region Band", true,"Daily", "All", true);
    }

    @Test
    public void RegionBandStatsDailyBH4G() throws Exception {

        State.Stats("Mix","4G", "Region Band", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region Band", true,"DailyBH", "All", true);
    }


}
