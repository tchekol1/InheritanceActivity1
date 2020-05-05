import java.util.Objects;

public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;


    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Software{" +
                " programmer='" + programmer + '\'' +
                ", platform='" + platform + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Software))
            return false;
        if (!super.equals(o))
            return false;
        Software software = (Software) o;
        return Objects.equals(this.programmer, software.programmer) &&
                Objects.equals(this.platform, software.platform) &&
                Objects.equals(this.os, software.os);
    }


}