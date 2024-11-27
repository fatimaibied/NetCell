package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", false,"Hourly");
    }

    @Test
    public void CellStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", true,"Hourly");
    }

    @Test
    public void CellStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", false,"Daily");
    }
    @Test
    public void CellStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", true,"Daily");
    }
    @Test
    public void CellStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", false,"Weekly");
    }
    @Test
    public void CellStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", true,"Weekly");
    }

    @Test
    public void CellStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", false,"Monthly");
    }
    @Test
    public void CellStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", true,"Monthly");
    }
    @Test
    public void CellStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", false,"DailyBH");
    }
    @Test
    public void CellStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", true,"DailyBH");
    }

    @Test
    public void CellStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", false,"WeeklyBH");
    }
    @Test
    public void CellStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", true,"WeeklyBH");
    }

    @Test
    public void CellStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", false,"MonthlyBH");
    }

    @Test
    public void CellStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cell", true,"MonthlyBH");
    }

}
