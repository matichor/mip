package com.engineer.repositories;

import com.engineer.entity.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GalleryRepository extends JpaRepository<Gallery, Long> {
}
