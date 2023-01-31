public class SecurityService {
    public boolean hasAccess(User user){
        return user.getRole() == Role.ADMIN;
    }
}
