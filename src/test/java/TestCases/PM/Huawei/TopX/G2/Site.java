package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {
    PM TopX= new PM();

    @Test
    public void SiteDailyTopX2G() throws Exception {

        TopX.TopX("2G", "Site", false,"Daily",false);
    }

    @Test
    public void SiteDailyBHTopX2G() throws Exception {

        TopX.TopX("2G", "Site", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SiteDailyLowXTopX2G() throws Exception {

        TopX.TopX("2G", "Site", false,"DailyBH",true);
    }
}
