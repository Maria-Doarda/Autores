package com.example.autores.services;

import com.example.autores.models.AutorModel;
import com.example.autores.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public AutorModel criarAutor(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> findAll(){
        return autorRepository.findAll();
    }

    public Optional<AutorModel> buscarId(Long id){
        return autorRepository.findById(id);
    }

    public void deletar(Long id){
        autorRepository.deleteById(id);
    }
}
