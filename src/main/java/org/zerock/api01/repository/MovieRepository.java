package org.zerock.api01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.api01.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
