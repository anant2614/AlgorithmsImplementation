package HackeEarth;

class Node1 {

	int key, height, size;
	Node1 left, right;

	Node1() {
		left = null;
		right = null;
		key = height = size = 0;
	}

	Node1(int d) {
		key = d;
		height = 1;
		size = 1;
	}
}
