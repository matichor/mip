package com.engineer.services;

import com.engineer.entity.Gallery;
import com.engineer.repositories.GalleryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GalleryService {
    private final GalleryRepository galleryRepository;

    public void persistImage(byte[] image, String fileName) {
        Gallery gallery = new Gallery();
        gallery.setImages(image);
        gallery.setFileName(fileName);
        galleryRepository.save(gallery);
    }
}
