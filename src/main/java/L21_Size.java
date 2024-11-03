public enum L21_Size {

    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL");

    //2 слова всегда разделяем знаком "_" !!!

    L21_Size (String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
