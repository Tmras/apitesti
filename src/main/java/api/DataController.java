package api;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Tuomas on 26.2.2017.
 */

@RestController
public class DataController {

    private final AtomicLong counter = new AtomicLong();

    @ResponseBody
    @RequestMapping("/data")
    public List<Data> data() {

        Data a = new Data(counter.incrementAndGet(), "qse", "vdkgj", "fkhgg", "wfrwelw");
        Data b = new Data(counter.incrementAndGet(), "q", "v", "f", "w");
        Data c = new Data(counter.incrementAndGet(), "1", "2", "3", "4");
        Data d = new Data(counter.incrementAndGet(), "sffsf", "gdg", "gdgf", "vdgd");
        Data e = new Data(counter.incrementAndGet(), "ffsg", "sdsafsf", "sdafss", "sffsasa");
        Data f = new Data(counter.incrementAndGet(), "vdvv", "fsf", "ggsg", "sff");
        Data g = new Data(counter.incrementAndGet(), "ggggsa", "etety", "sffsaf", "fsfasds");

        List<Data> ld = new ArrayList<Data>();

        ld.add(a);
        ld.add(b);
        ld.add(c);
        ld.add(d);
        ld.add(e);
        ld.add(f);
        ld.add(g);

        return ld;
    }
}
