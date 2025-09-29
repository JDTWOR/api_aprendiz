package com.adso.api_persona.controllers;

import com.adso.api_persona.entities.AprendizEntity;
import com.adso.api_persona.services.AprendizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/aprendiz")
public class AprendizController {
    @Autowired
    private AprendizService aprendizService;

    @PostMapping
    public void crearAprendiz(@RequestBody AprendizEntity aprendizEntity){
        aprendizService.crearAprendiz(aprendizEntity);
    }

    @GetMapping
    public List<AprendizEntity> obtenerAprendices(){
        return aprendizService.obtenerApprendices();
    }

    @GetMapping("/{id}")
    public AprendizEntity buscarPorId(@PathVariable Long id){
        return aprendizService.burcarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarAprendiz(@PathVariable Long id){
        aprendizService.eliminarAprendiz(id);
    }

    @PutMapping("/{id}")
    public AprendizEntity actualizarAprendiz(@PathVariable Long id, @RequestBody AprendizEntity aprendizEntity){
        return aprendizService.actualizarAprendiz(id, aprendizEntity);
    }

}
