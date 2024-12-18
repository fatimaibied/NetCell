package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"Hourly", "All", false);
    }

    @Test
    public void CellStatsAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", true,"Hourly", "All", false);
    }

    @Test
    public void CellStatsDaily2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"Daily", "All", false);
    }
    @Test
    public void CellStatsDailyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", true,"Daily", "All", false);
    }
    @Test
    public void CellStatsWeekly2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"Weekly", "All", false);
    }
    @Test
    public void CellStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", true,"Weekly", "All", false);
    }

    @Test
    public void CellStatsMonthly2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"Monthly", "All", false);
    }
    @Test
    public void CellStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", true,"Monthly", "All", false);
    }
    @Test
    public void CellStatsDailyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"DailyBH", "All", false);
    }
    @Test
    public void CellStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", true,"DailyBH", "All", false);
    }

    @Test
    public void CellStatsWeeklyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"WeeklyBH", "All", false);
    }
    @Test
    public void CellStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", true,"WeeklyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"MonthlyBH", "All", false);
    }

    @Test
    public void CellStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", true,"MonthlyBH", "All", false);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void CellSearchForKPI2G() throws Exception {

        State.Stats("Huawei", "2G", "Cell", false,"Hourly", "CS_Pages", false);
    }
}
