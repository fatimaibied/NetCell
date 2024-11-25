package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateBand extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateBandStats4G() throws Exception {

        State.Stats("4G", "Governorate Band", false,"Hourly");
    }

    @Test
    public void GovernorateBandStatsAggregation4G() throws Exception {

        State.Stats("4G", "Governorate Band", true,"Hourly");
    }
}
