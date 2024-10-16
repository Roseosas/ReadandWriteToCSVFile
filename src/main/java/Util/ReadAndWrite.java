package Util;

import models.Products;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<Products> readProductsFromCSV(String filePath) throws IOException {
        List<Products> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                String productName = values[0].trim();
                double unitPrice = Double.parseDouble(values[1].trim());
                int stock = Integer.parseInt(values[2].trim());
                String category = values[3].trim();

                Products products = new Products(productName, unitPrice, stock, category, stockStatus);
                if (stock == 0) {
                    products.setStockStatus("OUT OF STOCK");
                }
                products.add(products);
            }

        }
        return products;
    }
}

