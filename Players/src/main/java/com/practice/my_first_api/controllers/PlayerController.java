package com.practice.my_first_api.controllers;


import com.practice.my_first_api.entities.Player;
import com.practice.my_first_api.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping ("/player")
public class PlayerController {

     @Autowired
   private PlayerRepository playerRepository;

     public PlayerController(PlayerRepository playerRepository)
     {
        this.playerRepository = playerRepository;
     }


   @GetMapping

   public Iterable<Player> getAllPlayers(){
      return playerRepository.findAll();

   }
   @PostMapping

    public Player createNewPlayer(@RequestBody Player player){
         return this.playerRepository.save(player);
   }


    @PutMapping("/{id}")

    public Player updatePlayer(
            @PathVariable("id") Integer id,
            @RequestBody Player p
    ) {
        Optional<Player> playerToUpdateOptional = this.playerRepository.findById(id);
        if (!playerToUpdateOptional.isPresent()) {
            return null;
        }
        Player playerToUpdate = playerToUpdateOptional.get();
        if (p.getName() != null) {
            playerToUpdate.setName(p.getName());
        }

        if (p.getAge() != null) {
            playerToUpdate.setAge(p.getAge());
        }

        if (p.getyearOfExperience() != null) {
            playerToUpdate.setyearOfExperience(p.getyearOfExperience());
        }

        if (p.getRating() != null) {
            playerToUpdate.setRating(p.getRating());
        }
        return this.playerRepository.save(playerToUpdate);

       }
    @DeleteMapping("/{id}")
    public Player deletePlayer(@PathVariable("id") Integer id) {
        Optional<Player> playerToDeleteOptional = this.playerRepository.findById(id);

        if (!playerToDeleteOptional.isPresent()) {
            return null;
        }
        Player playerToDelete = playerToDeleteOptional.get();

         this.playerRepository.delete(playerToDelete);
           return playerToDelete;

    }



}
