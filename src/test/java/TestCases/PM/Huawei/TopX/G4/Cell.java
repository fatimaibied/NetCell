package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Cell", false,"Daily",false);
    }

    @Test
    public void CellDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Cell", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Cell", false,"DailyBH",true);
    }
}
