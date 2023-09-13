package lesson1;

//import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.annotation.PreDestroy;
//import javax.inject.Inject;
//import javax.inject.Named;

//@Named
@Qualifier("CF")
@Component
public class RecommenderImplementation {

    //Tight Coupling
    //public String [] recommendMovies (String movie)
    //{

    //return new String[] {"M1" , "M2" , "M3"};


    // Content Based Filter
    //ContentBasedFilter filter = new ContentBasedFilter();
    //String[]results = filter.getRecommendations(movie);
    //return results;

    // Collaborative
    //CollaborativeFilter filter = new CollaborativeFilter();
    //return filter.getRecommendations("Finding Dory");
    //}

//    //Loose Coupling
//    @Autowired
//    private Filter filter;
//    public RecommenderImplementation (Filter filter)
//    {
//        super();
//        this.filter = filter;
//    }
//
//    public String [] recommendMovies (String movie) {
//
//        //print the name of interface implementation being used
//        System.out.println
//                ("Name of the filter in use: " + filter + "\n");
//        return filter.getRecommendations("Finding Dory");
//
//        //return results;
//    }
    //    @Autowired
    //    private Filter contentBasedFilter;
    //
    //    public String[] recommendMovies(String movie) {
    //        System.out.println("\nName of the filter in use: " + contentBasedFilter + "\n");
    //        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
    //        return results;
    //
    //    }

//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Inject
//    @Qualifier("CF")
    private Filter filter;

//    @Autowired
//    public void setFilter(@Qualifier("collaborativeFilter") Filter filter) {
//        logger.info("In RecommenderImplementation setter method..dependency injection");
//        this.filter = filter;
//    }

    public Filter getFilter() {
        return filter;
    }
    public String[] recommendMovies(String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }


//    @PostConstruct
//    public void postConstruct() {
//        //initialization code goes here
//        logger.info("In RecommenderImplementation postConstruct method");
//    }
//    @PreDestroy
//    public void preDestroy() {
//        //cleanup code
//        logger.info("In RecommenderImplementation preDestroy method");
//    }
}