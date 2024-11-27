package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Hourly");
    }

    @Test
    public void RegionBandStatsAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Hourly");
    }
    @Test
    public void RegionBandStatsDaily4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Daily");
    }
    @Test
    public void RegionBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Daily");
    }
    @Test
    public void RegionBandStatsWeekly4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Weekly");
    }
    @Test
    public void RegionBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Weekly");
    }

    @Test
    public void RegionBandStatsMonthly4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"Monthly");
    }
    @Test
    public void RegionBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"Monthly");
    }
    @Test
    public void RegionBandStatsDailyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"DailyBH");
    }
    @Test
    public void RegionBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"DailyBH");
    }

    @Test
    public void RegionBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"WeeklyBH");
    }
    @Test
    public void RegionBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"WeeklyBH");
    }

    @Test
    public void RegionBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", false,"MonthlyBH");
    }

    @Test
    public void RegionBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Region Band", true,"MonthlyBH");
    }
}
