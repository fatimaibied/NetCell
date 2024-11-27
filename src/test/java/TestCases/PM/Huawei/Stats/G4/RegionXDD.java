package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Hourly");
    }

    @Test
    public void RegionXDDStatsAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Hourly");
    }
    @Test
    public void RegionXDDStatsDaily4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Daily");
    }
    @Test
    public void RegionXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Daily");
    }
    @Test
    public void RegionXDDStatsWeekly4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Weekly");
    }
    @Test
    public void RegionXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Weekly");
    }

    @Test
    public void RegionXDDStatsMonthly4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"Monthly");
    }
    @Test
    public void RegionXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"Monthly");
    }
    @Test
    public void RegionXDDStatsDailyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"DailyBH");
    }
    @Test
    public void RegionXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"DailyBH");
    }

    @Test
    public void RegionXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"WeeklyBH");
    }
    @Test
    public void RegionXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"WeeklyBH");
    }

    @Test
    public void RegionXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", false,"MonthlyBH");
    }

    @Test
    public void RegionXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region XDD", true,"MonthlyBH");
    }

}
