package com.zclvct.leetcode.binarySearch;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 *  你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 *
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 *
 * 你可以通过调用   bool isBadVersion(version)   接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 *
 * 
 * 链接：https://leetcode-cn.com/problems/first-bad-version
 * 
 * @date 2021/9/18 10:23
 */
public class FirstBadVersion {

    public static int firstBadVersion(int n) {
        int low = 1;
        int higt = n;
        while (low < higt)
        {
            int mid = (higt - low)/2 + low;
            if(isBadVersion(mid))
            {
                higt = mid;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }

    static boolean isBadVersion(int version)
    {
        if(version >= 4)
        {
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }
}
