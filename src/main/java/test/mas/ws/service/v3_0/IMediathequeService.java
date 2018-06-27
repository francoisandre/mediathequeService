package test.mas.ws.service.v3_0;

import java.util.List;

import javax.jws.WebService;

import test.mas.ws.vo.v2_0.Livre;
import test.mas.ws.vo.v3_0.Disque;

@WebService(name = "Mediatheque", serviceName = "MediathequeService")
public interface IMediathequeService {

	List < Livre > getLivres();

	List < Disque > getDisques();
}
