package com.example.backend.Controller;

import com.example.backend.Repository.ReviewRepository;
import com.example.backend.entity.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private final ReviewRepository reviewRepository;

    @GetMapping("/getAll")
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @PostMapping("/add")
    public Review addReview(@RequestBody Review review) {
        return reviewRepository.save(review);
    }
}
