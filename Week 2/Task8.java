public int totalHillWeight(int input1, int input2, int input3) {
    int totalWeight = 0;
    int currentWeight = input2; // head level weight

    for (int level = 1; level <= input1; level++) {
        totalWeight += level * currentWeight;
        currentWeight += input3; // increment weight for next level
    }

    return totalWeight;
}