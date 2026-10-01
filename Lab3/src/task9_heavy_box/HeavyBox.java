package task9_heavy_box;

public class HeavyBox {
    private String label;
    private double weightGrams;
    private String material;

    public HeavyBox(String label, double weightGrams, String material) {
        this.label        = label;
        this.weightGrams  = weightGrams;
        this.material     = material;
    }

    public String getLabel()       { return label; }
    public double getWeightGrams() { return weightGrams; }
    public String getMaterial()    { return material; }

    @Override
    public String toString() {
        return String.format("HeavyBox{label='%s', weight=%.1fг, material='%s'}",
            label, weightGrams, material);
    }
}
