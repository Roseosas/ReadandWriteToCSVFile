import Util.ReadAndWrite;
import models.Products;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReadAndWriteTest {
    @Test
    public void testReadProductsFromCSV() throws IOException{
        ReadAndWrite reader= new ReadAndWrite();
        String filepath= "src/resources/filesForProducts.csv";

        List<Products> products= reader.readProductsFromCSV(filepath);
        assertNotNull(products);
        assertEquals(3,products.size());

        Products firstProduct= products.getFirst();
        assertEquals("Soda",firstProduct.getProductName());
        assertEquals(200.00, firstProduct.getUnitPrice());
        assertEquals("Beverages", firstProduct.getCategory());
        assertEquals("IN STOCK", firstProduct.getStockStatus());

        Products outOfStockProduct = products.get(2);
        assertEquals("OUT OF STOCK", outOfStockProduct.getStockStatus());

    }


}
