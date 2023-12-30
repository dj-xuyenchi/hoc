package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HocSinh implements Serializable {
  private int id;
  private String tenHocSinh;
  private LocalDateTime ngaySinh;
}
