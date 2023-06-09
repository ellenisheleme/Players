package com.practice.my_first_api.repositories;

import com.practice.my_first_api.entities.Player;
import org.springframework.data.repository.CrudRepository;


public interface PlayerRepository extends CrudRepository <Player , Integer> {

}

