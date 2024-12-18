package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Hourly", "All", false);
    }

    @Test
    public void RegionBandStatsAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Hourly", "All", false);
    }
    @Test
    public void RegionBandStatsDaily4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Daily", "All", false);
    }
    @Test
    public void RegionBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Daily", "All", false);
    }
    @Test
    public void RegionBandStatsWeekly4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Weekly", "All", false);
    }
    @Test
    public void RegionBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Weekly", "All", false);
    }

    @Test
    public void RegionBandStatsMonthly4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Monthly", "All", false);
    }
    @Test
    public void RegionBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Monthly", "All", false);
    }
    @Test
    public void RegionBandStatsDailyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"MonthlyBH", "All", false);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionBandSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Region Band", false,"Hourly", "RRC_ConnReq_Fail_MoData", false);
    }
}
