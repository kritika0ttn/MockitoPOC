package com.testing.Mockito;


import com.testing.Mockito.service.OrderService;
import com.testing.Mockito.service.ProductService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class MockitoPocTest {
    @Autowired
    private
    OrderService orderService;

    @Autowired
    private ProductService productService;

    @Test
    void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
        Mockito.when(productService.getProductName()).thenReturn("Honey");
        String testName = orderService.getProductName();
        Assert.assertEquals("Honey", testName);
    }
}