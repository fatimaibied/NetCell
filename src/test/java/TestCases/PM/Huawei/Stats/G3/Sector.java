package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats3G() throws Exception {

        State.Stats("3G", "Sector", false,"Hourly");
    }

    @Test
    public void SectorStatsAggregation3G() throws Exception {

        State.Stats("3G", "Sector", true,"Hourly");
    }
}
