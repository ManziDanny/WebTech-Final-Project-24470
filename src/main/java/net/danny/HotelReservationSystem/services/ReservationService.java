package net.danny.HotelReservationSystem.services;

import java.util.Collection;

import net.danny.HotelReservationSystem.entity.Reservation;
import net.danny.HotelReservationSystem.temp.CurrentReservation;

//Service Pattern for Reservation
public interface ReservationService {

    public Reservation getReservationForLoggedUserById(int resId);

    public Collection<Reservation> getReservationsForLoggedUser();

    public void saveOrUpdateReservation(CurrentReservation currentReservation);

    public void deleteReservation(int resId);

    public CurrentReservation reservationToCurrentReservationById(int resId);

}
