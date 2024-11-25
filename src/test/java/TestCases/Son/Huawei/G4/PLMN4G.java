package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class PLMN4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void PLMN4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "PLMN", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void PLMN4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "PLMN", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void PLMN4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "PLMN", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void PLMN4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "PLMN", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void PLMN4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void PLMN4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void PLMN4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void PLMN4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void PLMN4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void PLMN4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void PLMN4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void PLMN4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void PLMN4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void PLMN4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMN4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMN4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMN4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "PLMN", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void PLMN4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMN4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMN4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void PLMN4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "PLMN", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void PLMNAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "PLMN", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "PLMN", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "PLMN", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void PLMNAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "PLMN", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "PLMN", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "PLMN", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void PLMNSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "PLMN", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "PLMN", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "PLMN", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "PLMN", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "PLMN", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void PLMNCOSector() throws Exception {

        SON.son("Huawei","4G", "PLMN", "CO Sector","","");
    }


   }