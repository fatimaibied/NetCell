package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX2G() throws Exception {

        TopX.TopX("2G", "Governorate", false,"Daily",false);
    }

    @Test
    public void GovernorateDailyBHTopX2G() throws Exception {

        TopX.TopX("2G", "Governorate", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX2G() throws Exception {

        TopX.TopX("2G", "Governorate", false,"DailyBH",true);
    }
}
