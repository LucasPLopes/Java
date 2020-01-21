package com.linkedin.explorecali.service;

import com.linkedin.explorecali.domain.Difficulty;
import com.linkedin.explorecali.domain.Region;
import com.linkedin.explorecali.domain.Tour;
import com.linkedin.explorecali.domain.TourPackage;
import com.linkedin.explorecali.repository.TourPackageRepository;
import com.linkedin.explorecali.repository.TourRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {
    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    public Tour createTour(String title, String description, String blurb, Integer price, String duration,
            String bullets, String keywords, String tourPackageName, Difficulty difficulty, Region region) {
        TourPackage tourPackage = tourPackageRepository.findById(tourPackageName).
        orElseThrow(()->new RuntimeException("TourPackage not existes!"));
        Tour tour =new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region);

        return tourRepository.save(tour);
    }

    public long count() {
        return tourRepository.count();
    }

}