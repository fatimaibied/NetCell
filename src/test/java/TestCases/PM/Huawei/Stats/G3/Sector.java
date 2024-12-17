package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Hourly", "All");
    }

    @Test
    public void SectorStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Hourly", "All");
    }
    @Test
    public void SectorStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Daily", "All");
    }
    @Test
    public void SectorStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Daily", "All");
    }
    @Test
    public void SectorStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Weekly", "All");
    }
    @Test
    public void SectorStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Weekly", "All");
    }

    @Test
    public void SectorStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Monthly", "All");
    }
    @Test
    public void SectorStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Monthly", "All");
    }
    @Test
    public void SectorStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"DailyBH", "All");
    }
    @Test
    public void SectorStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"DailyBH", "All");
    }

    @Test
    public void SectorStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"WeeklyBH", "All");
    }
    @Test
    public void SectorStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"WeeklyBH", "All");
    }

    @Test
    public void SectorStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"MonthlyBH", "All");
    }

    @Test
    public void SectorStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"MonthlyBH", "All");
    }

    @Test
    public void SectorStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Raw", "All");
    }
    @Test
    public void SectorStatsRown3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Raw", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void SectorSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Hourly", "CS_Drop_Ratio");
    }
}
