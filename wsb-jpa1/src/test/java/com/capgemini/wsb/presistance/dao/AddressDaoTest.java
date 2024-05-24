package com.capgemini.wsb.presistance.dao;

import com.capgemini.wsb.persistence.entity.AddressEntity;
import com.capgemini.wsb.persistence.dao.AddressRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AddressDaoTest {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void testShouldFindAddressById() {
        AddressEntity address = addressRepository.findById(1L).orElse(null);
        assertThat(address).isNotNull();
    }

    @Test
    public void testShouldSaveAddress() {
        AddressEntity address = new AddressEntity();
        address.setAddressLine1("Test Address Line 1");
        address.setCity("Test City");
        address.setPostalCode("00000");

        address = addressRepository.save(address);
        assertThat(address.getId()).isNotNull();
    }

    @Test
    public void testShouldSaveAndRemoveAddress() {
        AddressEntity address = new AddressEntity();
        address.setAddressLine1("Test Address Line 1");
        address.setCity("Test City");
        address.setPostalCode("00000");

        address = addressRepository.save(address);
        Long id = address.getId();
        addressRepository.deleteById(id);
        assertThat(addressRepository.findById(id).isEmpty()).isTrue();
    }
}
