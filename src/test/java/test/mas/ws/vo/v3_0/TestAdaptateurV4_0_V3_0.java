package test.mas.ws.vo.v3_0;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.mas.ws.vo.AppConfig;
import test.mas.ws.vo.v4_0.Disque;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class TestAdaptateurV4_0_V3_0 {
	
	@Autowired
	test.mas.ws.service.v3_0.MediathequeServiceImpl servicev3;
	
	@Autowired
	test.mas.ws.service.v4_0.MediathequeServiceImpl servicev4;


	@Test
	public void testAdaptation() {
		List < Disque > disquesv4 = servicev4.getDisques();

		List < test.mas.ws.vo.v3_0.Disque > disquesv3 = servicev3.getDisques();

		Assert.assertEquals(disquesv3.size(), disquesv4.size());

		for (int i = 0; i < disquesv3.size(); i++) {
			test.mas.ws.vo.v3_0.Disque disquev3 = disquesv3.get(i);
			Disque disquev4 = disquesv4.get(i);
			Assert.assertEquals(disquev3.getInterpretes().size(), disquev4.getInterpretes().size());
		}
	}

}
