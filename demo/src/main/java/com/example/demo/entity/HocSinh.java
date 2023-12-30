package com.example.demo.entity;

import com.example.demo.modelrespon.HocSinhDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Table(name = "hocsinh")
//> chữ viết hoa sẽ đổi thành hoc_sinh
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HocSinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tenhocsinh")
    private String tenHocSinh;
    @Column(name = "ngaysinh")
    private LocalDate ngaySinh;
    @ManyToOne
    @JoinColumn(name = "lophocid")
    @JsonIgnore
    private LopHoc lopHoc;
}
