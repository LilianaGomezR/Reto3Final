package com.example.demo.Repositorio;

import com.example.demo.Interface.PartyroomInterface;
import com.example.demo.Modelo.Partyroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PartyroomRepository {
    @Autowired
    private PartyroomInterface partyroomCrudRepository;

        public List<Partyroom> getAll(){

            return (List<Partyroom>) partyroomCrudRepository.findAll();
    }
    public Optional<Partyroom> getPartyroom(int id){

            return partyroomCrudRepository.findById(id);
    }
    public Partyroom save(Partyroom partyroom){

            return partyroomCrudRepository.save(partyroom);
    }
  public void delete (Partyroom partyroomm){
            partyroomCrudRepository.delete(partyroomm);
  }
}
