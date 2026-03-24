class ResistorColor {
    int colorCode(String color) {
    String[] colorArray = colors();  // 1. Obtenir le tableau de couleurs
    
    for (int i = 0; i < colorArray.length; i++) {  // 2. Parcourir le tableau
        if (colorArray[i].equals(color)) {  // 3. Comparer chaque couleur
            return i;  // 4. Retourner l'index si trouvé
        }
    }
    
    return -1;  // 5. Retour par défaut (couleur non trouvée)
}

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new String[]{
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
        };
    }
}
