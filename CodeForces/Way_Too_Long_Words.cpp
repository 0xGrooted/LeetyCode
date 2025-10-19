#include <iostream>
#include <string>
using namespace std;

int main(){
    string word = "";
    cin >> word;

    if(word.length() > 10){
        word = word[0] + to_string(word.length()-2) + word[word.length() - 1];
    }
    cout << word << endl;
    return 0;
}
