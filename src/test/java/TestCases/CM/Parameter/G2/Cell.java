package TestCases.CM.Parameter.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellParameter2G() throws Exception {

        parameters.Parameter("2G", "Cell", "Last Week");
    }

    @Test
    public void CellParameterWeekends2G() throws Exception {

        parameters.Parameter("2G", "Cell", "Weekends");
    }

    @Test
    public void CellParameterYesterday2G() throws Exception {

        parameters.Parameter("2G", "Cell", "Yesterday");
    }

    @Test
    public void CellParameterCustom2G() throws Exception {

        parameters.Parameter("2G", "Cell", "Custom");
    }
}
