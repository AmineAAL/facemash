package com.catmash.backcatmash.service;

import com.catmash.backcatmash.dto.CatDto;
import com.catmash.backcatmash.dto.CatsList;
import com.catmash.backcatmash.mapper.ICatEntityDtoMapper;
import com.catmash.backcatmash.model.Cat;
import com.catmash.backcatmash.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CateService {

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private ICatEntityDtoMapper mapper;


    public CatsList getAllCats(){
        List<CatDto> list = catRepository.findAll().stream()
                .map(mapper::entityToDto)
                .sorted(Comparator.comparing(CatDto::getLikes).reversed())
                .collect(Collectors.toList());
        return new CatsList(list);
    }

    public void bashInsertionCats(List<CatDto> list) {
            List<Cat> entitiesList = list.stream().map(mapper::dtoToEntity).collect(Collectors.toList());
            entitiesList = catRepository.saveAll(entitiesList);

    }

    public CatDto update (CatDto catDto){
        Cat cat = catRepository.save(mapper.dtoToEntity(catDto));
        return mapper.entityToDto(cat);
    }
}
