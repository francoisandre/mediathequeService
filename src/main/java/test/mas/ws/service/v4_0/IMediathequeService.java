package test.mas.ws.service.v4_0;

import java.util.List;

import javax.jws.WebService;

import test.mas.ws.vo.v4_0.Disque;
import test.mas.ws.vo.v4_0.Livre;

@WebService(name = "Mediatheque", serviceName = "MediathequeService")
public interface IMediathequeService {

	List < Livre > getLivres();

	List < Disque > getDisques();

}
