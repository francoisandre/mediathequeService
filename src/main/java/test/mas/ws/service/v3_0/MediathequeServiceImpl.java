package test.mas.ws.service.v3_0;

import java.util.List;


import fr.xebia.extras.selma.Selma;
import test.mas.ws.vo.v2_0.Livre;
import test.mas.ws.vo.v3_0.AdaptateurV4_0_V3_0;
import test.mas.ws.vo.v3_0.Disque;

public class MediathequeServiceImpl implements IMediathequeService {

	test.mas.ws.service.v4_0.MediathequeServiceImpl next;

	public List < Livre > getLivres() {
		AdaptateurV4_0_V3_0 adaptateur = Selma.mapper(AdaptateurV4_0_V3_0.class);
		return adaptateur.adapteLivres(next.getLivres());
	}

	public List < Disque > getDisques() {
		AdaptateurV4_0_V3_0 adaptateur = Selma.mapper(AdaptateurV4_0_V3_0.class);
		return adaptateur.adapteDisques(next.getDisques());
	}
	
	public void setNext(test.mas.ws.service.v4_0.MediathequeServiceImpl next) {
		this.next = next;
	}
	
}
