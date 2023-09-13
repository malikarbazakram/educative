package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
@SpringBootApplication
public class MovieRecommenderSystemApplication {

//	public static void main(String[] args) {
//
//		ApplicationContext appContext = SpringApplication.run(
//				MovieRecommenderSystemApplication.class, args);
//		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		//Without Filter
//		//RecommenderImplementation1 recommender = new RecommenderImplementation1();
//
//		//With Filter
//		//RecommenderImplementation1 recommender = new RecommenderImplementation1(new ContentBasedFilter());
//
//		RecommenderImplementation1 recommender = appContext.getBean(
//												RecommenderImplementation1.class);
//		String[] result = recommender.recommendMovies("Finding Dory");
//		System.out.println(Arrays.toString(result));
//	}

//	public static void main(String[] args) {
//
//		//ApplicationContext manages the beans and dependencies
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		//RecommenderImplementation1 injects dependency using constructor
//		System.out.println("\n*************************************************");
//		System.out.println("Calling getBean() on RecommenderImplementation1");
//		RecommenderImplementation1 recommender = appContext.getBean(RecommenderImplementation1.class);
//		String[] result = recommender.recommendMovies("Finding Dory");
//		System.out.println(Arrays.toString(result));
//
//		//RecommenderImplementation2 injects dependency using setter method
//		System.out.println("\n*************************************************");
//		System.out.println("Calling getBean() on RecommenderImplementation2");
//		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
//		result = recommender2.recommendMovies("Finding Dory");
//		System.out.println(Arrays.toString(result));
//
//	}

//	public static void main(String[] args) {
//
//		//ApplicationContext manages the beans and dependencies
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		//Retrieve singleton bean from application context thrice
//		ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
//		ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
//		ContentBasedFilter cbf3= appContext.getBean(ContentBasedFilter.class);
//
//		System.out.println(cbf1);
//		System.out.println(cbf2);
//		System.out.println(cbf3);
//
//		CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
//		CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
//		CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);
//
//		System.out.println(cf1);
//		System.out.println(cf2);
//		System.out.println(cf3);
//	}

//	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(
//				MovieRecommenderSystemApplication.class, args);
//
//		//Retrieve singleton bean from application context
//		ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
//		System.out.println("\nContentBasedFilter bean with singleton scope");
//		System.out.println(filter);
//
//		//Retrieve prototype bean from the singleton bean thrice
//		Movie movie1 = filter.getMovie();
//		Movie movie2 = filter.getMovie();
//		Movie movie3 = filter.getMovie();
//
//		System.out.println("\nMovie bean with prototype scope");
//		System.out.println(movie1);
//		System.out.println(movie2);
//		System.out.println(movie3);
//
//		//Print number of instances of each bean
//		System.out.println("\nContentBasedFilter instances created: "+
//				ContentBasedFilter.getInstances());
//		System.out.println("Movie instances created: "+ Movie.getInstances());
//	}

//	public static void main(String[] args) {
//
//		//ApplicationContext manages the beans and dependencies
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		//Retrieve and print singleton bean from application context
//		ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
//		System.out.println("\nContentBasedFilter bean with singleton scope");
//		System.out.println(filter);
//
//		//Retrieve and print prototype bean from the singleton bean twice
//		Movie movie1 = filter.getMovie();
//		Movie movie2 = filter.getMovie();
//		Movie movie3 = filter.getMovie();
//
//		System.out.println("\nMovie bean with prototype scope");
//		System.out.println(movie1);
//		System.out.println(movie2);
//		System.out.println(movie3);
//
//		//Print number of instances of each bean
//		System.out.println("\nContentBasedFilter instances created: "+ ContentBasedFilter.getInstances());
//
//	}

//	public static void main(String[] args) {
//
//		ApplicationContext appContext = SpringApplication.run(
//				MovieRecommenderSystemApplication.class, args);
//
//		//use ApplicationContext to get recommender object
//		RecommenderImplementation recommender = appContext.getBean(
//				RecommenderImplementation.class);
//
//		System.out.println(recommender);
//	}

//	public static void main(String[] args) {
//
//		ApplicationContext appContext = SpringApplication.run(
//				MovieRecommenderSystemApplication.class, args);
//
//		//Retrieving singleton bean from application context
//		RecommenderImplementation recommender = appContext.getBean(
//				RecommenderImplementation.class);
//		System.out.println(recommender);
//
//		//Retrieving prototype bean from application context twice
//		Movie m1 = appContext.getBean(Movie.class);
//		System.out.println(m1);
//
//		Movie m2 = appContext.getBean(Movie.class);
//		System.out.println(m2);
//
//	}
//	public static void main(String[] args) {
//
//		//ApplicationContext manages the beans and dependencies
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		//use ApplicationContext to find which filter is being used
//		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
////
////		System.out.println(recommender);
////		System.out.println(recommender.getFilter());
//
//		//call method to get recommendations
//		String[] result = recommender.recommendMovies("Finding Dory");
//
//		//display results
//		System.out.println(Arrays.toString(result));
//	}
}
