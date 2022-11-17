
package com.app.PorfotlioWalterRossi.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

@Entity
@Table(name = "acercade")
public class Acercade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_acer")
    private Long idaAcer;

    @Column(length = 255, nullable = false, name = "title_acer")
    private String titleAcer;

    @Column(length = 500, name = "info_acer", nullable = false)
    private String infoAcer;

    @Column(length = 1000, name = "img_acer", nullable = false)
    private String imgAcer;

    public Acercade() {
    }

    public Acercade(Long idaAcer, String titleAcer, String infoAcer, String imgAcer) {
        this.idaAcer = idaAcer;
        this.titleAcer = titleAcer;
        this.infoAcer = infoAcer;
        this.imgAcer = imgAcer;
    }

    public Long getIdaAcer() {
        return idaAcer;
    }

    public String getTitleAcer() {
        return titleAcer;
    }

    public String getInfoAcer() {
        return infoAcer;
    }

    public String getImgAcer() {
        return imgAcer;
    }

    public void setIdaAcer(Long idaAcer) {
        this.idaAcer = idaAcer;
    }

    public void setTitleAcer(String titleAcer) {
        this.titleAcer = titleAcer;
    }

    public void setInfoAcer(String infoAcer) {
        this.infoAcer = infoAcer;
    }

    public void setImgAcer(String imgAcer) {
        this.imgAcer = imgAcer;
    }

    
    
    
}

