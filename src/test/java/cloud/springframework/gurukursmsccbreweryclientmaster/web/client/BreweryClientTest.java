package cloud.springframework.gurukursmsccbreweryclientmaster.web.client;

import cloud.springframework.gurukursmsccbreweryclientmaster.web.model.BeerDto;
import cloud.springframework.gurukursmsccbreweryclientmaster.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }

    @Test
    void saveNewBeer() {
        //given
        BeerDto dto = BeerDto.builder().beerName("New Beer").build();

        URI uri = client.saveNewBeer(dto);

        assertNotNull(uri);
    }

    @Test
    void updateBeer() {
        //given
        BeerDto dto = BeerDto.builder().beerName("New Beer").build();

        client.updateBeer(UUID.randomUUID(),dto);
    }

    @Test
    void setApihost() {
    }

    @Test
    void deleteBeer() {
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerDto() {
        CustomerDto dto = client.getCustomerDto(UUID.randomUUID());

        assertNotNull(dto);
    }

    @Test
    void saveNewCustomer() {
        CustomerDto dto = CustomerDto.builder().name("New Customer Name").build();

        URI uri = client.saveNewCustomer(dto);

        System.out.println(uri.toString());

        assertNotNull(uri);
    }

    @Test
    void updateCustomer() {
        CustomerDto dto = CustomerDto.builder().name("New Customer Name").build();

        client.updateCustomer(UUID.randomUUID(),dto);
    }

    @Test
    void deleteCustomer() {
        client.deleteBeer(UUID.randomUUID());
    }
}