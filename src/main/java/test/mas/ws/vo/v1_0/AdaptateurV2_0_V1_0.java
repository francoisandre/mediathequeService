package test.mas.ws.vo.v1_0;

import java.util.List;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface AdaptateurV2_0_V1_0 {

	List < Livre > adapteLivres(List < test.mas.ws.vo.v2_0.Livre > livres);

}
