import models.Products;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReadAndWriteTest {
    @Test
    void testReadProductsFromCSV() throws IOException{
        CSVProductReader reader= new CSVProductReader();
        String filepath= "src/resources/filesForProducts.csv";

        List<Products> products= reader.readProductsFromCSV(filepath);
        assertNotNull(products);
        assertEquals(3,products.size());

        Products firstProduct= products.get(0);

    }


}
