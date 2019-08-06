package com.engineer.controller;

import com.engineer.entity.Gallery;
import com.engineer.repositories.GalleryRepository;
import com.engineer.services.GalleryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GalleryController {
    private final GalleryRepository galleryRepository;
    private final GalleryService galleryService;

    @GetMapping("/gallery")
    public List<Gallery> getPictures() {
       return this.galleryRepository.findAll();
    }

    @PostMapping("/addimggalery")
    public void persistImage(@RequestPart("file") MultipartFile file) throws IOException {
        galleryService.persistImage(file.getBytes(), file.getOriginalFilename());
    }

    @DeleteMapping("/deleteimage")
    void removeCalendarEvent(@RequestParam Long id) {
        this.galleryRepository.delete(id);
    }
}
