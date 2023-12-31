package JakubT96.springblog.models.services;

import JakubT96.springblog.models.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void create(UserDTO user, boolean isAdmin);

}
