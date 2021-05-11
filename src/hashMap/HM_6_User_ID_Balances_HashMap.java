package hashMap;
import java.util.HashMap;
// Time O(1)
class UserList_HM{
    HashMap<Integer, Integer> m;
    UserList_HM(){
        m = new HashMap<>();
    }
    int get(int id){
        return m.get(id);
    }
    void set(int id, int balance){
        m.put(id, balance);
    }
}
public class HM_6_User_ID_Balances_HashMap {
    public static void main(String[] args) {
        UserList_HM users = new UserList_HM();
        users.set(1, 100);
        users.set(2, 2000);
        System.out.println(users.get(1));
        users.set(1, 5000);
        System.out.println(users.get(1));
    }
}
