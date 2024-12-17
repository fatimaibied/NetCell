package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Hourly", "All");
    }

    @Test
    public void RegionXDDStatsAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Hourly", "All");
    }
    @Test
    public void RegionXDDStatsDaily4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Daily", "All");
    }
    @Test
    public void RegionXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Daily", "All");
    }
    @Test
    public void RegionXDDStatsWeekly4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Weekly", "All");
    }
    @Test
    public void RegionXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Weekly", "All");
    }

    @Test
    public void RegionXDDStatsMonthly4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Monthly", "All");
    }
    @Test
    public void RegionXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Monthly", "All");
    }
    @Test
    public void RegionXDDStatsDailyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"DailyBH", "All");
    }
    @Test
    public void RegionXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"DailyBH", "All");
    }

    @Test
    public void RegionXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"MonthlyBH", "All");
    }
    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionXDDSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Region XDD", false,"Hourly", "Blind_HO_Out_Att");
    }

}
