package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public List<Employee> employees = null;

    public List<Employee> readCSV(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String line;
        String[] cell = null;
        employees = new ArrayList<Employee>();
        while ((line = br.readLine())!= null) {
            if (line.startsWith("s")) {
                continue;
            }
            cell = line.split(",");
            employees.add(new Employee(cell[0], cell[1], cell[2], cell[3], cell[4], Integer.parseInt(cell[5])));
        }

        fr.close();

        return employees;

        // for (Employee employee : employees) {
        //     System.out.println(employee);
        // }
    }
    
}
