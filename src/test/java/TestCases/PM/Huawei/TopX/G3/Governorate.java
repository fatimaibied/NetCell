package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX3G() throws Exception {

        TopX.TopX("3G", "Governorate", false,"Daily",false);
    }

    @Test
    public void GovernorateDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "Governorate", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "Governorate", false,"DailyBH",true);
    }
}
