package com.example.demo.modelrespon;

import com.example.demo.entity.HocSinh;
import com.example.demo.entity.LopHoc;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LopHocDTO {
    private Long id;
    private String tenLop;
    private Set<HocSinh> hocSinh;
    private Long soHocSinh;

    public static LopHocDTO fromEntity(LopHoc entity) {
        return new LopHocDTO(
                entity.getId(),
                entity.getTenLop(),
                null,
                entity.getSoHocSinh()
        );
    }

    public LopHoc toEntity() {
        return new LopHoc(
                this.id,
                this.tenLop,
                this.hocSinh,
                this.soHocSinh
        );
    }
}
