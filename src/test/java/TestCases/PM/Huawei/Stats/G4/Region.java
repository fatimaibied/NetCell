package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Hourly", "All");
    }

    @Test
    public void RegionStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"Hourly", "All");
    }

    @Test
    public void RegionStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Daily", "All");
    }
    @Test
    public void RegionStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"Daily", "All");
    }
    @Test
    public void RegionStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Weekly", "All");
    }
    @Test
    public void RegionStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"Weekly", "All");
    }

    @Test
    public void RegionStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Monthly", "All");
    }
    @Test
    public void RegionStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"Monthly", "All");
    }
    @Test
    public void RegionStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"DailyBH", "All");
    }
    @Test
    public void RegionStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"DailyBH", "All");
    }

    @Test
    public void RegionStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region", true,"MonthlyBH", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Hourly", "Total_Conn_Erlangs");
    }

}
