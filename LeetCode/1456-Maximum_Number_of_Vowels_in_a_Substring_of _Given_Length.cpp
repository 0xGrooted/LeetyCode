#include <iostream>
using namespace std;

class Solution {
public:
    int maxVowels(string s, int k) {
        int currentCount = 0;
        int maxCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s[i])) {
                currentCount++;
            }
        }
        maxCount = currentCount;

        for (int i = k; i < s.size(); i++) {
            if (isVowel(s[i])) {
                currentCount++;
            }
            if (isVowel(s[i - k])) {
                currentCount--;
            }
            if (currentCount > maxCount) { maxCount = currentCount; }
            if (maxCount == k) return k;
        }
        return maxCount;
    }

private:
    bool isVowel(char c) {
        c = tolower(c); // handle uppercase letters just in case
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
};
