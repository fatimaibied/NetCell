package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {
    PM TopX= new PM();

    @Test
    public void SiteDailyTopX3G() throws Exception {

        TopX.TopX("3G", "Site", false,"Daily",false);
    }

    @Test
    public void SiteDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "Site", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SiteDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "Site", false,"DailyBH",true);
    }
}
