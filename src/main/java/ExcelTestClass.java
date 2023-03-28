import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelTestClass {

    public static void writeFile(){
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");

        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shukla"});
        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
        data.put("4", new Object[] {3, "John", "Adwards"});
        data.put("5", new Object[] {4, "Brian", "Schultz"});

        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void readFile(){
        Inventory inventory = new Inventory(1000);
        Store store = new Store("Billy Joes", inventory);
        try {
            FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            int row = 0;
            for(Row row1:sheet){
                if(row1.getCell(0).toString().equals("Starting Store")){
                    row = row1.getRowNum();
                }
            }

            for(int j = row+3; j<sheet.getLastRowNum(); j++){
               // if()
                String name = sheet.getRow(j).getCell(0).toString();
                int weight = Integer.parseInt(sheet.getRow(j).getCell(5).toString());
                String subtype = sheet.getRow(j).getCell(2).toString();
                String type = sheet.getRow(j).getCell(1).toString();
                int quant = Integer.parseInt(sheet.getRow(j).getCell(3).toString());
                double price = Double.parseDouble(sheet.getRow(j).getCell(3).toString());

                System.out.println(name+", "+type+", "+subtype+", "+quant+", "+price+", "+weight);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        readFile();
    }
}
