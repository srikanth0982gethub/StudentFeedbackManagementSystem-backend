package com.studentfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentfeedback.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
