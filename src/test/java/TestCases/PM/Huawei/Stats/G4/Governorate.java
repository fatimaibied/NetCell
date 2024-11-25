package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats4G() throws Exception {

        State.Stats("4G", "Governorate", false,"Hourly");
    }

    @Test
    public void GovernorateStatsAggregation4G() throws Exception {

        State.Stats("4G", "Governorate", true,"Hourly");
    }
}
