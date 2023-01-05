package dev_java.SeungSuSsameSueop.week4;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
// @Setter
// @Getter

public class DeptVO {
  int deptno;
  String dname;
  String loc;

}
