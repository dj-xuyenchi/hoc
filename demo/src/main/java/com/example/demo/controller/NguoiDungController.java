package com.example.demo.controller;

import com.example.demo.entity.HocSinh;
import com.example.demo.modelrespon.HocSinhDTO;
import com.example.demo.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "nguoidung")
public class NguoiDungController {
    @Autowired
    private NguoiDungService ng;

    @GetMapping(value = "hellohien")
    public ResponseEntity<?> method() {
        return ResponseEntity.ok(ng.layLopHocTheoId(1));
    }

}
