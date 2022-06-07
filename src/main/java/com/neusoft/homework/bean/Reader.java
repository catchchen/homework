package com.neusoft.homework.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MarcoReus
 * @create 2022-06-06 22:34
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("reader")
public class Reader {



    //以下是数据库字段
    private int reader_id;
    @TableField(exist = false)
    private String reader_name;
    @TableField(exist = false)
    private String reader_pwd;
}
