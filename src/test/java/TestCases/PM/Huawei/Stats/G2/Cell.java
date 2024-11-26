package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats2G() throws Exception {

        State.Stats("2G", "Cell", false,"Hourly");
    }

    @Test
    public void CellStatsAggregation2G() throws Exception {

        State.Stats("2G", "Cell", true,"Hourly");
    }

    @Test
    public void CellDailyStats2G() throws Exception {

        State.Stats("2G", "Cell", true,"Daily");
    }

    @Test
    public void CellDailyBHStats2G() throws Exception {

        State.Stats("2G", "Cell", true,"DailyBH");
    }
}
