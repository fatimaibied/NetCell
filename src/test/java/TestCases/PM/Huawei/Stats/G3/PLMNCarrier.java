package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats4G() throws Exception {

        State.Stats("3G", "PLMN Carrier", false,"Hourly");
    }

}
