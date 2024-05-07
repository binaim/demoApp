package demo;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {
    public Greeting load(){
        return new Greeting("Hi there! from controller");
    }
}
