class SqueakyClean {
    //StringBuilder identifier = new StringBuilder();
    static String clean(String identifier) {
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        String texteSansEspaces = identifier.replace(" ","_");
        //return newString;


        StringBuilder resultatFinal = new StringBuilder();
        char[] asArray = texteSansEspaces.toCharArray();
        boolean tiretTrouve = false;
    
        for(char ch: asArray){

            switch (ch){
                case '4':
                    ch='a'; break;
                case '3':
                    ch='e'; break;
                case '0':
                    ch='o'; break;
                case '1':
                    ch= 'l'; break;
                case '7':
                    ch='t'; break;             
            }
            if(ch == '-'){
                tiretTrouve = true;
            }else if(tiretTrouve == true){
                ch = Character.toUpperCase(ch);
                // On vérifie avant d'ajouter !
                if (Character.isLetter(ch) || ch == '_') {
                    resultatFinal.append(ch);
                }
                tiretTrouve = false;
            }else if(tiretTrouve == false){
                // On vérifie avant d'ajouter !
                if (Character.isLetter(ch) || ch == '_') {
                    resultatFinal.append(ch);
                }
            }
        }
        return resultatFinal.toString();
    }
}
