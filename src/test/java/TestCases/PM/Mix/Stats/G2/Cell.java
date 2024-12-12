package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Hourly");
    }

    @Test
    public void CellStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Hourly");
    }

    @Test
    public void CellStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Daily");
    }
    @Test
    public void CellStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Daily");
    }
    @Test
    public void CellStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Weekly");
    }
    @Test
    public void CellStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Weekly");
    }

    @Test
    public void CellStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Monthly");
    }
    @Test
    public void CellStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Monthly");
    }
    @Test
    public void CellStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"DailyBH");
    }
    @Test
    public void CellStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"DailyBH");
    }

    @Test
    public void CellStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"WeeklyBH");
    }
    @Test
    public void CellStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"WeeklyBH");
    }

    @Test
    public void CellStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"MonthlyBH");
    }

    @Test
    public void CellStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"MonthlyBH");
    }
}
