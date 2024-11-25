package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats4G() throws Exception {

        State.Stats("4G", "Region Band", false,"Hourly");
    }

    @Test
    public void RegionBandStatsAggregation4G() throws Exception {

        State.Stats("4G", "Region Band", true,"Hourly");
    }

}
