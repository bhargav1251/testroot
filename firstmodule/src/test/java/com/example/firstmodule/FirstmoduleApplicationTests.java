package com.example.firstmodule;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstmoduleApplicationTests {

	@Test
	public void contextLoads() {
	  String str = "Bhargav";
    Assert.assertTrue(str.length()>0);
    System.out.println(" this is printed");
	}
}
