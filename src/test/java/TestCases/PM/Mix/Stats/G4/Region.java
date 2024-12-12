package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats4G() throws Exception {

        State.Stats("Mix", "4G", "Region", false,"Hourly");
    }

    @Test
    public void RegionStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Region", true,"Hourly");
    }

    @Test
    public void RegionStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Region", false,"Daily");
    }
    @Test
    public void RegionStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Region", true,"Daily");
    }
    @Test
    public void RegionStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "Region", false,"Weekly");
    }
    @Test
    public void RegionStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Region", true,"Weekly");
    }

    @Test
    public void RegionStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "Region", false,"Monthly");
    }
    @Test
    public void RegionStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Region", true,"Monthly");
    }
    @Test
    public void RegionStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Region", false,"DailyBH");
    }
    @Test
    public void RegionStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Region", true,"DailyBH");
    }

    @Test
    public void RegionStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Region", false,"WeeklyBH");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region", true,"WeeklyBH");
    }

    @Test
    public void RegionStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix","4G", "Region", false,"MonthlyBH");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region", true,"MonthlyBH");
    }

}
