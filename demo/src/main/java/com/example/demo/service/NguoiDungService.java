package com.example.demo.service;


import com.example.demo.modelrespon.LopHocDTO;
import com.example.demo.repository.HocSinhRepo;
import com.example.demo.repository.LopHocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NguoiDungService implements INguoiDungService {
    @Autowired
    private HocSinhRepo _hocSinhRepo;
    @Autowired
    private LopHocRepo _lopHocRepo;

    @Override
    public LopHocDTO layLopHocTheoId(int id) {
        return LopHocDTO.fromEntity(_lopHocRepo.findById(1l).get());
    }
}
