package com.example.piclist.service;

import com.example.piclist.entity.Picture;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Created Guoqz
 * @Date 2024-03-16 12:31
 * @Description TODO
 */
@Service
public class PictureService {


    public List<Picture> list(String picName) {
        return selDB().stream().filter(
                picture -> picture.getPicName().contains(picName)
        ).collect(Collectors.toList());
    }


    /**
     * 模拟数据库查询
     *
     * @return
     */
    private List<Picture> selDB() {
        List<Picture> list = new ArrayList<>();
        Picture picture = new Picture();
        picture.setId(1);
        picture.setPicName("abc");
        picture.setPath("imgs/1.jpg");
        list.add(picture);
        Picture picture2 = new Picture();
        picture2.setId(2);
        picture2.setPicName("aghh");
        picture2.setPath("imgs/2.jpg");
        list.add(picture2);
        Picture picture3 = new Picture();
        picture3.setId(3);
        picture3.setPicName("hfh");
        picture3.setPath("imgs/3.jpg");
        list.add(picture3);
        Picture picture4 = new Picture();
        picture4.setId(4);
        picture4.setPicName("urur");
        picture4.setPath("imgs/4.jpg");
        list.add(picture4);
        Picture picture5 = new Picture();
        picture5.setId(5);
        picture5.setPicName("hjgnh");
        picture5.setPath("imgs/5.jpg");
        list.add(picture5);
        Picture picture6 = new Picture();
        picture6.setId(6);
        picture6.setPicName("jfgnxf");
        picture6.setPath("imgs/6.jpg");
        list.add(picture6);
        Picture picture7 = new Picture();
        picture7.setId(7);
        picture7.setPicName("jfj");
        picture7.setPath("imgs/7.jpg");
        list.add(picture7);
        Picture picture8 = new Picture();
        picture8.setId(8);
        picture8.setPicName("ityit");
        picture8.setPath("imgs/8.jpg");
        list.add(picture8);
        Picture picture9 = new Picture();
        picture9.setId(9);
        picture9.setPicName("zsdvzdf");
        picture9.setPath("imgs/9.jpg");
        list.add(picture9);
        return list;
    }

}
