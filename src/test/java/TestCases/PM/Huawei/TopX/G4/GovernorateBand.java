package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateBandDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate Band", false,"Daily",false);
    }

    @Test
    public void GovernorateBandDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate Band", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate Band", false,"DailyBH",true);
    }
}
