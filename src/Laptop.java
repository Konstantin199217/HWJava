public class Laptop {
    String brand;
    int obRam;
    int obHardDisk;
    String operatingSystem;
    String color;

    void setLaptop(String brand1, int obRam1, int obHardDisk1, String operatingSystem1, String color1) {
        brand = brand1;
        obRam = obRam1;
        obHardDisk = obHardDisk1;
        operatingSystem = operatingSystem1;
        color = color1;
    }


    String getBrand() {
        return brand;
    }

    int getObRam() {
        return obRam;
    }

    int getObHardDisk() {
        return obHardDisk;
    }

    String getOperatingSystem() {
        return operatingSystem;
    }

    String getColor() {
        return color;
    }

    public String toString() {
        return brand + "\n" + " Объем памяти " + obRam + " Гигабайт " + "\n" + " Объем жесткого диска  " + obHardDisk + " Гигабайт " + "\n" + " Операционная система  " + operatingSystem + "\n" + " Цвет " + color + "\n";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        if (brand.equals(laptop.brand) && obRam == laptop.obRam && obHardDisk == laptop.obHardDisk && operatingSystem.equals(laptop.operatingSystem) && color.equals(laptop.color)) {
            return true;
        } else {
            return false;
        }

    }

    public int hashCode() {
        return brand.hashCode() + obRam + obHardDisk + operatingSystem.hashCode() + color.hashCode();
    }
}
