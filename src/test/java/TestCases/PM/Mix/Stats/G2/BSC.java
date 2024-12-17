package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class BSC extends MainClass {

    PM State= new PM();

    @Test
    public void BSCStats2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Hourly", "All");
    }

    @Test
    public void BSCStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Hourly", "All");
    }

    @Test
    public void BSCStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Daily", "All");
    }
    @Test
    public void BSCStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Daily", "All");
    }
    @Test
    public void BSCStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Weekly", "All");
    }
    @Test
    public void BSCStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Weekly", "All");
    }

    @Test
    public void BSCStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Monthly", "All");
    }
    @Test
    public void BSCStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Monthly", "All");
    }
    @Test
    public void BSCStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"DailyBH", "All");
    }
    @Test
    public void BSCStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"DailyBH", "All");
    }

    @Test
    public void BSCStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"WeeklyBH", "All");
    }
    @Test
    public void BSCStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"WeeklyBH", "All");
    }

    @Test
    public void BSCStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"MonthlyBH", "All");
    }

    @Test
    public void BSCStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"MonthlyBH", "All");
    }
}
