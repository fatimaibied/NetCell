package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Hourly");
    }

    @Test
    public void CellStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Hourly");
    }

    @Test
    public void CellStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Daily");
    }
    @Test
    public void CellStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Daily");
    }
    @Test
    public void CellStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Weekly");
    }
    @Test
    public void CellStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Weekly");
    }

    @Test
    public void CellStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"Monthly");
    }
    @Test
    public void CellStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Monthly");
    }
    @Test
    public void CellStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"DailyBH");
    }
    @Test
    public void CellStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"DailyBH");
    }

    @Test
    public void CellStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"WeeklyBH");
    }
    @Test
    public void CellStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"WeeklyBH");
    }

    @Test
    public void CellStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", false,"MonthlyBH");
    }

    @Test
    public void CellStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"MonthlyBH");
    }
    @Test
    public void CellStatsRowAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cell", true,"Row");
    }
}
