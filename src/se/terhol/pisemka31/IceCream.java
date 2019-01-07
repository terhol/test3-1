package se.terhol.pisemka31;

/**
 * Ice cream.
 *
 * @author Radek Oslejsek
 * @version 2010-12-18
 */
public class IceCream implements Comparable<IceCream> {
    private String nameCz;
    private String nameEn;

    /**
     * @param nameCz Unique czech name
     * @param nameEn Unique english name
     */
    public IceCream(String nameCz, String nameEn) {
        if (nameCz == null) {
            throw new NullPointerException("nameCz");
        }
        if (nameEn == null) {
            throw new NullPointerException("nameEn");
        }
        this.nameCz = nameCz;
        this.nameEn = nameEn;
    }

    /**
     * @return Czech name of ice-cream
     */
    public String getCzechName() {
        return nameCz;
    }

    /**
     * @return English name of ice-cream
     */
    public String getEnglishName() {
        return nameEn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof IceCream)) {
            return false;
        }

        return (this.nameCz.equals(((IceCream) obj).nameCz));
    }

    @Override
    public int hashCode() {
        return this.nameCz.hashCode();
    }

    @Override
    public int compareTo(IceCream iceCream) {
        return this.getCzechName().compareTo(iceCream.getCzechName());
    }
}
