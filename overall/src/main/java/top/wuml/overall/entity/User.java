package top.wuml.overall.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
private Integer id;
private String account;
private String passWord;
    private String nickName;
    private String avatar;
    private String address;
    private LocalDate createTime;
}
