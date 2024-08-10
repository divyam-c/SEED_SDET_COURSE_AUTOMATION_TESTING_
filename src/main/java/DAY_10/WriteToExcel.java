package DAY_10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

    String fpath = "E:\\Seed Infotech\\SEED_SDET_COURSE_AUTOMATION_TESTING\\SEED_SDET_COURSE_AUTOMATION_TESTING\\src\\main\\java\\firstExcel.xlsx";
    File file;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    public void f() {
        row = sheet.createRow(0);
        cell = row.createCell(0);
        cell.setCellValue("Divyam");
        cell = row.createCell(1);
        cell.setCellValue("Chaudhari");
    }

    public void beforeTest() throws IOException {
        file = new File(fpath);
        fos = new FileOutputStream(file);
        wb = new XSSFWorkbook();
        sheet = wb.createSheet("student_data");
    }

    public void afterTest() throws IOException {
        wb.write(fos);
        wb.close();
        fos.close();
    }

    public static void main(String[] args) {
        WriteToExcel writeToExcel = new WriteToExcel();
        try {
            writeToExcel.beforeTest();
            writeToExcel.f();
            writeToExcel.afterTest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
