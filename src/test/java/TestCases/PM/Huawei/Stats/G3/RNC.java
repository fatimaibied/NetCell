package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {

    PM State= new PM();

    @Test
    public void RNCStats3G() throws Exception {

        State.Stats("3G", "RNC", false,"Hourly");
    }

    @Test
    public void RNCStatsAggregation3G() throws Exception {

        State.Stats("3G", "RNC", true,"Hourly");
    }

}
