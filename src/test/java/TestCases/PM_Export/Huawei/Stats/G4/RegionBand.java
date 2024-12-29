package TestCases.PM_Export.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Hourly", "All", true);
    }

    @Test
    public void RegionBandStatsAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Hourly", "All", true);
    }
    @Test
    public void RegionBandStatsDaily4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Daily", "All", true);
    }
    @Test
    public void RegionBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Daily", "All", true);
    }

    @Test
    public void RegionBandStatsDailyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"DailyBH", "All", true);
    }


    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionBandSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Region Band", false,"Hourly", "RRC_ConnReq_Fail_MoData", true);
    }
}
