package com.syntax.reviewclass13;

import com.syntax.utils.ExcelReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo02 {
    public static void main(String[] args) {
        List<Map<String,String>> excelData= ExcelReader.read("C:\\Users\\JOSE BAS GIL\\IdeaProjects\\SDETBatch132\\SDETBatch13.xlsx");
        System.out.println(excelData);
        System.out.println(excelData.get(2).get("FirstName"));
    }
}
