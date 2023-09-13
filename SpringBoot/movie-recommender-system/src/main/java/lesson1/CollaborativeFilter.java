package lesson1;

import javax.inject.Named;

@Named
//@Primary
//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollaborativeFilter implements Filter {
    public CollaborativeFilter() {
        super();
        System.out.println("collaborative filter constructor called");
    }
    public String[] getRecommendations (String movie)
    {

        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
