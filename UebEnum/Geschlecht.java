package UebEnum;

enum Geschlecht { MAENNLICH, WEIBLICH, SAECHLICH; }

enum Fall {
  NOMINATIV, GENITIV, DATIV, AKKUSATIV;
  
  private final static String[] ARTIKEL = {
    "der", "die", "das",
    "des", "der", "des",
    "dem", "der", "dem",
    "den", "die", "das",
    "ein", "eine", "ein",
    "eines", "einer", "eines",
    "einem", "einer", "einem",
    "einen", "eine", "ein"
  };
  
  public String getBestimmterArtikel(Geschlecht geschlecht) {
    return ARTIKEL[geschlecht.ordinal() + this.ordinal() * 3];
  }

  public String getUnbestimmterArtikel(Geschlecht geschlecht) {
    return ARTIKEL[12 + geschlecht.ordinal() + this.ordinal() * 3];
  }
}

