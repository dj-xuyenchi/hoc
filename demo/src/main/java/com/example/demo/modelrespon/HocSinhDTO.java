package com.example.demo.modelrespon;

import com.example.demo.entity.HocSinh;
import com.example.demo.entity.LopHoc;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HocSinhDTO {
    private Long id;
    private String tenHocSinh;
    private LocalDate ngaySinh;
    private LopHoc lopHoc;

    //Mapper
    public static HocSinhDTO fromEntity(HocSinh entity) {
        return new HocSinhDTO(
                entity.getId(),
                entity.getTenHocSinh(),
                entity.getNgaySinh(),
                entity.getLopHoc()
        );
    }

    public HocSinh toEntity() {
        return new HocSinh(
                this.id,
                this.tenHocSinh,
                this.ngaySinh,
                this.lopHoc
        );
    }
}
