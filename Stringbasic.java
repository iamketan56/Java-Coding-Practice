package com.company;

public class Stringbasic {
    static String name[] = { "efgh","abcd", "mnop","ijkl","uvwx","yz","qrst"};

    public static void main(String agrs[]) {
        int n = name.length;
        String temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (name[j].compareTo(name[i]) < 0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
                System.out.print(name[i]);
            }
        }
    }

