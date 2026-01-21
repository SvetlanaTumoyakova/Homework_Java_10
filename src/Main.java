public class Main {
    public  static void main(String[] args) {
        StringLengthComparator stringCompare = new StringLengthComparator() {
            @Override
            public String compare(String a, String b) {
                return a.length() <= b.length() ? a : b;
            }
        };

        String str1 = "Собака";
        String str2 = "Кот";
        System.out.println("Первое слово: " + str1);
        System.out.println("Второе слово: " + str2);
        System.out.println("Самое короткое слово: " + stringCompare.compare(str1, str2));
    }
}
