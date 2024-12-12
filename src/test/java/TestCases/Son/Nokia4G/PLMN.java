package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void PLMN4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "PLMN", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void PLMN4Gcongestedcells() throws Exception {

        SON.son("Nokia","4G", "PLMN", "4g congested cells","DailyBH","");
    }
}
