package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats4G() throws Exception {

        State.Stats("4G", "Cell", false,"Hourly");
    }

    @Test
    public void CellStatsAggregation4G() throws Exception {

        State.Stats("4G", "Cell", true,"Hourly");
    }

}
