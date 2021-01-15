package mathsQuestions;
/*
s = abc

1. a
2. ab
3. abc
4. b
5. bc
6. c

If length of string is n, total number of substrings = n * (n+1)/2
e.g. n = 3, totalSubstrings = 3 * (3 + 1) / 2 = 12/2 = 6

s2 = "pqr"

p
pq
pqr
qr
q
r


 */
public class printAllSubstrings {
    public static void main(String[] args) {

    }

    public static void printAllSubstrings(String s, int n) {
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

            }
        }
    }
}
