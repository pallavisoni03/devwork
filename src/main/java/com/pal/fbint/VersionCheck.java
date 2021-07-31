package com.pal.fbint;


/*

Given two version numbers, version1 and version2, compare them.

Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.

To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.

Return the following:

    If version1 < version2, return -1.
    If version1 > version2, return 1.
    Otherwise, return 0.


ver1: 1.1.2
ver2: 1.3.2

-1

ver1: 1.1.2
ver2: 1.1.2

0



*/


public class VersionCheck {

    static int addNumbers(int a, int b) {
        return a+b;
    }

    public static void main(String args[] ) throws Exception {
        String ver1 = "1.1.2";
        String ver2 = "1.3";
        int opt = new VersionCheck().checkVersion(ver1, ver2);
        
        System.out.println(opt);
    }
    
    public int checkVersion(String ver1, String ver2 ){
        String[] ver1Values = ver1.split("\\.");
        String[] ver2Values = ver2.split("\\.");
       // System.out.println(ver1Values.length);
        int opt = 0;
        int j = 0;
            for(int i=0; i<ver1Values.length; i++){
            	//System.out.println(Integer.parseInt(ver1Values[i]));
            	if(Integer.parseInt(ver1Values[i]) > Integer.parseInt(ver2Values[j])){
            		 opt = 1;
                     return opt;
            	}else if (Integer.parseInt(ver1Values[i]) < Integer.parseInt(ver2Values[j])) {
            		opt = -1;
                    return opt;
                    
            }    
            	j++;
       
        }
            return opt;
    }
    
}
