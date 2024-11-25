package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {
    PM TopX= new PM();

    @Test
    public void SiteDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Site", false,"Daily",false);
    }

    @Test
    public void SiteDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Site", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SiteDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Site", false,"DailyBH",true);
    }
}
