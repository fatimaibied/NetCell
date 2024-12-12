package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Hourly");
    }

    @Test
    public void SectorStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Hourly");
    }
    @Test
    public void SectorStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Daily");
    }
    @Test
    public void SectorStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Daily");
    }
    @Test
    public void SectorStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Weekly");
    }
    @Test
    public void SectorStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Weekly");
    }

    @Test
    public void SectorStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Monthly");
    }
    @Test
    public void SectorStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Monthly");
    }
    @Test
    public void SectorStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"DailyBH");
    }
    @Test
    public void SectorStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"DailyBH");
    }

    @Test
    public void SectorStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"WeeklyBH");
    }
    @Test
    public void SectorStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"WeeklyBH");
    }

    @Test
    public void SectorStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"MonthlyBH");
    }

    @Test
    public void SectorStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"MonthlyBH");
    }

    @Test
    public void SectorStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", true,"Raw");
    }
    @Test
    public void SectorStatsRown3G() throws Exception {

        State.Stats("Huawei", "3G", "Sector", false,"Raw");
    }
}
