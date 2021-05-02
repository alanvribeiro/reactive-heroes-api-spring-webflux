package com.digitalinnovation.service;

import com.digitalinnovation.document.Heroes;
import com.digitalinnovation.dto.HeroesDTO;
import com.digitalinnovation.mapper.HeroesMapper;
import com.digitalinnovation.repository.HeroesRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeroesService {

    private final HeroesRepository heroesRepository;
    private final HeroesMapper heroesMapper = HeroesMapper.INSTANCE;

    public HeroesService(HeroesRepository heroesRepository) {
        this.heroesRepository = heroesRepository;
    }

    public Flux<Heroes> findAll() {
        return Flux.fromIterable(this.heroesRepository.findAll());
    }

    public Mono<Heroes> findByIdHero(String id) {
        return Mono.justOrEmpty(this.heroesRepository.findById(id));
    }

    public Mono<Heroes> save(Heroes heroes) {
        return Mono.justOrEmpty(this.heroesRepository.save(heroes));
    }

    public Mono<Heroes> updateHero(HeroesDTO heroesDTO) throws Exception {
        if(heroesRepository.findById(heroesDTO.getId()).isEmpty()){
            throw new Exception("Hero not found");
        }
        return Mono.justOrEmpty(this.heroesRepository.save(heroesMapper.toModel(heroesDTO)));
    }

    public Mono<Boolean> deletebyIDHero(String id) {
        heroesRepository.deleteById(id);
        return Mono.just(true);
    }

}