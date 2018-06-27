package test.mas.ws.service.v2_0;

import java.util.List;

import test.mas.ws.vo.v2_0.Livre;

public class MediathequeServiceImpl implements IMediathequeService {

	private test.mas.ws.service.v3_0.MediathequeServiceImpl next;

	public List < Livre > getLivres() {
		return next.getLivres();
	}
	
	public void setNext(test.mas.ws.service.v3_0.MediathequeServiceImpl next) {
		this.next = next;
	}

}
