class Acronym {
    
    private String motFinal;
    
    Acronym(String phrase) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder acronyme = new StringBuilder();
        boolean debutDeMot = true; //Le premier est tjrs le début d'un mot
        char[] asArray = phrase.toCharArray();

        for (char ch: asArray){
            if (ch == ' ' || ch == '-'){ //C'est le début d'un mot
                debutDeMot = true;
            } else if (debutDeMot == true){ 
                ch = Character.toUpperCase(ch); // debut de mot -> majuscule
                if(Character.isLetter(ch)){ //Vérifier que le début de mot est bien une lettre
                    acronyme.append(ch);
                    debutDeMot = false;
                }
            }
        }
        this.motFinal = acronyme.toString();
    }

    String get() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.motFinal;
    }

}
