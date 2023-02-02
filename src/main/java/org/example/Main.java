package org.example;

import com.aspose.cells.Workbook;

public class Main {
    public static void main(String[] args) throws Exception {
        Workbook workbook = new Workbook("src/main/resources/centrosFP2.csv");
        workbook.save("target/centrosFP2.xml");
        Workbook workbook2 = new Workbook("src/main/resources/proyectos.csv");
        workbook2.save("target/proyectos.xml");
    }
}