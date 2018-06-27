package test.mas.ws.service.v1_0;

import java.util.List;

import fr.xebia.extras.selma.Selma;
import test.mas.ws.vo.v1_0.AdaptateurV2_0_V1_0;
import test.mas.ws.vo.v1_0.Livre;

public class MediathequeServiceImpl implements IMediathequeService {

	private test.mas.ws.service.v2_0.MediathequeServiceImpl next;

	public List < Livre > getLivres() {
		AdaptateurV2_0_V1_0 adaptateur = Selma.mapper(AdaptateurV2_0_V1_0.class);
		return adaptateur.adapteLivres(next.getLivres());
	}

	
	public void setNext(test.mas.ws.service.v2_0.MediathequeServiceImpl next) {
		this.next = next;
	}
}
