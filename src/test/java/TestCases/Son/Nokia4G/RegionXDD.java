package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void RegionXDD4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "Region XDD", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void RegionXDD4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4g congested cells","DailyBH","");
    }
}
