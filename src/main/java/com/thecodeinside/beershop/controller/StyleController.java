package com.thecodeinside.beershop.controller;

import com.thecodeinside.beershop.models.Style;
import com.thecodeinside.beershop.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Operations for style resource.
 *
 * @author Wellington Pinheiro <wellington.pinheiro@gmail.com>
 */
@RestController()
@RequestMapping("/styles")
public class StyleController {

    @Autowired
    private StyleRepository styleRepository;

    @RequestMapping
    public List<Style> findAll() {
        List<Style> styles = new ArrayList<>();
        styleRepository.findAll().iterator().forEachRemaining(styles::add);

        return styles;
    }

    @RequestMapping("/{styleId}")
    public Style findById(@PathVariable Long styleId) {
        return styleRepository.findOne(styleId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody Style style) {
        return new ResponseEntity<Style>(styleRepository.save(style), HttpStatus.CREATED);
    }
}
