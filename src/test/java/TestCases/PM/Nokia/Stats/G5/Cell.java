package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Hourly");
    }

    @Test
    public void CellStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Hourly");
    }

    @Test
    public void CellStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Daily");
    }
    @Test
    public void CellStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Daily");
    }
    @Test
    public void CellStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Weekly");
    }
    @Test
    public void CellStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Weekly");
    }

    @Test
    public void CellStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"Monthly");
    }
    @Test
    public void CellStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Monthly");
    }
    @Test
    public void CellStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"DailyBH");
    }
    @Test
    public void CellStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"DailyBH");
    }

    @Test
    public void CellStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"WeeklyBH");
    }
    @Test
    public void CellStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"WeeklyBH");
    }

    @Test
    public void CellStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", false,"MonthlyBH");
    }

    @Test
    public void CellStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"MonthlyBH");
    }
    @Test
    public void CellStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cell", true,"Row");
    }
}
