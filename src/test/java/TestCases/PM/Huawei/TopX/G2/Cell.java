package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX2G() throws Exception {

        TopX.TopX("2G", "Cell", false,"Daily",false);
    }

    @Test
    public void CellDailyBHTopX2G() throws Exception {

        TopX.TopX("2G", "Cell", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX2G() throws Exception {

        TopX.TopX("2G", "Cell", false,"DailyBH",true);
    }
}
