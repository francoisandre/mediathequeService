package test.mas.ws.service.v2_0;

import java.util.List;

import javax.jws.WebService;

import test.mas.ws.vo.v2_0.Livre;

@WebService(name = "Mediatheque", serviceName = "MediathequeService")
public interface IMediathequeService {

	List < Livre > getLivres();
}
