//package io.datajek.spring.basics.movierecommendersystem.lesson1;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RecommenderImplementation1
//{
//    private Filter filter;
//
//    //constructor injection
//    @Autowired
//    public RecommenderImplementation1(@Qualifier("collaborativeFilter") Filter filter) {
//        super();
//        this.filter = filter;
//        System.out.println("Constructor invoked...");
//    }
//
//
//    //use the injected filter to find recommendations
//    public String [] recommendMovies (String movie) {
//
//        //print the name of interface implementation being used
//        System.out.println("\nName of the filter in use: " + filter + "\n");
//
//        String[] results = filter.getRecommendations("Finding Dory");
//
//        return results;
//    }
//
//}