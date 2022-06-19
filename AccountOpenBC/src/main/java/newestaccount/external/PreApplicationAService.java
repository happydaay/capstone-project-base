package newestaccount.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "PreApplicationBC", url = "${api.url.PreApplicationBC}")
public interface PreApplicationAService {
    @RequestMapping(method = RequestMethod.GET, path = "/preApplicationAS/{id}")
    public PreApplicationA getPreApplicationA(@PathVariable("id") Long id);
    // keep

}
