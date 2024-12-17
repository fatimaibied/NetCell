package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Hourly", "All");
    }

    @Test
    public void CellStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Hourly", "All");
    }

    @Test
    public void CellStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Daily", "All");
    }
    @Test
    public void CellStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Daily", "All");
    }
    @Test
    public void CellStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Weekly", "All");
    }
    @Test
    public void CellStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Weekly", "All");
    }

    @Test
    public void CellStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"Monthly", "All");
    }
    @Test
    public void CellStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Monthly", "All");
    }
    @Test
    public void CellStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"DailyBH", "All");
    }
    @Test
    public void CellStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"DailyBH", "All");
    }

    @Test
    public void CellStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"WeeklyBH", "All");
    }
    @Test
    public void CellStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"WeeklyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", false,"MonthlyBH", "All");
    }

    @Test
    public void CellStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"MonthlyBH", "All");
    }
    @Test
    public void CellStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cell", true,"Row", "All");
    }
}
