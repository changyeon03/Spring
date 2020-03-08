package Search;
import org.springframework.util.StopWatch;
public class StopWatchTest {

    private StopWatch stopWatch;

    public void start() {
        stopWatch.start();
    }
    public void stop() {
        stopWatch.stop();
    }
    public void result() {
        System.out.println(stopWatch.shortSummary());
        System.out.println(stopWatch.getTotalTimeMillis());
        System.out.println(stopWatch.prettyPrint());
    }
}