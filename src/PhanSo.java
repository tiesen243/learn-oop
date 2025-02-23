public class PhanSo {
  private Integer tuSo, mauSo;

  public PhanSo(Integer tuSo, Integer mauSo) {
    super();

    this.tuSo = tuSo;
    this.mauSo = mauSo;
  }

  public PhanSo() {
    this(0, 1);
  }

  public Integer getTuSo() {
    return tuSo;
  }

  public void setTuSo(Integer tuSo) {
    this.tuSo = tuSo;
  }

  public Integer getMauSo() {
    return mauSo;
  }

  public void setMauSo(Integer mauSo) {
    this.mauSo = mauSo;
  }

  public void show() {
    System.out.println(this.tuSo + this.mauSo);
  }

  @Override
  public String toString() {
    return "PhanSo [tuSo=" + tuSo + ", mauSo=" + mauSo + "]";
  }
}
