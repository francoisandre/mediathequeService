package test.mas.ws.vo.v3_0;

import java.util.List;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;
import test.mas.ws.vo.v2_0.Livre;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface AdaptateurV4_0_V3_0 {

	List < Disque > adapteDisques(List < test.mas.ws.vo.v4_0.Disque > disques);

	List < Livre > adapteLivres(List < test.mas.ws.vo.v4_0.Livre > livres);

}
