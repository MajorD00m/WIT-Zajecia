#include <iostream>
using std::cout;
using std::endl;
using std::cin;
///---------------------------------------------------------------------------------
void MyTest();
void PrintInt(int);
int Add(int, int);
///---------------------------------------------------------------------------------
void MyTest(){
    cout<<"\n\t\tFunkcja MyTest()\n\n";
    }
///---------------------------------------------------------------------------------
void PrintInt(int x){
    cout<<"x = "<<x;
    }
///---------------------------------------------------------------------------------
int Add(int x, int y){
/**    int sum;
    sum = x + y;
    return sum;
    */
    return x + y;
    }
///---------------------------------------------------------------------------------
///---------------------------------------------------------------------------------
int main(){
    int x =7, y = 12;

    cout<<"x = "<<Add(x,y)<<endl;
    
    PrintInt(Add(x, y));
    cout<<endl;
    return 0;
    }

    
    
    
    
    
