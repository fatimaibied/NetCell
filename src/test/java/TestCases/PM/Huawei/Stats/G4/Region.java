package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats4G() throws Exception {

        State.Stats("4G", "Region", false,"Hourly");
    }

    @Test
    public void RegionStatsAggregation4G() throws Exception {

        State.Stats("4G", "Region", true,"Hourly");
    }

}
