package splitSheet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SheetSplitter {

	
	public static void main(String[] args) {
        String csvFile = "/home/ai/Downloads/sheetsplitter300shops.csv";
        String outputFile = "/home/ai/Downloads/shop_details_jan-24th-20251 (3)_chunks.csv";
        int chunkSize = 1000;
      

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            List<String> chunk = new ArrayList<>();
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // skip header if present
                    continue;
                }

                String[] columns = line.split(",");
                chunk.add(columns[0]); // Read only column A

                if (chunk.size() == chunkSize) {
                    // Wrap each value in quotes individually
                    List<String> quotedValues = new ArrayList<>();
                    for (String val : chunk) {
                        quotedValues.add("\"" + val + "\"");
                    }

                    String cellData = String.join(",", quotedValues); // join all quoted values
                    bw.write(cellData); // write entire chunk in one cell (A1, A2, ...)
                    bw.newLine();
                    System.out.println("Written chunk of size " + chunkSize);
                    chunk.clear();
                }
            }

            // Write remaining records
            if (!chunk.isEmpty()) {
                List<String> quotedValues = new ArrayList<>();
                for (String val : chunk) {
                    quotedValues.add("\"" + val + "\"");
                }
                String cellData = String.join(",", quotedValues);
                bw.write(cellData);
                bw.newLine();
                System.out.println("Written final chunk of size " + chunk.size());
            }

            System.out.println("Done writing CSV with chunks in column A: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



