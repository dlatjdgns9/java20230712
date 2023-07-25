package pkg06Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex10HashMapApplicate {

    private static Map phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhone("친구", "진희륜", "010-1111-1111");
        addPhone("친구", "김준기", "010-2222-2222");
        addPhone("친구", "염건", "010-3333-3333");
        addPhone("친구", "임종훈", "010-4444-4444");
        addPhone("마트", "010-5555-5555");

        System.out.println(phoneBook);
        printPhoneBook(phoneBook);
    }

    private static void printPhoneBook(Map phoneBook) {
        Iterator it = phoneBook.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            Map subBook = (HashMap) entry.getValue();
            System.out.printf("== %s [%d 개] == %n", entry.getKey(), subBook.size());

            Iterator subit = subBook.entrySet().iterator();
            while (subit.hasNext()) {
                Map.Entry subEntry = (Map.Entry) subit.next();
                System.out.printf("이름: %s  /  Tel: %s\n", subEntry.getKey(), subEntry.getValue());
            }
            System.out.println();
        }
    }

    private static void addPhone(String name, String tel) {
        addPhone("기타",name, tel);
    }

    private static void addPhone(String group, String name, String tel) {
        addGroup(group);
        HashMap book = (HashMap) phoneBook.get(group);
        book.put(tel, name);
    }

    private static void addGroup(String group) {
        if (!phoneBook.containsKey(group)) {
            phoneBook.put(group, new HashMap());
        }
    }

}
