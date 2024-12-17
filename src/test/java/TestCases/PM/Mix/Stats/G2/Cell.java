package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Hourly", "All");
    }

    @Test
    public void CellStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Hourly", "All");
    }

    @Test
    public void CellStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Daily", "All");
    }
    @Test
    public void CellStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Daily", "All");
    }
    @Test
    public void CellStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Weekly", "All");
    }
    @Test
    public void CellStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Weekly", "All");
    }

    @Test
    public void CellStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"Monthly", "All");
    }
    @Test
    public void CellStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"Monthly", "All");
    }
    @Test
    public void CellStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"DailyBH", "All");
    }
    @Test
    public void CellStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"DailyBH", "All");
    }

    @Test
    public void CellStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"WeeklyBH", "All");
    }
    @Test
    public void CellStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"WeeklyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", false,"MonthlyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cell", true,"MonthlyBH", "All");
    }
}
