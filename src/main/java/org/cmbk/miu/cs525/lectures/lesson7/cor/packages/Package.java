package org.cmbk.miu.cs525.lectures.lesson7.cor.packages;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Package {
    private int packageNumber;
    private int weight;
    private boolean rushPriority;
    private boolean international;
    private boolean specialCare;
    private double contentPrice;
}
