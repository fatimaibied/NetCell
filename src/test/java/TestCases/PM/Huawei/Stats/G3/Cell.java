package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    PM State= new PM();

    @Test
    public void CellStats3G() throws Exception {

        State.Stats("3G", "Cell", false,"Hourly");
    }

    @Test
    public void CellStatsAggregation3G() throws Exception {

        State.Stats("3G", "Cell", true,"Hourly");
    }

}
