✅ 1. Find Peak Element
🔹Problem:
A peak element is an element that is strictly greater than its neighbors.

Input: nums = [1,2,1,3,5,6,4]
Output: 5 (Index of 6)

🔹Logic:
Use binary search:

if nums[mid] < nums[mid+1], peak is on the right.

else, it's on the left or at mid.

🔹Java Code:
java
Copy
Edit
public int findPeakElement(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] < nums[mid + 1])
            left = mid + 1;
        else
            right = mid;
    }

    return left; // left == right
}
✅ 2. Binary Search in Sorted Array
🔹Problem:
Find the index of a target in a sorted array.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

🔹Logic:
Basic binary search — check mid, move left or right.

🔹Java Code:
java
Copy
Edit
public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }

    return -1; // not found
}
✅ 3. Find First and Last Position of Element in Sorted Array
🔹Problem:
Find start and end index of target in sorted array.

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3, 4]

🔹Logic:
Use binary search twice:

To find first occurrence.

To find last occurrence.

🔹Java Code:
java
Copy
Edit
public int[] searchRange(int[] nums, int target) {
    return new int[] {findFirst(nums, target), findLast(nums, target)};
}

int findFirst(int[] nums, int target) {
    int ans = -1, left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            ans = mid;
            right = mid - 1; // go left
        } else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return ans;
}

int findLast(int[] nums, int target) {
    int ans = -1, left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            ans = mid;
            left = mid + 1; // go right
        } else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return ans;
}
✅ 4. Search in Rotated Sorted Array
🔹Problem:
Array was sorted, then rotated. Find target.

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

🔹Logic:
Check if mid is in left-sorted or right-sorted part, adjust search.

🔹Java Code:
java
Copy
Edit
public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return mid;

        if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && target < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        } else {
            if (nums[mid] < target && target <= nums[right])
                left = mid + 1;
            else
                right = mid - 1;
        }
    }

    return -1;
}
✅ 5. Find Minimum in Rotated Sorted Array
🔹Problem:
Find the minimum element in rotated sorted array.

Input: nums = [3,4,5,1,2]
Output: 1

🔹Logic:
Use binary search. If nums[mid] > nums[right], go right.

🔹Java Code:
java
Copy
Edit
public int findMin(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[right])
            left = mid + 1;
        else
            right = mid;
    }

    return nums[left];
}
