package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Hourly", "All", false);
    }

    @Test
    public void CellStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Hourly", "All", false);
    }

    @Test
    public void CellStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Daily", "All", false);
    }
    @Test
    public void CellStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Daily", "All", false);
    }
    @Test
    public void CellStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Weekly", "All", false);
    }
    @Test
    public void CellStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Weekly", "All", false);
    }

    @Test
    public void CellStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Monthly", "All", false);
    }
    @Test
    public void CellStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Monthly", "All", false);
    }
    @Test
    public void CellStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"DailyBH", "All", false);
    }
    @Test
    public void CellStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"DailyBH", "All", false);
    }

    @Test
    public void CellStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"WeeklyBH", "All", false);
    }
    @Test
    public void CellStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"WeeklyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"MonthlyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"MonthlyBH", "All", false);
    }
    @Test
    public void CellStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Row", "All", false);
    }
}
