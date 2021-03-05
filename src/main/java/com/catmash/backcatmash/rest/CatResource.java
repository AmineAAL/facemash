package com.catmash.backcatmash.rest;

import com.catmash.backcatmash.dto.CatDto;
import com.catmash.backcatmash.dto.CatsList;
import com.catmash.backcatmash.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
public class CatResource {

    @Autowired
    private CateService service;

    @RequestMapping("/")
    public ResponseEntity getCats(){
        return ResponseEntity.ok().body(service.getAllCats());
    }

    @PostMapping("/update")
    public ResponseEntity updateCat(@RequestBody CatDto cat) {
        return ResponseEntity.ok().body(service.update(cat));
    }


    @PostMapping("/create")
    public ResponseEntity createCats(@RequestBody CatsList cats) {
        if (ObjectUtils.isEmpty(cats) || CollectionUtils.isEmpty(cats.getImages())) {
            return  ResponseEntity.badRequest().body("Aucun Chat");
        } else {
            service.bashInsertionCats(cats.getImages());
            return  ResponseEntity.ok().body("Aucun Chat");
        }
    }


}
