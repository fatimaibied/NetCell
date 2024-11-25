package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateXDD extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateXDDStats4G() throws Exception {

        State.Stats("4G", "Governorate XDD", false,"Hourly");
    }

    @Test
    public void GovernorateXDDStatsAggregation4G() throws Exception {

        State.Stats("4G", "Governorate XDD", true,"Hourly");
    }
}
