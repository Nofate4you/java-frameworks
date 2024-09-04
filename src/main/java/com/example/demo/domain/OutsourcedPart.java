package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("2")
public class OutsourcedPart extends Part{
String companyName;

    public OutsourcedPart() {
        super();
        // default values set for min and max inventory
        this.setMinInventory(1);
        this.setMaxInventory(10);
    }
    // constructor for OutsourcePart
    public OutsourcedPart(String name, double price, int inv, int minInventory, int maxInventory) {
        super(name, price, inv);
        this.setMinInventory(minInventory);
        this.setMaxInventory(maxInventory);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
