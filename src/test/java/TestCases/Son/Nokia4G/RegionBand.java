package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void RegionBand4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "Region Band", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void RegionBand4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4g congested cells","DailyBH","");
    }
}
