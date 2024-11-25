package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNCarrierDailyTopX3G() throws Exception {

        TopX.TopX("3G", "PLMN Carrier", false,"Daily",false);
    }

    @Test
    public void PLMNCarrierDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "PLMN Carrier", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNCarrierDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "PLMN Carrier", false,"DailyBH",true);
    }
}
