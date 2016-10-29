/* 
You are a product manager and currently leading a team to develop a new product. Unfortunately,
the latest version of your product fails the quality check.
Since each version is developed based on the previous version,
all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] 
and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) 
which will return whether version is bad. Implement a function to find the first bad version.
You should minimize the number of calls to the API.
The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int lo = 0;
		int hi = n - 1;
		int mid = lo + (hi - lo) / 2;
		while (lo <= hi) {
			if (isBadVersion(mid))
				if (!isBadVersion(mid - 1))
					break;

				else {
					hi = mid - 1;
					mid = lo + (hi - lo) / 2;

				}
			else if (!isBadVersion(mid)) {
				lo = mid + 1;
				mid = lo + (hi - lo) / 2;
			}
		}

		return mid;

	}
}
