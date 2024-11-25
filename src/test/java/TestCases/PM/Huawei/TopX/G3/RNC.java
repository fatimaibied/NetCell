package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {
    PM TopX= new PM();

    @Test
    public void RNCDailyTopX3G() throws Exception {

        TopX.TopX("3G", "RNC", false,"Daily",false);
    }

    @Test
    public void RNCDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "RNC", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RNCDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "RNC", false,"DailyBH",true);
    }
}
