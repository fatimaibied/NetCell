package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate", false,"Daily",false);
    }

    @Test
    public void GovernorateDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate", false,"DailyBH",true);
    }
}
