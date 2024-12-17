package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Hourly", "All");
    }

    @Test
    public void CellStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Hourly", "All");
    }

    @Test
    public void CellStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Daily", "All");
    }
    @Test
    public void CellStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Daily", "All");
    }
    @Test
    public void CellStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Weekly", "All");
    }
    @Test
    public void CellStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Weekly", "All");
    }

    @Test
    public void CellStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Monthly", "All");
    }
    @Test
    public void CellStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Monthly", "All");
    }
    @Test
    public void CellStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"DailyBH", "All");
    }
    @Test
    public void CellStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"DailyBH", "All");
    }

    @Test
    public void CellStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"WeeklyBH", "All");
    }
    @Test
    public void CellStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"WeeklyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"MonthlyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"MonthlyBH", "All");
    }
    @Test
    public void CellStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Row", "All");
    }
}
