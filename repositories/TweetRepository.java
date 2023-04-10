package com.api.twiteroo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.twiteroo.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    List<Tweet> findByUsername(String username);

}
