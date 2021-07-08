package com.example.demo.restcontrollers;

import com.example.demo.repositories.HotelesRepository;
import com.example.demo.util.Hoteles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelesRestController
{

    @Autowired
    HotelesRepository hotelesRepository;

    @GetMapping("/hoteles")
    public List<Hoteles> findAllHoteles()
    {
        return hotelesRepository.findAll();
    }

    @PostMapping("/hoteles")
    public Hoteles createHotel(@RequestBody Hoteles hoteles)
    {
        return hotelesRepository.save(hoteles);
    }

    @PutMapping("/hoteles")
    public Hoteles updateHotel(@RequestBody Hoteles hoteles)
    {
        return hotelesRepository.save(hoteles);
    }

    @DeleteMapping("/hoteles")
    public void deleteAllHoteles()
    {
        hotelesRepository.deleteAll();
    }

    @DeleteMapping("/hoteles/{id}")
    public void deleteByIdHotel(@PathVariable String id)
    {
        hotelesRepository.deleteById(id);
    }


    @GetMapping("/getHoteles/{id}")
    public Hoteles getHotelByID(@PathVariable("id") String id)
    {
        Hoteles h = hotelesRepository.findById(id).orElse(null);
        return h;
    }


}
