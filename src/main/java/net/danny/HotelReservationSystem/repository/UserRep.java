package net.danny.HotelReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.danny.HotelReservationSystem.entity.User;

@Repository
public interface UserRep extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    User findByUsername(String username);
}
