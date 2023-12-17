package net.danny.HotelReservationSystem.dao;

import net.danny.HotelReservationSystem.entity.Role;

//DAO Pattern for Role
public interface RoleDao {

    public Role findRoleByName(String roleName);

}
