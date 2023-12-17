package net.danny.HotelReservationSystem.services;

import net.danny.HotelReservationSystem.entity.User;
import net.danny.HotelReservationSystem.temp.CurrentUser;

import org.springframework.security.core.userdetails.UserDetailsService;

//Service Pattern for User
public interface UserService extends UserDetailsService {

    public User findUserByEmail(String email);

    public void saveUser(CurrentUser currentUser);

    public int getLoggedUserId();
}
