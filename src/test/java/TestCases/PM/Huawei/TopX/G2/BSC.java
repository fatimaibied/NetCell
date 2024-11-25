package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class BSC extends MainClass {
    PM TopX= new PM();

    @Test
    public void BSCDailyTopX2G() throws Exception {

        TopX.TopX("2G", "BSC", false,"Daily",false);
    }

    @Test
    public void BSCDailyBHTopX2G() throws Exception {

        TopX.TopX("2G", "BSC", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void BSCDailyLowXTopX2G() throws Exception {

        TopX.TopX("2G", "BSC", false,"DailyBH",true);
    }
}
