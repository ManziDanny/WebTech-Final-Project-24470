package net.danny.HotelReservationSystem.dao;

import java.util.Collection;
import net.danny.HotelReservationSystem.entity.Reservation;

// DAO Pattern for Reservation
public interface ReservationDao {

    public Reservation getReservationForLoggedUserById(int resId);

    public Collection<Reservation> getReservationsByUserId(int userId);

    public void saveOrUpdateReservation(Reservation reservation);

    public void deleteReservation(Reservation reservation);

}
