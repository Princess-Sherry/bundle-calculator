package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BundleComboItem {
    private int numberOfBundles;
    private int bundleUnit;
    private double subTotal;
}