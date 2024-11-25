package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX3G() throws Exception {

        TopX.TopX("3G", "Cell", false,"Daily",false);
    }

    @Test
    public void CellDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "Cell", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "Cell", false,"DailyBH",true);
    }
}
