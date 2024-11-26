package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats3G() throws Exception {

        State.Stats("3G", "Governorate", false,"Hourly");
    }

    @Test
    public void GovernorateStatsAggregation3G() throws Exception {

        State.Stats("3G", "Governorate", true,"Hourly");
    }
}
