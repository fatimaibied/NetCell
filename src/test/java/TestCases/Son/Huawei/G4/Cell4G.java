package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cell4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void Cell4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Cell", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Cell4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Cell", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void Cell4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Cell", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Cell4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Cell", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void Cell4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Cell4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Cell", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void Cell4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void Cell4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void Cell4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void Cell4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void Cell4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void Cell4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void Cell4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void Cell4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Cell4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void Cell4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void Cell4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Cell", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void Cell4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void Cell4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Cell4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void Cell4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Cell", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void CellAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Cell", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void CellAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Cell", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void CellAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Cell", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void CellAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Cell", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void CellAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Cell", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void CellAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Cell", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void CellSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Cell", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Cell", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Cell", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Cell", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Cell", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Cell", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Cell", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void CellCOSector() throws Exception {

        SON.son("Huawei","4G", "Cell", "CO Sector","","");
    }


   }