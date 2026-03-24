//class Badge {
    //public String print(Integer id, String name, String department) {
      //  String first = id != null ? id.toString() : "";
        //String first = id.toString();
        //String second = name;
        //String third = department.toUpperCase();
        //String result = first == "" ? first + second + " - " + third : "["+ first +"]" + " - " + second + " - " + third;
        //return result;
   // }
//}



class Badge {
    public String print(Integer id, String name, String department) {
        // Gérer le département (null = OWNER)
        String third = department != null ? department.toUpperCase() : "OWNER";
        
        // Gérer l'ID (null = pas de préfixe)
        if (id == null) {
            return name + " - " + third;
        } else {
            return "[" + id + "] - " + name + " - " + third;
        }
    }
}