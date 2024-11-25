package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats4G() throws Exception {

        State.Stats("4G", "Region XDD", false,"Hourly");
    }

    @Test
    public void RegionXDDStatsAggregation4G() throws Exception {

        State.Stats("4G", "Region XDD", true,"Hourly");
    }

}
