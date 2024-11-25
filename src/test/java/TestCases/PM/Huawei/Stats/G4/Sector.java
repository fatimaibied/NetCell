package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats4G() throws Exception {

        State.Stats("4G", "Sector", false,"Hourly");
    }

    @Test
    public void SectorStatsAggregation4G() throws Exception {

        State.Stats("4G", "Sector", true,"Hourly");
    }
}
