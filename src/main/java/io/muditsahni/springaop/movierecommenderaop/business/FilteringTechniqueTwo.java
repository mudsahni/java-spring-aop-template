package io.muditsahni.springaop.movierecommenderaop.business;

import io.muditsahni.springaop.movierecommenderaop.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechniqueTwo {
    @Autowired
    private User user;

    public String collaborativeFiltering() {
        return user.getUserDetails();
    }
}
