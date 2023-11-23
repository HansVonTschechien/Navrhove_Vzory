public class MobileFactory {

    public OS getPhone(String str){
        switch (str){
            case "Samsung" -> {
                return new Samsung();
            }
            case "IPhone" -> {
                return new IPhone();
            }
            case "Nokia" -> {
                return new Nokia();
            }
        }
        return null;
    }
}
