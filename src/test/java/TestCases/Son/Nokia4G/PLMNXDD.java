package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void PLMNXDD4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "PLMN XDD", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void PLMNXDD4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4g congested cells","DailyBH","");
    }
}
