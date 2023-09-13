package lesson1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;


//@Named
@Component
@Qualifier("CBF")
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentBasedFilter implements Filter {
//
//    public ContentBasedFilter() {
//        super();
//        System.out.println("content-based filter constructor called");
//    }
//
//
//    public String[] getRecommendations(String movie) {
//        //logic of content based filter
//        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
//    }
//
//    //for keeping track of instances created
//    private static int instances = 0;
//
//    @Autowired
//    private Movie movie;
//
//    public ContentBasedFilter() {
//        instances++;
//        System.out.println("ContentBasedFilter constructor called");
//    }
//
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public static int getInstances(){
//        return ContentBasedFilter.instances;
//    }
//private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    public ContentBasedFilter() {
//        super();
//        logger.info("In ContentBasedFilter constructor method");
//    }
//
//    @PostConstruct
//    private void postConstruct() {
//        //load movies into cache
//        logger.info("In ContentBasedFilter postConstruct method");
//    }
//
//    @PreDestroy
//    private void preDestroy() {
//        //clear movies from cache
//        logger.info("In ContentBasedFilter preDestroy method");
//    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {

        //calculate similarity between movies

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
