
1. Find Largest Element in Array

// Method 1: Single 
int findLargest(int[] arr) {
    int max = arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i] > max) max = arr[i];
    }
    return max;
}

// Method 2: Sort Array
int findLargestBySort(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length-1];
}

// Method 3: Using Collections (Convert to Integer List)
int findLargestWithCollections(int[] arr) {
    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    return Collections.max(list);
}

Time: O(n) for methods 1 & 3, O(n log n) for sorting
Space: O(1) or O(n) for method 3

⸻

2. Find Second Largest Element

// Method 1: Sort and pick second last
int secondLargestSort(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length-2];
}

// Method 2: Two passes
int secondLargestTwoPass(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int num : arr){
        if(num > max) max = num;
    }
    for(int num : arr){
        if(num > secondMax && num < max) secondMax = num;
    }
    return secondMax;
}

// Method 3: Single pass
int secondLargestSinglePass(int[] arr) {
    int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
    for(int num : arr){
        if(num > max){
            secondMax = max;
            max = num;
        } else if(num > secondMax && num != max){
            secondMax = num;
        }
    }
    return secondMax;
}

Time: O(n) for all except sorting method which is O(n log n)
Space: O(1)

⸻

3. Check if Array is Sorted

boolean isSorted(int[] arr) {
    for(int i=0; i<arr.length-1; i++){
        if(arr[i] > arr[i+1]) return false;
    }
    return true;
}

Only one method needed here.
Time: O(n)
Space: O(1)

⸻

4. Reverse Array

// Method 1: Using extra array
int[] reverseWithExtraArray(int[] arr) {
    int n = arr.length;
    int[] rev = new int[n];
    for(int i=0; i<n; i++){
        rev[i] = arr[n-1-i];
    }
    return rev;
}

// Method 2: In-place swap with two pointers
void reverseInPlace(int[] arr) {
    int left = 0, right = arr.length - 1;
    while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++; right--;
    }
}

// Method 3: Recursion
void reverseRecursive(int[] arr, int left, int right) {
    if(left >= right) return;
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverseRecursive(arr, left+1, right-1);
}

Time: O(n)
Space: O(n) for method 1, O(1) for 2, O(n) for recursion stack in method 3

⸻

5. Left Rotate by 1 Place

// Method 1: Brute force (shift one by one)
void leftRotateByOne(int[] arr) {
    int temp = arr[0];
    for(int i=0; i<arr.length-1; i++){
        arr[i] = arr[i+1];
    }
    arr[arr.length-1] = temp;
}

// Method 2: Using extra array
int[] leftRotateByOneExtra(int[] arr) {
    int n = arr.length;
    int[] rotated = new int[n];
    for(int i=0; i<n-1; i++){
        rotated[i] = arr[i+1];
    }
    rotated[n-1] = arr[0];
    return rotated;
}

// Method 3: Using reversal
void leftRotateByOneReversal(int[] arr) {
    reverse(arr, 0, arr.length-1);
    reverse(arr, 0, arr.length-2);
}
void reverse(int[] arr, int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
    }
}

Time: O(n)
Space: O(1) except method 2 is O(n)

⸻

6. Left Rotate by D Places

// Method 1: Rotate by 1 D times
void leftRotateByDBrute(int[] arr, int d) {
    for(int i=0; i<d; i++){
        leftRotateByOne(arr);
    }
}

// Method 2: Using temp array
void leftRotateByDExtra(int[] arr, int d) {
    int n = arr.length;
    d = d % n;
    int[] temp = new int[d];
    for(int i=0; i<d; i++){
        temp[i] = arr[i];
    }
    for(int i=d; i<n; i++){
        arr[i-d] = arr[i];
    }
    for(int i=0; i<d; i++){
        arr[n-d+i] = temp[i];
    }
}

// Method 3: Reversal Algorithm
void leftRotateByDReversal(int[] arr, int d) {
    int n = arr.length;
    d = d % n;
    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);
}
void reverse(int[] arr, int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
    }
}

Time:
	•	Method 1: O(n*d) (bad for large d)
	•	Methods 2 & 3: O(n)
Space:
	•	Method 1 & 3: O(1)
	•	Method 2: O(d)

⸻

7. Move All Zeros to End

// Method 1: Extra array
int[] moveZerosExtra(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    int index = 0;
    for(int num : arr){
        if(num != 0) res[index++] = num;
    }
    // rest are zero by default
    return res;
}

// Method 2: Two pointers (in-place)
void moveZerosInPlace(int[] arr) {
    int pos = 0;
    for(int num : arr){
        if(num != 0) arr[pos++] = num;
    }
    while(pos < arr.length){
        arr[pos++] = 0;
    }
}

// Method 3: Using swap technique
void moveZerosSwap(int[] arr){
    int left = 0;
    for(int right=0; right<arr.length; right++){
        if(arr[right] != 0){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
        }
    }
}

Time: O(n)
Space: O(n) for method 1, O(1) for others

⸻

8. Remove Duplicates from Sorted Array

// Method 1: Using Set (not optimal)
int[] removeDuplicatesSet(int[] arr) {
    Set<Integer> set = new LinkedHashSet<>();
    for(int num : arr) set.add(num);
    int[] res = new int[set.size()];
    int i = 0;
    for(int num : set) res[i++] = num;
    return res;
}

// Method 2: Two pointers (in-place)
int removeDuplicatesTwoPointer(int[] arr) {
    if(arr.length == 0) return 0;
    int j = 0;
    for(int i=1; i<arr.length; i++){
        if(arr[i] != arr[j]){
            j++;
            arr[j] = arr[i];
        }
    }
    return j+1; // length of unique array
}

// Method 3: Using extra list
List<Integer> removeDuplicatesList(int[] arr){
    List<Integer> list = new ArrayList<>();
    if(arr.length == 0) return list;
    list.add(arr[0]);
    for(int i=1; i<arr.length; i++){
        if(arr[i] != arr[i-1]) list.add(arr[i]);
    }
    return list;
}

Time: O(n)
Space: O(1) for method 2, O(n) for others

⸻

9. Linear Search

// Method 1: Loop and compare
int linearSearch(int[] arr, int target) {
    for(int i=0; i<arr.length; i++){
        if(arr[i] == target) return i;
    }
    return -1;
}

// Method 2: Using built-in function (Java 8+)
int linearSearchStream(int[] arr, int target) {
    return IntStream.range(0, arr.length)
             .filter(i -> arr[i] == target)
             .findFirst()
             .orElse(-1);
}

// Method 3: Recursive (not common)
int linearSearchRecursive(int[] arr, int target, int index) {
    if(index == arr.length) return -1;
    if(arr[index] == target) return index;
    return linearSearchRecursive(arr, target, index + 1);
}

Time: O(n)
Space: O(1) or O(n) recursion stack for recursive method

⸻

10. Binary Search (sorted array only)

// Method 1: Iterative
int binarySearchIterative(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while(low <= high){
        int mid = low + (high - low) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}

// Method 2: Recursive
int binarySearchRecursive(int[] arr, int target, int low, int high) {
    if(low > high) return -1;
    int mid = low + (high - low) / 2;
    if
