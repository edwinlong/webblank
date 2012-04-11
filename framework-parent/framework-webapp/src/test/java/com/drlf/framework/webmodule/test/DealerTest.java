package com.drlf.framework.webmodule.test;

import org.junit.Test;
import org.springside.modules.test.spring.SpringTxTestCase;

import com.drlf.framework.entity.Dealer;

public class DealerTest {

	@Test
	public void testDealer(){
		Dealer dealer = new Dealer();
		dealer.setName("dsfds");
		System.out.println(dealer.getName());
	}
	
	
}
