package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Table");
        Product product1 = new Product("Chandelier");
        Product product2 = new Product("Chair");
        Item item = new Item(product , BigDecimal.valueOf(10) ,5 ,BigDecimal.valueOf(4));
        Item item1 = new Item(product1 , BigDecimal.valueOf(16) ,10 ,BigDecimal.valueOf(1));
        Item item2 = new Item(product2 , BigDecimal.valueOf(75) ,6 ,BigDecimal.valueOf(34));
        List<Item> items = List.of(item, item1, item2);
        Invoice invoice = new Invoice("Teen", items);

        invoiceDao.save(invoice);

        //When
        int invoiceId = invoice.getId();
        int productId = product.getId();
        int itemId = item.getId();

        //Then
        assertNotEquals(0, productId);
        assertNotEquals(0, invoiceId);
        assertNotEquals(0, itemId);

        //CleanUp
        invoiceDao.deleteAll();
    }
}