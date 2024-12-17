package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Hourly", "All");
    }

    @Test
    public void CellStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Hourly", "All");
    }

    @Test
    public void CellStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Daily", "All");
    }
    @Test
    public void CellStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Daily", "All");
    }
    @Test
    public void CellStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Weekly", "All");
    }
    @Test
    public void CellStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Weekly", "All");
    }

    @Test
    public void CellStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Monthly", "All");
    }
    @Test
    public void CellStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Monthly", "All");
    }
    @Test
    public void CellStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"DailyBH", "All");
    }
    @Test
    public void CellStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"DailyBH", "All");
    }

    @Test
    public void CellStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"WeeklyBH", "All");
    }
    @Test
    public void CellStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"WeeklyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"MonthlyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"MonthlyBH", "All");
    }
    @Test
    public void CellStatsRowAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Row", "All");
    }
}
