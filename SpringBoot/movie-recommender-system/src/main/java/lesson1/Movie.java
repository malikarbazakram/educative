package lesson1;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode= ScopedProxyMode.TARGET_CLASS)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {

//    private Logger logger =
//            LoggerFactory.getLogger(this.getClass());
//
//    private int id;
//    private String name;
//    private String genre;
//    private String producer;
//    //for keeping track of instances created
//    private static int instances = 0;
//
//    public Movie() {
//        super();
//        instances++;
////        System.out.println("Movie constructor called " + instances + " !");
//        logger.info("In Movie constructor method");
//
//    }
//    @PostConstruct
//    private void postConstruct() {
//        //initialization code
//        logger.info("In Movie postConstruct method");
//    }
//    @PreDestroy
//    private void preDestroy() {
//        //cleanup code
//        logger.info("In Movie preDestroy method");
//    }
//
//    public static int getInstances() {
//        return Movie.instances;
//    }
}
