package com.opps;

    public class This_KeywordVar {
        String name;
        int popularity;

        // parameterized constructor
        public This_KeywordVar(String name, int popularity) {
            this.name = name;
            this.popularity = popularity;
        }

        // Copy-Constructor
        public This_KeywordVar(This_KeywordVar b) {
            this.popularity = b.popularity;
            this.name = b.name;
        }

        public void display() {
            System.out.println("name: " + name);
            System.out.println("popularity: " + popularity + " %");
        }

        public static void main(String[] args) {
            // parameterized constructor call
            This_KeywordVar obj1 = new This_KeywordVar("JournalDev", 100);
            obj1.display();
            // Copy-Constructor call
            This_KeywordVar obj2 = new This_KeywordVar(obj1);
            obj2.display();

        }
}
