package cn.hjmao.leetcode.medianoftwosortedarrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testFindMedianSortedArrays1() throws Exception {
    int[] nums1 = {1, 3};
    int[] nums2 = {2};
    double expected = 2;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test
  public void testFindMedianSortedArrays2() throws Exception {
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};
    double expected = 2.5;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }
}