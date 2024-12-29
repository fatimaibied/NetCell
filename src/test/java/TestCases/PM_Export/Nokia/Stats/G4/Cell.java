package TestCases.PM_Export.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Hourly", "All", false);
    }

    @Test
    public void CellStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Hourly", "All", false);
    }

    @Test
    public void CellStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Daily", "All", false);
    }
    @Test
    public void CellStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Daily", "All", false);
    }
    @Test
    public void CellStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Weekly", "All", false);
    }
    @Test
    public void CellStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Weekly", "All", false);
    }

    @Test
    public void CellStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Monthly", "All", false);
    }
    @Test
    public void CellStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Monthly", "All", false);
    }
    @Test
    public void CellStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"DailyBH", "All", false);
    }
    @Test
    public void CellStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"DailyBH", "All", false);
    }

    @Test
    public void CellStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"WeeklyBH", "All", false);
    }
    @Test
    public void CellStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"WeeklyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"MonthlyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"MonthlyBH", "All", false);
    }
    @Test
    public void CellStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Row", "All", false);
    }
}
