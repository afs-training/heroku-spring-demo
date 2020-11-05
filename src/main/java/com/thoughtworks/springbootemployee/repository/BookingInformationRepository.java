package com.thoughtworks.springbootemployee.repository;

import com.thoughtworks.springbootemployee.modal.BookingInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingInformationRepository extends JpaRepository<BookingInformation, Integer> {
}