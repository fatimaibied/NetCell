package TestCases.PM_Export.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class BSC extends MainClass {

    PM State= new PM();

    @Test
    public void BSCStats2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Hourly", "All", true);
    }

    @Test
    public void BSCStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Hourly", "All", true);
    }

    @Test
    public void BSCStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"Daily", "All", true);
    }
    @Test
    public void BSCStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"Daily", "All", true);
    }

    @Test
    public void BSCStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", false,"DailyBH", "All", true);
    }
    @Test
    public void BSCStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "BSC", true,"DailyBH", "All", true);
    }


}
