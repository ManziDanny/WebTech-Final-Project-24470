package net.danny.HotelReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.danny.HotelReservationSystem.entity.Role;

@Repository
public interface RoleRep extends JpaRepository<Role, Integer> {

    Role findByName(String roleName);
}
