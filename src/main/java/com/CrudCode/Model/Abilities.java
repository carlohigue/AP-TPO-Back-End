/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Higuerey
 */
@Entity
@Table(name="abilities")
public class Abilities {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    
    @Column(name="category",length = 50)
    private String category;
    
    @Column(name="svg",length = 10000)
    private String svg;

    @Column(name="svgcolor",length = 100)
    private String svgcolor;
    
    @Column(name="tech",length = 100)
    private String tech;
    
    @Column(name="quality",length = 20)
    private String quality;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public String getSvgcolor() {
    return svgcolor;
    }

    public void setSvgcolor(String svgcolor) {
        this.svgcolor = svgcolor;
    }
   
    
    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    
}
