package TestCases.PM.Huawei.Stats.G4;

import Main.CM;
import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats4G() throws Exception {

        State.Stats("4G", "PLMN", false,"Hourly");
    }

}
