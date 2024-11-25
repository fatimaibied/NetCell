package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionCarrierDailyTopX3G() throws Exception {

        TopX.TopX("3G", "Region Carrier", false,"Daily",false);
    }

    @Test
    public void RegionCarrierDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "Region Carrier", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionCarrierDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "Region Carrier", false,"DailyBH",true);
    }
}
