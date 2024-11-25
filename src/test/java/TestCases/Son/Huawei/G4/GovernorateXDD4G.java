package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class GovernorateXDD4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void GovernorateXDD4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Governorate XDD", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void GovernorateXDD4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Governorate XDD", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void GovernorateXDD4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Governorate XDD", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void GovernorateXDD4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Governorate XDD", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void GovernorateXDD4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void GovernorateXDD4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void GovernorateXDD4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void GovernorateXDD4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void GovernorateXDD4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void GovernorateXDD4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void GovernorateXDD4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void GovernorateXDD4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void GovernorateXDD4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDD4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDD4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDD4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDD4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Governorate XDD", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDD4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDD4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDD4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void GovernorateXDD4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void GovernorateXDDAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Governorate XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateXDDAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Governorate XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateXDDAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Governorate XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void GovernorateXDDAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Governorate XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateXDDAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Governorate XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateXDDAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Governorate XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void GovernorateXDDSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDDSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDDSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDDSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDDSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Governorate XDD", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDDSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateXDDSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void GovernorateXDDCOSector() throws Exception {

        SON.son("Huawei","4G", "Governorate XDD", "CO Sector","","");
    }


   }