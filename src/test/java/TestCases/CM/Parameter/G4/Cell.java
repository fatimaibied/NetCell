package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellParameter4G() throws Exception {

        parameters.Parameter("4G", "Cell", "LastWeek");
    }

    @Test
    public void CellParameterWeekends4G() throws Exception {

        parameters.Parameter("4G", "Cell", "Weekends");
    }

    @Test
    public void CellParameterYesterday4G() throws Exception {

        parameters.Parameter("4G", "Cell", "Yesterday");
    }

    @Test
    public void CellParameterCustom4G() throws Exception {

        parameters.Parameter("4G", "Cell", "Custom");
    }
}
