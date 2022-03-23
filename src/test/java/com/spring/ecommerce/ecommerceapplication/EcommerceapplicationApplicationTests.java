package com.spring.ecommerce.ecommerceapplication;

import com.spring.ecommerce.ecommerceapplication.entity.Address;
import com.spring.ecommerce.ecommerceapplication.entity.Admin;
import com.spring.ecommerce.ecommerceapplication.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashSet;
import java.util.Set;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class EcommerceapplicationApplicationTests {

	@Autowired
	UserRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateAdmin(){
		Admin admin1 = new Admin();
		admin1.setEmail("someshgupta.lbsim@gmail.com");
		admin1.setFirstName("somesh");
		admin1.setMiddleName("kumar");
		admin1.setLastName("gupta");
		admin1.setPassword("12345678");
		admin1.setDeleted(false);
		admin1.setExpired(false);
		admin1.setActive(true);
		admin1.setLocked(false);

		Address address1 = new Address();
		address1.setCity("muzaffarpur");
		address1.setState("bihar");
		address1.setCountry("india");
		address1.setZipcode("842001");
		address1.setAddressline("bhahwanpur chatti rewa road");
		address1.setLabel("home");

		Address address2 = new Address();
		address2.setCity("mohihari");
		address2.setState("bihar");
		address2.setCountry("india");
		address2.setZipcode("842006");
		address2.setAddressline("motihari main road");
		address2.setLabel("office");
		Set<Address> adminAddress = new HashSet<>();
		adminAddress.add(address1);
		adminAddress.add(address2);
		admin1.setAddress(adminAddress);
		repo.save(admin1);
	}

}
