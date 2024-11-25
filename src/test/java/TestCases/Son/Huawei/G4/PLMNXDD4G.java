package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class PLMNXDD4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void PLMNXDD4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "PLMN XDD", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void PLMNXDD4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "PLMN XDD", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void PLMNXDD4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "PLMN XDD", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void PLMNXDD4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "PLMN XDD", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void PLMNXDD4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void PLMNXDD4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void PLMNXDD4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void PLMNXDD4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void PLMNXDD4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void PLMNXDD4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void PLMNXDD4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void PLMNXDD4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void PLMNXDD4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNXDD4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNXDD4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDD4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDD4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "PLMN XDD", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDD4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDD4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNXDD4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void PLMNXDD4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void PLMNXDDAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "PLMN XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNXDDAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "PLMN XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNXDDAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "PLMN XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void PLMNXDDAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "PLMN XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNXDDAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "PLMN XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void PLMNXDDAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "PLMN XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void PLMNXDDSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNXDDSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNXDDSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDDSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDDSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "PLMN XDD", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDDSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNXDDSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void PLMNXDDCOSector() throws Exception {

        SON.son("Huawei","4G", "PLMN XDD", "CO Sector","","");
    }


   }