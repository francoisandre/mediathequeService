package test.mas.ws.vo.v1_0;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.mas.ws.vo.AppConfig;
import test.mas.ws.vo.v2_0.Livre;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class TestAdaptateurV2_0_V1_0 {
	
	@Autowired
	test.mas.ws.service.v1_0.MediathequeServiceImpl servicev1;
	
	@Autowired
	test.mas.ws.service.v2_0.MediathequeServiceImpl servicev2;

	@Test
	public void testAdaptation() {
		List < Livre > livresv2 = servicev2.getLivres();
		List < test.mas.ws.vo.v1_0.Livre > livresv1 = servicev1.getLivres();

		Assert.assertEquals(livresv1.size(), livresv2.size());

		for (int i = 0; i < livresv1.size(); i++) {
			test.mas.ws.vo.v1_0.Livre livrev1 = livresv1.get(i);
			Livre livrev2 = livresv2.get(i);
			Assert.assertEquals(livrev1.getAuteur().getPrenom(), livrev2.getAuteur().getPrenom());
		}
	}

}
