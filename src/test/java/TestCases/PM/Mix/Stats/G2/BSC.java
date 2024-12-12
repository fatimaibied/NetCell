package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class BSC extends MainClass {

    PM State= new PM();

    @Test
    public void BSCStats2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Hourly");
    }

    @Test
    public void BSCStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Hourly");
    }

    @Test
    public void BSCStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Daily");
    }
    @Test
    public void BSCStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Daily");
    }
    @Test
    public void BSCStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Weekly");
    }
    @Test
    public void BSCStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Weekly");
    }

    @Test
    public void BSCStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Monthly");
    }
    @Test
    public void BSCStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Monthly");
    }
    @Test
    public void BSCStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"DailyBH");
    }
    @Test
    public void BSCStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"DailyBH");
    }

    @Test
    public void BSCStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"WeeklyBH");
    }
    @Test
    public void BSCStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"WeeklyBH");
    }

    @Test
    public void BSCStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"MonthlyBH");
    }

    @Test
    public void BSCStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"MonthlyBH");
    }
}
