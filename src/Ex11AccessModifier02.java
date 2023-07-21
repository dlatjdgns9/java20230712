import pkg04class.Ex11AccessModifier;

public class Ex11AccessModifier02 {
    public static void main(String[] args) {
        Ex11AccessModifier am = new Ex11AccessModifier();
        System.out.println(am.publicVar);
        //System.out.println(am.protectedVar);
        //System.out.println(am.defaultVar);
        //System.out.println(am.privateVar);
    }
}


class Ex11AccessModifierChild extends Ex11AccessModifier {
    public Ex11AccessModifierChild() {
        System.out.println(publicVar);
        System.out.println(protectedVar); //다른 패키지의 자손 클래스에서 접근가능 (상속받아서 가능)
        protectedMethod();
        //System.out.println(defaultVar);
        //System.out.println(privateVar);
    }
}