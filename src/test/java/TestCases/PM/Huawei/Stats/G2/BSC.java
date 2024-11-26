package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class BSC extends MainClass {

    PM State= new PM();

    @Test
    public void BSCStats2G() throws Exception {

        State.Stats("2G", "BSC", false,"Hourly");
    }

    @Test
    public void BSCStatsAggregation2G() throws Exception {

        State.Stats("2G", "BSC", true,"Hourly");
    }

    @Test
    public void BSCDailyStats2G() throws Exception {

        State.Stats("2G", "BSC", true,"Daily");
    }

    @Test
    public void BSCDailyBHStats2G() throws Exception {

        State.Stats("2G", "BSC", true,"DailyBH");
    }
}
