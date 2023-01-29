package com.coboljunkie.umc.section_6.exercise_29;
/** This class contains a method to calculate the amount of buckets of paint required for a given area
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class PaintJob {
    /** this method calculates the amount of buckets required to paint a given area
     *
     * @param width width of the area
     * @param height height of the area
     * @param areaPerBucket area a single bucket can paint
     * @param extraBuckets spare buckets to be used
     * @return amount of buckets required
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        return (int) Math.ceil((height * width) / areaPerBucket) - extraBuckets;
    }

    /** this method calculates the amount of buckets required to paint a given area
     *
     * @param width width of the area
     * @param height height of the area
     * @param areaPerBucket how much area a single bucket can paint
     * @return amount of buckets required
     */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    /** this method calculates the amount of buckets required to paint a given area
     *
     * @param area area to be painted
     * @param areaPerBucket area a single bucket can paint
     * @return amount of buckets required
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket);
    }
}