package TestCases.CM.Parameter.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellParameter3G() throws Exception {

        parameters.Parameter("3G", "Cell", "Last Week");
    }

    @Test
    public void CellParameterWeekends3G() throws Exception {

        parameters.Parameter("3G", "Cell", "Weekends");
    }

    @Test
    public void CellParameterYesterday3G() throws Exception {

        parameters.Parameter("3G", "Cell", "Yesterday");
    }

    @Test
    public void CellParameterCustom3G() throws Exception {

        parameters.Parameter("3G", "Cell", "Custom");
    }
}
