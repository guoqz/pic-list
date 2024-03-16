package com.example.piclist.controller;

import com.example.piclist.entity.Picture;
import com.example.piclist.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Created Guoqz
 * @Date 2024-03-16 12:32
 * @Description TODO
 */

@RestController
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("list")
    List<Picture> list(@RequestParam String picName) {
        return pictureService.list(picName);
    }

}
