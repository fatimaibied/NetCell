package TestCases.PM_Export.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStatsHourly3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"Hourly", "All", false);
    }

    @Test
    public void CellStatsHourlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"Hourly", "All", false);
    }
    @Test
    public void CellStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"Daily", "All", false);
    }
    @Test
    public void CellStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"Daily", "All", false);
    }
    @Test
    public void CellStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"Weekly", "All", false);
    }
    @Test
    public void CellStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"Weekly", "All", false);
    }

    @Test
    public void CellStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"Monthly", "All", false);
    }
    @Test
    public void CellStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"Monthly", "All", false);
    }
    @Test
    public void CellStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"DailyBH", "All", false);
    }
    @Test
    public void CellStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"DailyBH", "All", false);
    }

    @Test
    public void CellStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"WeeklyBH", "All", false);
    }
    @Test
    public void CellStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"WeeklyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"MonthlyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"MonthlyBH", "All", false);
    }
    @Test
    public void CellStatsRow3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", false,"Raw", "All", false);
    }
    @Test
    public void CellStatsRowAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cell", true,"Raw", "All", false);
    }

}
