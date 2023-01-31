package com.hashan.solid.s.solution;

import com.hashan.solid.s.problem.Role;
import com.hashan.solid.s.problem.User;

public class SecurityService {
    public boolean hasAccess(User user){
        return user.getRole() == Role.ADMIN;
    }
}
