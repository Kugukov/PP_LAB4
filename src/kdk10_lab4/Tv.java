package kdk10_lab4;

public class Tv {
    
    private Integer id;       
    private TvSpecifications tvSpecifications;
    private String name;  
    private String manufacturer;

    public Tv() {
    }
    
    public Tv(Integer id) {
        this.id = id;
    }

    public Tv(Integer id, TvSpecifications tvSpecifications, String name, String manufacturer) {
        this.id = id;
        this.tvSpecifications = tvSpecifications;
        this.name = name;
        this.manufacturer = manufacturer;
    }
    
    public void setTvSpecifications(TvSpecifications tvSpecifications) {
        this.tvSpecifications = tvSpecifications;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TvSpecifications getTvSpecifications() {
        return tvSpecifications;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    
    @Override
    public String toString() {
        return "Tv=" + id + ", " + tvSpecifications + ", name=" + name + ", manufacturer=" + manufacturer;
    }
}
