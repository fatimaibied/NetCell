package Main;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {
    private Workbook workbook;


    public ExcelUtil(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(new File(filePath));
        this.workbook = WorkbookFactory.create(fis);
    }

    public String getCellData(String sheetName, int row, int column) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row rowData = sheet.getRow(row);
        Cell cell = rowData.getCell(column);
        return cell.toString();
    }

    public int getRowCount(String sheetName) {
        Sheet sheet = workbook.getSheet(sheetName);
        return sheet.getLastRowNum() + 1;
    }

    public int getColumnCount(String sheetName, int row) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row rowData = sheet.getRow(row);
        return rowData.getLastCellNum();
    }
}
