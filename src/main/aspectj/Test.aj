import com.rh.example.model.Dao1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect Test {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    pointcut getter(Dao1 bc): target(bc) && execution(public java.lang.String get*(..));

    after(Dao1 bc) returning(String s): getter(bc) {
        logger.info("aspectj >>> " + thisJoinPoint.getSignature().toString() + " returned " + s);
    }
}