package kdk10_lab4;

public class TvSpecifications {

    private Integer id;
    private String resolution;
    private int brightness;
    private int contrast;

    public TvSpecifications() {
    }

    public TvSpecifications(String resolution, int brightness, int contrast) {
        this.resolution = resolution;
        this.brightness = brightness;
        this.contrast = contrast;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setContrast(int contrast) {
        this.contrast = contrast;
    }

    public Integer getId() {
        return id;
    }

    public String getResolution() {
        return resolution;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getContrast() {
        return contrast;
    }

    @Override
    public String toString() {
        return "TvSpecifications{" + "id=" + id + ", resolution=" + resolution + ", brightness=" + brightness + ", contrast=" + contrast + '}';
    }
}
