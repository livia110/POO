#include <iostream>
#include <queue>
using namespace std;

#define M 10

class Box
{
public:
	int height;
	int	width;
	int depth;
public:
	Box()//constructorul fara paramentri
	{
		height = 0;
		width = 0;
		depth = 0;
	}
public:
	Box(int h, int w, int d) //constructorul cu paramentri
	{
		height = h;
		width = w;
		depth = d;
	}
public: void //functia de citire a datelor
	Read(){
		cout << "\n\t---Introduceti datele---" << endl;
		cout << "\tInaltimea:";
		cin >> height;
		cout << "\tLatimea:" ;
		cin >> width;
		cout << "\tAdincimea:" ;
		cin >> depth;
	}
public: void // functia de afisare a datelor
	Display() {
		cout << "\n\t---Afisarea datele---" << endl;
		cout << "\tInaltimea:" << height <<endl;
		cout << "\tLatimea:" << width << endl;
		cout << "\tAdincimea:" << depth << endl;
	}
public: int Volum_Box() {
	return height * width * depth;
}
public: int Aria_Box() {
	return 2*(height*width + height*depth+width*depth);
}
};

class  Queue
{
public:
	int *tab;// staocarea elementelor in tabel
	int nr_elem_Max;//numarul maxim  de elemente
	int prim_Elem;//primul element al cozii
	int k; // numarul de elemente din coada

public:
	Queue() {
		tab = 0;
		nr_elem_Max = 0;
		prim_Elem = 0;
		k = 0;
	}
public:
	Queue(int *t, int nr_elem, int prim, int k_e) {
		*tab = *t;
		nr_elem_Max = nr_elem;
		prim_Elem = prim;
		k = k_e;
	}
public: void //functia de citire a datelor
	Read() {
		cout << "\n\t---Introduceti datele---" << endl;
		cout << "";
}
public: void // functia de afisare a datelor
	Display() {
		cout << "\n\t---Afisarea datele---" << endl;

}

};

int main() {
	queue <int> q;
	Box b;
	int n;//numarul de cutii
	int m;//numarul de elemente in coada
	cout << "\n\tIntroduceti numarul de elemente:";
	cin >> n;// numarul de elemete
	for (int i = 0; i < n; i++)//ciclu de citire/afisare a nr elemente de le tasta
	{
		b.Read();
		b.Display();
		cout << "\n\tVolumul cutiei: "<<b.Volum_Box();
		cout << "\n\tAria cutiei: " << b.Aria_Box()<<endl;
	}

	cout << "\n\n\t---Afisarea cozii---"<<endl;
	cout << "\n\tIntroduceti numarul de elemente:";
	cin >> m;
	for (int i = 0; i < m; i++)
	{
		cout << "\tElemetele:"<<i<<endl;

		q.push(i);
	}
	cout << "\n\tMarimea cozii:" << q.size() << endl;
	for (int i = 0; i < m; i++) {
		q.pop();
	}
}
