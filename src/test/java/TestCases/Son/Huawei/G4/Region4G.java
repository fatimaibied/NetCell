package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Region4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void Region4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Region", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Region4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Region", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void Region4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Region", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Region4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Region", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void Region4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Region", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Region4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Region", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void Region4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Region", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void Region4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void Region4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void Region4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void Region4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void Region4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Region", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void Region4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Region", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void Region4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Region", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Region4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Region", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void Region4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Region", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void Region4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Region", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void Region4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Region", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void Region4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Region", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Region4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Region", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void Region4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Region", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void RegionAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Region", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Region", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Region", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void RegionAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Region", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Region", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Region", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void RegionSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Region", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Region", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Region", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Region", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Region", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Region", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Region", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void RegionCOSector() throws Exception {

        SON.son("Huawei","4G", "Region", "CO Sector","","");
    }


   }